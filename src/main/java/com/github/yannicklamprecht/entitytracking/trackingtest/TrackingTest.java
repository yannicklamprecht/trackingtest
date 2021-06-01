package com.github.yannicklamprecht.entitytracking.trackingtest;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import com.destroystokyo.paper.profile.PlayerProfile;

import io.papermc.paper.event.packet.PlayerTrackEntityEvent;

public final class TrackingTest extends JavaPlugin implements Listener {

  @Override
  public void onEnable() {
    // Plugin startup logic
    getServer().getPluginManager().registerEvents(this, this);

  }

  @Override
  public void onDisable() {
    // Plugin shutdown logic
  }


  @EventHandler
  public void onEntitySending(PlayerTrackEntityEvent playerTrackEntityEvent){
    playerTrackEntityEvent.disguiseAsPlayerWithProfile(playerTrackEntityEvent.getPlayer().getPlayerProfile(), true);
  }
}
