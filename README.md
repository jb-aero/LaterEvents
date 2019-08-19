LaterEvents
===========
An extension for [CommandHelper](https://methodscript.com/docs/3.3.3/)
which adds later binding event listeners. Normally CommandHelper only
listens for the earliest possible firing of events (in Bukkit this is
"LOWEST"). For the covered events, a latest modifiable firing and
read-only firing are listened for (Bukkit "HIGHEST" and "MONITOR"
respectively). The Read-only firing is the one that occurs after all
plugins have had a chance to modify the event and it is considered
finalized.

## Usage
- put the file in \<pluginfolder>/CommandHelper/extensions/
- bind the events as you would any other
- they have all the same capabilities of the original events, except
the read-only versions cannot be cancelled or modified
- names are normal events + abbreviated fire order
- _lm = last modifiable
- _ro = read-only

## Events
### Note:
[*See original documentation for details*](https://methodscript.com/docs/3.3.4/Event_API.html)
- player_interact_lm
- player_interact_ro
- player_interact_entity_lm
- player_interact_entity_ro
- player_interact_at_entity_lm
- player_interact_at_entity_ro
- player_login_lm
- player_login_ro
- player_join_lm
- player_join_ro
- block_break_lm
- block_break_ro
- block_place_lm
- block_place_ro
- projectile_hit_lm
- projectile_hit_ro
- entity_damage_lm
- entity_damage_ro
- entity_damage_player_lm
- entity_damage_player_ro