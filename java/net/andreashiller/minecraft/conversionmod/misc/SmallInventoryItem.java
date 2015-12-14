package net.andreashiller.minecraft.conversionmod.misc;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;

public class SmallInventoryItem extends TileEntity implements IInventory
{
	private ItemStack[] chestContents = new ItemStack[36];
	private String customName;
	private final ItemStack invItem;
	
	public SmallInventoryItem(ItemStack stack)
	{
		invItem = stack;
		if (!stack.hasTagCompound()) {
			stack.setTagCompound(new NBTTagCompound());
		}
		
		readFromNBT(stack.getTagCompound());
	}
	
	@Override
	public int getSizeInventory() 
	{
		return 27;
	}
	
	@Override
	public ItemStack getStackInSlot(int slot) 
	{
		return this.chestContents[slot];
	}
	
	@Override
	public ItemStack decrStackSize(int slot, int amount) 
	{
		if (this.chestContents[slot] != null) 
		{
			ItemStack itemstack;
			
			if(this.chestContents[slot].stackSize <= amount) 
			{
				itemstack = this.chestContents[slot];
				this.markDirty();
				return itemstack;
			} 
			else 
			{
				itemstack = this.chestContents[slot].splitStack(amount);
				if (this.chestContents[slot].stackSize == 0) 
				{
					this.chestContents[slot]  = null;
				}
				this.markDirty();
				return itemstack;
			}
		} 
		else 
		{
			return null;
		} 
	}
	
	@Override
	public ItemStack getStackInSlotOnClosing(int slot) 
	{
		if(this.chestContents[slot] != null)
		{
			ItemStack itemstack = this.chestContents[slot];
			this.chestContents[slot] = null;
			return itemstack;
		}
		else
		{
			return null;
		}
	}
	
	//@SuppressWarnings("null")
	@Override
	public void setInventorySlotContents(int slot, ItemStack itemstack) 
	{
		this.chestContents[slot] = itemstack;
		if (itemstack != null && itemstack.stackSize > this.getInventoryStackLimit())
		{
			itemstack.stackSize = this.getInventoryStackLimit();
		}
		
		this.markDirty();
	}
	
	@Override
	public String getInventoryName()
	{
		return this.hasCustomInventoryName() ? this.customName : "container.smallbag";
	}
	
	@Override
	public boolean hasCustomInventoryName()
	{
		return this.customName != null && this.customName.length() > 0;
	}
	
	public void func_145976_a (String name)
	{
		this.customName = name;
	}
	
	@Override
	public void readFromNBT(NBTTagCompound tagcompound) 
	{
		super.readFromNBT(tagcompound);
		NBTTagList nbttaglist = tagcompound.getTagList("smallinventory", 10);
		this.chestContents = new ItemStack[this.getSizeInventory()];
		if (tagcompound.hasKey("CustomName", 8))
		{
			this.customName = tagcompound.getString("CustomName");
		}
		
		for (int i = 0; i < nbttaglist.tagCount(); ++i) 
		{
			NBTTagCompound nbttagcompound1 = nbttaglist.getCompoundTagAt(i);
			int j = nbttagcompound1.getByte("Slot") & 255;
			
			if (j >= 0 && j < this.chestContents.length)
			{
				this.chestContents[j] = ItemStack.loadItemStackFromNBT(nbttagcompound1);
			}
		}
	}
	
	@Override
	public void writeToNBT(NBTTagCompound tagcompound) 
	{
		super.writeToNBT(tagcompound);
		NBTTagList nbttaglist = new NBTTagList();
		
		for (int i = 0; i < this.chestContents.length; ++i)
		{
			if(this.chestContents[i] != null)
			{
				NBTTagCompound nbttagcompound1 = new NBTTagCompound();
				nbttagcompound1.setByte("Slot", (byte)i);
				this.chestContents[i].writeToNBT(nbttagcompound1);
				nbttaglist.appendTag(nbttagcompound1);
			}
		}
		
		tagcompound.setTag("smallinventory", nbttaglist);
		
		if(this.hasCustomInventoryName())
		{
			tagcompound.setString("CustomName", this.customName);
		}
	}
	
	@Override
	public int getInventoryStackLimit()
	{
		return 64;
	}
	
	@Override
	public boolean isUseableByPlayer(EntityPlayer player)
	{
		return true;
	}
	
	public void openInventory() {}
	
	public void closeInventory() {}
	
	public boolean isItemValidForSlot(int slot, ItemStack stack)
	{
		return true;
	}
}
















