package de.deriton.perks;

import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffectType;

public class InvListener implements Listener {
    public InvListener() {
    }

    @EventHandler
    public void onClickInv(InventoryClickEvent e) {
        Player p = (Player)e.getWhoClicked();
        String dn = e.getCurrentItem().getItemMeta().getDisplayName();
        e.getClickedInventory();
        int s = e.getSlot();
        ItemMeta tmp_meta;
        ItemStack cb_itemstack;
        if (e.getCurrentItem().getType() == Material.REDSTONE && s == 2 && dn == "�cAus") {
            cb_itemstack = new ItemStack(Material.EMERALD);
            tmp_meta = cb_itemstack.getItemMeta();
            tmp_meta.setDisplayName("�aAn");
            cb_itemstack.setItemMeta(tmp_meta);
            e.getInventory().setItem(e.getSlot(), cb_itemstack);
            System.out.println("Player: " + p.getDisplayName());
            p.addPotionEffect(PotionEffectType.SATURATION.createEffect(99999, 255));
            p.setFoodLevel(19);
            e.setCancelled(true);
        } else if (e.getCurrentItem().getType() == Material.EMERALD && s == 2 && dn == "�aAn") {
            cb_itemstack = new ItemStack(Material.REDSTONE);
            tmp_meta = cb_itemstack.getItemMeta();
            tmp_meta.setDisplayName("�cAus");
            cb_itemstack.setItemMeta(tmp_meta);
            e.getInventory().setItem(e.getSlot(), cb_itemstack);
            e.setCancelled(true);
        } else if (e.getCurrentItem().getType() == Material.REDSTONE && s == 25 && dn == "�cAus") {
            cb_itemstack = new ItemStack(Material.EMERALD);
            tmp_meta = cb_itemstack.getItemMeta();
            tmp_meta.setDisplayName("�aAn");
            cb_itemstack.setItemMeta(tmp_meta);
            e.getInventory().setItem(e.getSlot(), cb_itemstack);
            System.out.println("Player: " + p.getDisplayName());
            p.addPotionEffect(PotionEffectType.SPEED.createEffect(99999, 1));
            e.setCancelled(true);
        } else if (e.getCurrentItem().getType() == Material.EMERALD && s == 25 && dn == "�aAn") {
            cb_itemstack = new ItemStack(Material.REDSTONE);
            tmp_meta = cb_itemstack.getItemMeta();
            tmp_meta.setDisplayName("�cAus");
            cb_itemstack.setItemMeta(tmp_meta);
            e.getInventory().setItem(e.getSlot(), cb_itemstack);
            p.removePotionEffect(PotionEffectType.SPEED);
            e.setCancelled(true);
        } else if (e.getCurrentItem().getType() == Material.REDSTONE && s == 7 && dn == "�cAus") {
            cb_itemstack = new ItemStack(Material.EMERALD);
            tmp_meta = cb_itemstack.getItemMeta();
            tmp_meta.setDisplayName("�aAn");
            cb_itemstack.setItemMeta(tmp_meta);
            e.getInventory().setItem(e.getSlot(), cb_itemstack);
            System.out.println("Player: " + p.getDisplayName());
            p.addPotionEffect(PotionEffectType.FAST_DIGGING.createEffect(99999, 1));
            e.setCancelled(true);
        } else if (e.getCurrentItem().getType() == Material.EMERALD && s == 7 && dn == "�aAn") {
            cb_itemstack = new ItemStack(Material.REDSTONE);
            tmp_meta = cb_itemstack.getItemMeta();
            tmp_meta.setDisplayName("�cAus");
            cb_itemstack.setItemMeta(tmp_meta);
            e.getInventory().setItem(e.getSlot(), cb_itemstack);
            p.removePotionEffect(PotionEffectType.FAST_DIGGING);
            e.setCancelled(true);
        } else if (e.getCurrentItem().getType() == Material.REDSTONE && s == 11 && dn == "�cAus") {
            cb_itemstack = new ItemStack(Material.EMERALD);
            tmp_meta = cb_itemstack.getItemMeta();
            tmp_meta.setDisplayName("�aAn");
            cb_itemstack.setItemMeta(tmp_meta);
            e.getInventory().setItem(e.getSlot(), cb_itemstack);
            System.out.println("Player: " + p.getDisplayName());
            p.addPotionEffect(PotionEffectType.JUMP.createEffect(99999, 255));
            e.setCancelled(true);
        } else if (e.getCurrentItem().getType() == Material.EMERALD && s == 11 && dn == "�aAn") {
            cb_itemstack = new ItemStack(Material.REDSTONE);
            tmp_meta = cb_itemstack.getItemMeta();
            tmp_meta.setDisplayName("�cAus");
            cb_itemstack.setItemMeta(tmp_meta);
            e.getInventory().setItem(e.getSlot(), cb_itemstack);
            p.removePotionEffect(PotionEffectType.JUMP);
            e.setCancelled(true);
        } else if (e.getCurrentItem().getType() == Material.EMERALD && s == 16 && dn == "�aAn") {
            cb_itemstack = new ItemStack(Material.REDSTONE);
            tmp_meta = cb_itemstack.getItemMeta();
            tmp_meta.setDisplayName("�cAus");
            cb_itemstack.setItemMeta(tmp_meta);
            e.getInventory().setItem(e.getSlot(), cb_itemstack);
            p.removePotionEffect(PotionEffectType.NIGHT_VISION);
            e.setCancelled(true);
        } else if (e.getCurrentItem().getType() == Material.REDSTONE && s == 16 && dn == "�cAus") {
            cb_itemstack = new ItemStack(Material.EMERALD);
            tmp_meta = cb_itemstack.getItemMeta();
            tmp_meta.setDisplayName("�aAn");
            cb_itemstack.setItemMeta(tmp_meta);
            e.getInventory().setItem(e.getSlot(), cb_itemstack);
            p.addPotionEffect(PotionEffectType.NIGHT_VISION.createEffect(99999, 255));
            e.setCancelled(true);
        } else if (e.getCurrentItem().getType() == Material.EMERALD && s == 20 && dn == "�aAn") {
            cb_itemstack = new ItemStack(Material.REDSTONE);
            tmp_meta = cb_itemstack.getItemMeta();
            tmp_meta.setDisplayName("�cAus");
            cb_itemstack.setItemMeta(tmp_meta);
            e.getInventory().setItem(e.getSlot(), cb_itemstack);
            p.removePotionEffect(PotionEffectType.FIRE_RESISTANCE);
            e.setCancelled(true);
        } else if (e.getCurrentItem().getType() == Material.REDSTONE && s == 20 && dn == "�cAus") {
            cb_itemstack = new ItemStack(Material.EMERALD);
            tmp_meta = cb_itemstack.getItemMeta();
            tmp_meta.setDisplayName("�aAn");
            cb_itemstack.setItemMeta(tmp_meta);
            e.getInventory().setItem(e.getSlot(), cb_itemstack);
            p.addPotionEffect(PotionEffectType.FIRE_RESISTANCE.createEffect(99999, 255));
            e.setCancelled(true);
        } else if (e.getCurrentItem().getType() == Material.REDSTONE && s == 13 && dn == "�cAus") {
            e.setCancelled(true);
        }

        if (e.getCurrentItem().getType() == Material.BARRIER && dn == "�4Keine Berechtigung") {
            e.setCancelled(true);
        } else if (e.getCurrentItem().getType() == Material.COOKED_BEEF && dn == "�cHunger auffüllen") {
            e.setCancelled(true);
        } else if (e.getCurrentItem().getType() == Material.DIAMOND_BOOTS && dn == "�bSchnelligkeit") {
            e.setCancelled(true);
        } else if (e.getCurrentItem().getType() == Material.GOLD_PICKAXE && dn == "�6Schneller Abbauen") {
            e.setCancelled(true);
        } else if (e.getCurrentItem().getType() == Material.FEATHER && dn == "�9Kein Fallschaden") {
            e.setCancelled(true);
        } else if (e.getCurrentItem().getType() == Material.CHEST && dn == "�eInventar nach Tod behalten") {
            e.setCancelled(true);
        } else if (e.getCurrentItem().getType() == Material.WATCH && dn == "�3Nachtsicht") {
            e.setCancelled(true);
        } else if (e.getCurrentItem().getType() == Material.WATER_BUCKET && dn == "�4Feuer Resistenz") {
            e.setCancelled(true);
        } else if (e.getCurrentItem().getType() == Material.EMERALD && dn == "�aAn") {
            e.setCancelled(true);
        } else if (e.getCurrentItem().getType() == Material.STAINED_GLASS_PANE && dn == "�9�lHier ist nichts lul") {
            e.setCancelled(true);
        }

        HumanEntity player = e.getWhoClicked();
        if (e.getInventory().getTitle().equals("�cAus") && e.getCurrentItem().getItemMeta().getDisplayName() == "�cAus") {
            e.getCurrentItem().getType();
            Material var10000 = Material.REDSTONE;
        }

    }

    private void setItem(int i, Material emerald) {
    }
}
