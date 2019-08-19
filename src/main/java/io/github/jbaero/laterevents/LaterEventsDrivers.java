package io.github.jbaero.laterevents;

import com.laytonsmith.annotations.api;
import com.laytonsmith.core.events.BindableEvent;
import com.laytonsmith.core.events.drivers.BlockEvents;
import com.laytonsmith.core.events.drivers.EntityEvents;
import com.laytonsmith.core.events.drivers.PlayerEvents;
import com.laytonsmith.core.natives.interfaces.Mixed;

public class LaterEventsDrivers
{
	@api
	public static class player_interact_lm extends PlayerEvents.player_interact {

		@Override
		public String getName() {
			return "player_interact_lm";
		}
	}

	@api
	public static class player_interact_ro extends PlayerEvents.player_interact {

		@Override
		public String getName() {
			return "player_interact_ro";
		}

		@Override
		public boolean modifyEvent(String key, Mixed value, BindableEvent event) {
			return false;
		}
	}

	@api
	public static class player_interact_entity_lm extends EntityEvents.player_interact_entity {

		@Override
		public String getName() {
			return "player_interact_entity_lm";
		}
	}

	@api
	public static class player_interact_enitty_ro extends EntityEvents.player_interact_entity {

		@Override
		public String getName() {
			return "player_interact_entity_ro";
		}

		@Override
		public boolean modifyEvent(String key, Mixed value, BindableEvent event) {
			return false;
		}
	}

	@api
	public static class player_interact_at_entity_lm extends EntityEvents.player_interact_at_entity {

		@Override
		public String getName() {
			return "player_interact_at_entity_lm";
		}
	}

	@api
	public static class player_interact_at_enitty_ro extends EntityEvents.player_interact_at_entity {

		@Override
		public String getName() {
			return "player_interact_at_entity_ro";
		}

		@Override
		public boolean modifyEvent(String key, Mixed value, BindableEvent event) {
			return false;
		}
	}

	@api
	public static class block_break_lm extends BlockEvents.block_break	{

		@Override
		public String getName() {
			return "block_break_lm";
		}
	}

	@api
	public static class block_break_ro extends BlockEvents.block_break {

		@Override
		public String getName() {
			return "block_break_ro";
		}

		@Override
		public boolean modifyEvent(String key, Mixed value, BindableEvent event) {
			return false;
		}
	}

	@api
	public static class block_place_lm extends BlockEvents.block_place	{

		@Override
		public String getName() {
			return "block_place_lm";
		}
	}

	@api
	public static class block_place_ro extends BlockEvents.block_place {

		@Override
		public String getName() {
			return "block_place_ro";
		}

		@Override
		public boolean modifyEvent(String key, Mixed value, BindableEvent event) {
			return false;
		}
	}

	@api
	public static class player_login_lm extends PlayerEvents.player_login {
		@Override
		public String getName() {
			return "player_login_lm";
		}
	}

	@api
	public static class player_login_ro extends PlayerEvents.player_login {
		@Override
		public String getName() {
			return "player_login_ro";
		}

		@Override
		public boolean modifyEvent(String key, Mixed value, BindableEvent e) {
			return false;
		}
	}

	@api
	public static class player_join_lm extends PlayerEvents.player_join {
		@Override
		public String getName() {
			return "player_join_lm";
		}
	}

	@api
	public static class player_join_ro extends PlayerEvents.player_join {
		@Override
		public String getName() {
			return "player_join_ro";
		}

		@Override
		public boolean modifyEvent(String key, Mixed value, BindableEvent e) {
			return false;
		}
	}

	@api
	public static class entity_damage_lm extends EntityEvents.entity_damage {
		@Override
		public String getName() {
			return "entity_damage_lm";
		}
	}

	@api
	public static class entity_damage_ro extends EntityEvents.entity_damage {
		@Override
		public String getName() {
			return "entity_damage_ro";
		}

		@Override
		public boolean modifyEvent(String key, Mixed value, BindableEvent e) {
			return false;
		}
	}

	@api
	public static class entity_damage_player_lm extends EntityEvents.entity_damage_player {
		@Override
		public String getName() {
			return "entity_damage_player_lm";
		}
	}

	@api
	public static class entity_damage_player_ro extends EntityEvents.entity_damage_player {
		@Override
		public String getName() {
			return "entity_damage_player_ro";
		}

		@Override
		public boolean modifyEvent(String key, Mixed value, BindableEvent e) {
			return false;
		}
	}

	@api
	public static class projectile_hit_lm extends EntityEvents.projectile_hit {
		@Override
		public String getName() {
			return "projectile_hit_lm";
		}
	}

	@api
	public static class projectile_hit_ro extends EntityEvents.projectile_hit {
		@Override
		public String getName() {
			return "projectile_hit_ro";
		}

		@Override
		public boolean modifyEvent(String key, Mixed value, BindableEvent e) {
			return false;
		}
	}
}
