package com.madpcgaming.mt.lib;

import net.minecraft.item.ItemStack;

public class Utils
{
	
	public static ItemStack consumeItem(ItemStack stack)
	{
		if (stack.stackSize == 1)
		{
			if (stack.getItem().hasContainerItem())
			{
				return stack.getItem().getContainerItemStack(stack);
			} else
			{
				return null;
			}
		} else
		{
			stack.splitStack(1);
			
			return stack;
		}
	}
	
}
