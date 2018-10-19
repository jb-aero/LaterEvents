package io.github.jbaero.laterevents;

import com.laytonsmith.abstraction.StaticLayer;
import com.laytonsmith.abstraction.bukkit.events.BukkitBlockEvents.BukkitMCBlockPlaceEvent;
import com.laytonsmith.abstraction.bukkit.events.BukkitBlockEvents.BukkitMCBlockBreakEvent;
import com.laytonsmith.abstraction.bukkit.events.BukkitEntityEvents.BukkitMCPlayerInteractEntityEvent;
import com.laytonsmith.abstraction.bukkit.events.BukkitEntityEvents.BukkitMCPlayerInteractAtEntityEvent;
import com.laytonsmith.abstraction.bukkit.events.BukkitPlayerEvents.BukkitMCPlayerLoginEvent;
import com.laytonsmith.abstraction.bukkit.events.BukkitPlayerEvents.BukkitMCPlayerJoinEvent;
import com.laytonsmith.abstraction.bukkit.events.BukkitPlayerEvents.BukkitMCPlayerInteractEvent;
import com.laytonsmith.commandhelper.CommandHelperPlugin;
import com.laytonsmith.core.events.Driver;
import com.laytonsmith.core.events.EventUtils;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerLoginEvent;

public class BukkitLaterListener implements Listener, LaterEventsExtension.LaterListener
{
	public void registerSelf() {
		Bukkit.getPluginManager().registerEvents(this, CommandHelperPlugin.self);
	}

	public void unregisterSelf() {
		HandlerList.unregisterAll(this);
	}

	@EventHandler(priority = EventPriority.HIGHEST)
	public void onPlayerInteractH(PlayerInteractEvent event) {
		BukkitMCPlayerInteractEvent e = new BukkitMCPlayerInteractEvent(event);
		EventUtils.TriggerListener(Driver.PLAYER_INTERACT, "player_interact_lm", e);
	}

	@EventHandler(priority = EventPriority.MONITOR)
	public void onPlayerInteractM(PlayerInteractEvent event) {
		BukkitMCPlayerInteractEvent e = new BukkitMCPlayerInteractEvent(event);
		EventUtils.TriggerListener(Driver.PLAYER_INTERACT, "player_interact_ro", e);
	}

	@EventHandler(priority = EventPriority.HIGHEST)
	public void onPlayerInteractEntityH(PlayerInteractEvent event) {
		BukkitMCPlayerInteractEntityEvent e = new BukkitMCPlayerInteractEntityEvent(event);
		EventUtils.TriggerListener(Driver.PLAYER_INTERACT_ENTITY, "player_interact_entity_lm", e);
	}

	@EventHandler(priority = EventPriority.MONITOR)
	public void onPlayerInteractEntityM(PlayerInteractEntityEvent event) {
		BukkitMCPlayerInteractEntityEvent e = new BukkitMCPlayerInteractEntityEvent(event);
		EventUtils.TriggerListener(Driver.PLAYER_INTERACT_ENTITY, "player_interact_entity_ro", e);
	}

	@EventHandler(priority = EventPriority.HIGHEST)
	public void onPlayerInteractAtEntityH(PlayerInteractAtEntityEvent event) {
		BukkitMCPlayerInteractAtEntityEvent e = new BukkitMCPlayerInteractAtEntityEvent(event);
		EventUtils.TriggerListener(Driver.PLAYER_INTERACT_AT_ENTITY, "player_interact_at_entity_lm", e);
	}

	@EventHandler(priority = EventPriority.MONITOR)
	public void onPlayerInteractAtEntityM(PlayerInteractAtEntityEvent event) {
		BukkitMCPlayerInteractAtEntityEvent e = new BukkitMCPlayerInteractAtEntityEvent(event);
		EventUtils.TriggerListener(Driver.PLAYER_INTERACT_AT_ENTITY, "player_interact_at_entity_ro", e);
	}

	@EventHandler(priority = EventPriority.HIGHEST)
	public void onBlockPlaceH(BlockPlaceEvent event) {
		BukkitMCBlockPlaceEvent e = new BukkitMCBlockPlaceEvent(event);
		EventUtils.TriggerListener(Driver.BLOCK_PLACE, "block_place_lm", e);
	}

	@EventHandler(priority = EventPriority.MONITOR)
	public void onBlockPlaceM(BlockPlaceEvent event) {
		BukkitMCBlockPlaceEvent e = new BukkitMCBlockPlaceEvent(event);
		EventUtils.TriggerListener(Driver.BLOCK_PLACE, "block_place_ro", e);
	}

	@EventHandler(priority = EventPriority.HIGHEST)
	public void onBlockBreakH(BlockBreakEvent event) {
		BukkitMCBlockBreakEvent e = new BukkitMCBlockBreakEvent(event);
		EventUtils.TriggerListener(Driver.BLOCK_BREAK, "block_break_lm", e);
	}

	@EventHandler(priority = EventPriority.MONITOR)
	public void onBlockBreakM(BlockBreakEvent event) {
		BukkitMCBlockBreakEvent e = new BukkitMCBlockBreakEvent(event);
		EventUtils.TriggerListener(Driver.BLOCK_BREAK, "block_break_ro", e);
	}

	@EventHandler(priority = EventPriority.HIGHEST)
	public void onPlayerLoginH(PlayerLoginEvent event) {
		BukkitMCPlayerLoginEvent e = new BukkitMCPlayerLoginEvent(event);
		EventUtils.TriggerListener(Driver.PLAYER_LOGIN, "player_login_lm", e);
	}

	@EventHandler(priority = EventPriority.MONITOR)
	public void onPlayerLoginM(PlayerLoginEvent event) {
		BukkitMCPlayerLoginEvent e = new BukkitMCPlayerLoginEvent(event);
		EventUtils.TriggerListener(Driver.PLAYER_LOGIN, "player_login_ro", e);
	}

	@EventHandler(priority = EventPriority.HIGHEST)
	public void onPlayerJoinH(PlayerJoinEvent event) {
		BukkitMCPlayerJoinEvent e = new BukkitMCPlayerJoinEvent(event);
		EventUtils.TriggerListener(Driver.PLAYER_JOIN, "player_join_lm", e);
	}

	@EventHandler(priority = EventPriority.MONITOR)
	public void onPlayerJoinM(PlayerJoinEvent event) {
		BukkitMCPlayerJoinEvent e = new BukkitMCPlayerJoinEvent(event);
		EventUtils.TriggerListener(Driver.PLAYER_JOIN, "player_join_ro", e);
	}
}
