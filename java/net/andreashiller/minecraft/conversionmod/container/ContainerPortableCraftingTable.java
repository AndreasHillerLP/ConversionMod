package net.andreashiller.minecraft.conversionmod.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryCraftResult;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.world.World;

public class ContainerPortableCraftingTable extends Container {

	public InventoryCrafting craftMatrix;
	public IInventory craftResult;
	public IInventory chestInventory;
	private World worldObj;
	private int posX;
	private int posY;
	private int posZ;
	
	public ContainerPortableCraftingTable(EntityPlayer player) {
	
		
		craftMatrix = new InventoryCrafting(this, 3, 3);
		craftResult = new InventoryCraftResult();
		chestInventory = new InventoryPlayer(player);
		
		this.addSlotToContainer(new SlotCrafting(player, craftMatrix, craftResult, 0, 124, 35));
		
		for (int i = 0; i < 3; i++) {
			for (int k = 0; k < 3; k++) {
				 this.addSlotToContainer(new Slot(this.craftMatrix, k + i * 3, 30 + k * 18, 17 + i * 18));
			}
		}
		
		for (int i = 0; i < 3; i++)
        {
            for (int k = 0; k < 9; k++)
            {
                this.addSlotToContainer(new Slot(player.inventory, k + i * 9 + 9, 8 + k * 18, 84 + i * 18));
            }
        }
		
		for (int i = 0; i < 9; i++)
        {
            this.addSlotToContainer(new Slot(player.inventory, i, 8 + i * 18, 142));
        }
		

        this.onCraftMatrixChanged(this.craftMatrix);
		
	}
	
	public ItemStack transferStackInSlot(EntityPlayer player, int slotid)
    {
        ItemStack itemstack = null;
        Slot slot = (Slot)this.inventorySlots.get(slotid);

        if (slot != null && slot.getHasStack())
        {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            if (slotid == 0)
            {
                if (!this.mergeItemStack(itemstack1, 10, 46, true))
                {
                    return null;
                }

                slot.onSlotChange(itemstack1, itemstack);
            }
            else if (slotid >= 10 && slotid < 37)
            {
                if (!this.mergeItemStack(itemstack1, 37, 46, false))
                {
                    return null;
                }
            }
            else if (slotid >= 37 && slotid < 46)
            {
                if (!this.mergeItemStack(itemstack1, 10, 37, false))
                {
                    return null;
                }
            }
            else if (!this.mergeItemStack(itemstack1, 10, 46, false))
            {
                return null;
            }

            if (itemstack1.stackSize == 0)
            {
                slot.putStack((ItemStack)null);
            }
            else
            {
                slot.onSlotChanged();
            }

            if (itemstack1.stackSize == itemstack.stackSize)
            {
                return null;
            }

            slot.onPickupFromSlot(player, itemstack1);
        }

        return itemstack;
    }
	
	public void onContainerClosed(EntityPlayer player)
    {
        super.onContainerClosed(player);
        

            for (int i = 0; i < 9; ++i)
            {
                ItemStack itemstack = this.craftMatrix.getStackInSlotOnClosing(i);

                if (itemstack != null)
                {
                    player.dropPlayerItemWithRandomChoice(itemstack, false);
                }
            }
    }
	
	public void onCraftMatrixChanged(IInventory invPlayer)
    {
        this.craftResult.setInventorySlotContents(0, CraftingManager.getInstance().findMatchingRecipe(this.craftMatrix, this.worldObj));
    }
	
	@Override
	public boolean canInteractWith(EntityPlayer player) {
		// TODO Auto-generated method stub
		return true;
	}	
}
