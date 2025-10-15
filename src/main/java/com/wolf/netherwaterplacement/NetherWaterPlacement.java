package com.wolf.netherwaterplacement;

import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBucketEmptyEvent;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * NetherWaterPlacement Plugin
 * 
 * @author Wolf
 * @telegram https://t.me/zxzniktozxz
 * @version 1.0.0
 * @date Четверг, 16 окт. Мск 00:02
 */
public class NetherWaterPlacement extends JavaPlugin implements Listener {
    
    private String permission;
    
    @Override
    public void onEnable() {
        saveDefaultConfig();
        permission = getConfig().getString("permission", "netherwaterplacement.place");
        getServer().getPluginManager().registerEvents(this, this);
        
        getLogger().info("=============================================");
        getLogger().info("NetherWaterPlacement v1.0.0 включён!");
        getLogger().info("Автор: Wolf | TG: https://t.me/zxzniktozxz");
        getLogger().info("Право доступа: " + permission);
        getLogger().info("=============================================");
    }
    
    @Override
    public void onDisable() {
        getLogger().info("NetherWaterPlacement v1.0.0 выключен!");
        getLogger().info("Автор: Wolf | TG: https://t.me/zxzniktozxz");
    }
    
    @EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
    public void onBucketEmpty(PlayerBucketEmptyEvent event) {
        Player player = event.getPlayer();
        Material bucket = event.getBucket();
        
        if (bucket != Material.WATER_BUCKET) {
            return;
        }
        
        if (player.getWorld().getEnvironment() != World.Environment.NETHER) {
            return;
        }
        
        if (player.hasPermission(permission)) {
            Block clickedBlock = event.getBlockClicked();
            Block waterBlock = clickedBlock.getRelative(event.getBlockFace());
            
            getServer().getScheduler().runTask(this, () -> {
                waterBlock.setType(Material.WATER);
            });
        }
    }
}
