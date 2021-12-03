package de.deriton.perks;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffectType;

public class command implements CommandExecutor {
    Inventory inv = null;

    public command() {
    }

    @javax.annotation.Nullable
    public ItemMeta getItemMeta() {
        return null;
    }

    public boolean hasItemMeta() {
        return true;
    }

    private void sleep(int t) {
        try {
            Thread.sleep((long)t);
        } catch (InterruptedException var3) {
            var3.printStackTrace();
        }

    }

    private void createInventory(Player player) {
        Inventory inv = Bukkit.getServer().createInventory((InventoryHolder)null, 45, "ßaßlPerks");
        this.setMyItem(1, inv, player, "perks.open", (PotionEffectType)null, Material.COOKED_BEEF, "ßcHunger auff√ºllen", (Material)null, (String)null);
        this.setMyItem(2, inv, player, "perks.Hunger", PotionEffectType.SATURATION, Material.EMERALD, "ßaAn", Material.REDSTONE, "ßcAus");
        this.setMyItem(0, inv, player, "perks.open", (PotionEffectType)null, Material.STAINED_GLASS_PANE, "ß9ßlHier ist nichts lul", (Material)null, (String)null);
        this.setMyItem(24, inv, player, "perks.open", (PotionEffectType)null, Material.DIAMOND_BOOTS, "ßbSchnelligkeit", (Material)null, (String)null);
        this.setMyItem(25, inv, player, "perks.Schnelligkeit", PotionEffectType.SPEED, Material.EMERALD, "ßaAn", Material.REDSTONE, "ßcAus");
        this.setMyItem(6, inv, player, "perks.open", (PotionEffectType)null, Material.GOLD_PICKAXE, "ß6Schneller Abbauen", (Material)null, (String)null);
        this.setMyItem(7, inv, player, "perks.SchnellerAbbauen", PotionEffectType.FAST_DIGGING, Material.EMERALD, "ßaAn", Material.REDSTONE, "ßcAus");
        this.setMyItem(10, inv, player, "perks.open", (PotionEffectType)null, Material.FEATHER, "ß9Kein Fallschaden", (Material)null, (String)null);
        this.setMyItem(11, inv, player, "perks.KeinFallschaden", PotionEffectType.JUMP, Material.EMERALD, "ßaAn", Material.REDSTONE, "ßcAus");
        this.setMyItem(15, inv, player, "perks.open", (PotionEffectType)null, Material.WATCH, "ß3Nachtsicht", (Material)null, (String)null);
        this.setMyItem(16, inv, player, "perks.Nachtsicht", PotionEffectType.NIGHT_VISION, Material.EMERALD, "ßaAn", Material.REDSTONE, "ßcAus");
        this.setMyItem(19, inv, player, "perks.open", (PotionEffectType)null, Material.WATER_BUCKET, "ß4Feuer Resistenz", (Material)null, (String)null);
        this.setMyItem(20, inv, player, "perks.FeuerResistenz", PotionEffectType.FIRE_RESISTANCE, Material.EMERALD, "ßaAn", Material.REDSTONE, "ßcAus");
        player.openInventory(inv);
    }

    private void setMyItem(int aPos, Inventory aInv, Player aPlayer, String aPerks, PotionEffectType aEffect, Material aMatOn, String aTextOn, Material aMatOff, String aTextOff) {
        ItemStack tmp_itemstack;
        String tmp_displayname;
        if (aPlayer.hasPermission(aPerks) || aPlayer.hasPermission("*")) {
            if (aEffect != null && !aPlayer.hasPotionEffect(aEffect)) {
                tmp_itemstack = new ItemStack(aMatOff);
                tmp_displayname = aTextOff;
            } else {
                tmp_itemstack = new ItemStack(aMatOn);
                tmp_displayname = aTextOn;
            }
        } else {
            tmp_itemstack = new ItemStack(Material.BARRIER);
            tmp_displayname = "ß4Keine Berechtigung";
        }

        ItemMeta tmp_meta = tmp_itemstack.getItemMeta();
        tmp_meta.setDisplayName(tmp_displayname);
        tmp_itemstack.setItemMeta(tmp_meta);
        aInv.setItem(aPos, tmp_itemstack);
    }

    private int setItemMeta(String string) {
        return 0;    }

    private int setDisplayName(String string) {
        return 0;
    }

    private Object getDisplayName(String string) {
        return null;
    }

	@Override
	public boolean onCommand(CommandSender sender, Command arg1, String arg2, String[] arg3) {
		Player p = (Player) sender;
		createInventory(p);
		return false;
	}
}
