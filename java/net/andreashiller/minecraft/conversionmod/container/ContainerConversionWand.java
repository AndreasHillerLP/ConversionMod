package net.andreashiller.minecraft.conversionmod.container;

import net.andreashiller.minecraft.conversionmod.items.ItemConversionWand;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryCraftResult;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerConversionWand extends Container {
	
	public IInventory changeResult;
	public IInventory chestInventory;

	public ContainerConversionWand(EntityPlayer player) {
		//changeResult = new InventoryCraftResult();
		//chestInventory = new InventoryPlayer(player);
		//changeResult.setInventorySlotContents(0, new ItemStack(ItemConversionWand.curBlock, 1, ItemConversionWand.curBlockMeta));
		//this.addSlotToContainer(new Slot(changeResult, 0, 152, 22));
		
		for (int i = 0; i < 3; i++)
        {
            for (int k = 0; k < 9; k++)
            {
                this.addSlotToContainer(new Slot(player.inventory, k + i * 9 + 9, 8 + k * 18, 78 + i * 18));
            }
        }
		
		for (int i = 0; i < 9; i++)
        {
            this.addSlotToContainer(new Slot(player.inventory, i, 8 + i * 18, 135));
        }
	}

	@Override
	public boolean canInteractWith(EntityPlayer player) {
		return true;
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
            	return null;
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
	
}
