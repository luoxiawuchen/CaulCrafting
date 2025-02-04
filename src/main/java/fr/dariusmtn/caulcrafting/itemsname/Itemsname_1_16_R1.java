package fr.dariusmtn.caulcrafting.itemsname;

import org.bukkit.craftbukkit.v1_16_R1.inventory.CraftItemStack;
import org.bukkit.inventory.ItemStack;

public class Itemsname_1_16_R1 implements Itemsname {

    @Override
    public String getItemStackName(ItemStack stack){

        String name = "";
        int amt = stack.getAmount();

        try {
            name =  CraftItemStack.asNMSCopy(stack).getName().getString();
        } catch (Exception e) {
            name = stack.getType().toString();
        }

        if(amt > 1)
            name += " §3x " + amt;

        return name;
    }

}
