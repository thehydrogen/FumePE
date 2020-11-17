/*
 * MIT License
 *
 * Copyright (c) 2020 retrooper
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package dev.fume.packetevents.v1_7.packettype;

import java.util.HashMap;
import java.util.Map;

public class PacketType {
    public static class Status {
        public static final Map<Class<?>, Byte> packetIds = new HashMap<>();
        public static final byte IN_START = 0, PING = 1, PONG = 2, SERVER_INFO = 3;

        public static void init() {
            packetIds.put(PacketTypeClasses.Status.IN_START, IN_START);
            packetIds.put(PacketTypeClasses.Status.PING, PING);
            packetIds.put(PacketTypeClasses.Status.PONG, PONG);
            packetIds.put(PacketTypeClasses.Status.SERVER_INFO, SERVER_INFO);
        }
    }

    public static class Login {
        public static final Map<Class<?>, Byte> packetIds = new HashMap<>();
        public static final byte HANDSHAKE = 0,
                IN_CUSTOM_PAYLOAD = 1, OUT_CUSTOM_PAYLOAD = 2, IN_START = 3, IN_ENCRYPTION_BEGIN = 4,
                DISCONNECT = 5, OUT_ENCRYPTION_BEGIN = 6, OUT_SUCCESS = 7;

        public static void init() {
            packetIds.put(PacketTypeClasses.Login.HANDSHAKE, HANDSHAKE);
            packetIds.put(PacketTypeClasses.Login.IN_CUSTOM_PAYLOAD, IN_CUSTOM_PAYLOAD);
            packetIds.put(PacketTypeClasses.Login.OUT_CUSTOM_PAYLOAD, OUT_CUSTOM_PAYLOAD);
            packetIds.put(PacketTypeClasses.Login.IN_START, IN_START);
            packetIds.put(PacketTypeClasses.Login.IN_ENCRYPTION_BEGIN, IN_ENCRYPTION_BEGIN);
            packetIds.put(PacketTypeClasses.Login.DISCONNECT, DISCONNECT);
            packetIds.put(PacketTypeClasses.Login.OUT_ENCRYPTION_BEGIN, OUT_ENCRYPTION_BEGIN);
            packetIds.put(PacketTypeClasses.Login.OUT_SUCCESS, OUT_SUCCESS);
        }
    }

    public static class Client {
        private static final String prefix = "PacketPlayIn";
        public static final Map<Class<?>, String> packetIds = new HashMap<>();
        public static final String TELEPORT_ACCEPT = prefix + "TeleportAccept",
                TILE_NBT_QUERY = prefix + "TitleNBTQuery", DIFFICULTY_CHANGE = prefix + "DifficultyChange", CHAT = prefix + "Chat",
                CLIENT_COMMAND = prefix + "ClientCommand", SETTINGS = prefix + "Settings", TAB_COMPLETE = prefix + "TabComplete",
                TRANSACTION = prefix + "Transaction", ENCHANT_ITEM = prefix + "EnchantItem", WINDOW_CLICK = prefix + "WindowClick",
                CLOSE_WINDOW = prefix + "CloseWindow", CUSTOM_PAYLOAD = prefix + "CustomPayload", B_EDIT = prefix + "BEdit",
                ENTITY_NBT_QUERY = prefix + "EntityNBTQuery", USE_ENTITY = prefix + "UseEntity", JIGSAW_GENERATE = prefix + "JigsawGenerate",
                KEEP_ALIVE = prefix + "KeepAlive", DIFFICULTY_LOCK = prefix + "DifficultyLock", POSITION = prefix + "Position",
                POSITION_LOOK = prefix + "PositionLook", LOOK = prefix + "Look", FLYING = prefix + "Flying", VEHICLE_MOVE = prefix + "VehicleMove",
                BOAT_MOVE = prefix + "BoatMove", PICK_ITEM = prefix + "PickItem", AUTO_RECIPE = prefix + "AutoRecipe",
                ABILITIES = prefix + "Abilities", BLOCK_DIG = prefix + "BlockDig", ENTITY_ACTION = prefix + "EntityAction",
                STEER_VEHICLE = prefix + "SteerVehicle", RECIPE_DISPLAYED = prefix + "RecipeDisabled", ITEM_NAME = prefix + "ItemName",
                RESOURCE_PACK_STATUS = prefix + "ResourcePackStatus", ADVANCEMENTS = prefix + "Advancements",
                TR_SEL = prefix + "TRSel", BEACON = prefix + "Beacon", HELD_ITEM_SLOT = prefix + "HeldItemSlot",
                SET_COMMAND_BLOCK = prefix + "SetCommandBlock", SET_COMMAND_MINECART = prefix + "SetCommandMinecart",
                SET_CREATIVE_SLOT = prefix + "SetCreativeSlot", SET_JIGSAW = prefix + "SetJigsaw", STRUCT = prefix + "Struct",
                UPDATE_SIGN = prefix + "UpdateSign", ARM_ANIMATION = prefix + "ArmAnimation", SPECTATE = prefix + "Spectate",
                USE_ITEM = prefix + "UseItem", BLOCK_PLACE = prefix + "BlockPlace";

        public static void init() {
            packetIds.put(PacketTypeClasses.Client.TELEPORT_ACCEPT, TELEPORT_ACCEPT);
            packetIds.put(PacketTypeClasses.Client.TILE_NBT_QUERY, TILE_NBT_QUERY);
            packetIds.put(PacketTypeClasses.Client.DIFFICULTY_CHANGE, DIFFICULTY_CHANGE);
            packetIds.put(PacketTypeClasses.Client.CHAT, CHAT);
            packetIds.put(PacketTypeClasses.Client.CLIENT_COMMAND, CLIENT_COMMAND);
            packetIds.put(PacketTypeClasses.Client.SETTINGS, SETTINGS);
            packetIds.put(PacketTypeClasses.Client.TAB_COMPLETE, TAB_COMPLETE);
            packetIds.put(PacketTypeClasses.Client.TRANSACTION, TRANSACTION);
            packetIds.put(PacketTypeClasses.Client.ENCHANT_ITEM, ENCHANT_ITEM);
            packetIds.put(PacketTypeClasses.Client.WINDOW_CLICK, WINDOW_CLICK);
            packetIds.put(PacketTypeClasses.Client.CLOSE_WINDOW, CLOSE_WINDOW);
            packetIds.put(PacketTypeClasses.Client.CUSTOM_PAYLOAD, CUSTOM_PAYLOAD);
            packetIds.put(PacketTypeClasses.Client.B_EDIT, B_EDIT);
            packetIds.put(PacketTypeClasses.Client.ENTITY_NBT_QUERY, ENTITY_NBT_QUERY);
            packetIds.put(PacketTypeClasses.Client.USE_ENTITY, USE_ENTITY);
            packetIds.put(PacketTypeClasses.Client.JIGSAW_GENERATE, JIGSAW_GENERATE);
            packetIds.put(PacketTypeClasses.Client.KEEP_ALIVE, KEEP_ALIVE);
            packetIds.put(PacketTypeClasses.Client.DIFFICULTY_LOCK, DIFFICULTY_LOCK);
            packetIds.put(PacketTypeClasses.Client.POSITION, POSITION);
            packetIds.put(PacketTypeClasses.Client.POSITION_LOOK, POSITION_LOOK);
            packetIds.put(PacketTypeClasses.Client.LOOK, LOOK);
            packetIds.put(PacketTypeClasses.Client.FLYING, FLYING);
            packetIds.put(PacketTypeClasses.Client.VEHICLE_MOVE, VEHICLE_MOVE);
            packetIds.put(PacketTypeClasses.Client.BOAT_MOVE, BOAT_MOVE);
            packetIds.put(PacketTypeClasses.Client.PICK_ITEM, PICK_ITEM);
            packetIds.put(PacketTypeClasses.Client.AUTO_RECIPE, AUTO_RECIPE);
            packetIds.put(PacketTypeClasses.Client.ABILITIES, ABILITIES);
            packetIds.put(PacketTypeClasses.Client.BLOCK_DIG, BLOCK_DIG);
            packetIds.put(PacketTypeClasses.Client.ENTITY_ACTION, ENTITY_ACTION);
            packetIds.put(PacketTypeClasses.Client.STEER_VEHICLE, STEER_VEHICLE);
            packetIds.put(PacketTypeClasses.Client.RECIPE_DISPLAYED, RECIPE_DISPLAYED);
            packetIds.put(PacketTypeClasses.Client.ITEM_NAME, ITEM_NAME);
            packetIds.put(PacketTypeClasses.Client.RESOURCE_PACK_STATUS, RESOURCE_PACK_STATUS);
            packetIds.put(PacketTypeClasses.Client.ADVANCEMENTS, ADVANCEMENTS);
            packetIds.put(PacketTypeClasses.Client.TR_SEL, TR_SEL);
            packetIds.put(PacketTypeClasses.Client.BEACON, BEACON);
            packetIds.put(PacketTypeClasses.Client.HELD_ITEM_SLOT, HELD_ITEM_SLOT);
            packetIds.put(PacketTypeClasses.Client.SET_COMMAND_BLOCK, SET_COMMAND_BLOCK);
            packetIds.put(PacketTypeClasses.Client.SET_COMMAND_MINECART, SET_COMMAND_MINECART);
            packetIds.put(PacketTypeClasses.Client.SET_CREATIVE_SLOT, SET_CREATIVE_SLOT);
            packetIds.put(PacketTypeClasses.Client.SET_JIGSAW, SET_JIGSAW);
            packetIds.put(PacketTypeClasses.Client.STRUCT, STRUCT);
            packetIds.put(PacketTypeClasses.Client.UPDATE_SIGN, UPDATE_SIGN);
            packetIds.put(PacketTypeClasses.Client.ARM_ANIMATION, ARM_ANIMATION);
            packetIds.put(PacketTypeClasses.Client.SPECTATE, SPECTATE);
            packetIds.put(PacketTypeClasses.Client.USE_ITEM, USE_ITEM);
            packetIds.put(PacketTypeClasses.Client.BLOCK_PLACE, BLOCK_PLACE);
        }

        public static class Util {
            /**
             * Is the packet an instance of the PacketPlayInFlying packet?
             *
             * @param packetID
             * @return packetID == FLYING or POSITION or POSITION_LOOK or LOOK
             */
            public static boolean isInstanceOfFlying(final String packetID) {
                return packetID.equals(FLYING)
                        || packetID.equals(POSITION)
                        || packetID.equals(POSITION_LOOK)
                        || packetID.equals(LOOK);
            }
        }
    }

    public static class Server {
        private static final String prefix = "PacketPlayOut";
        public static final Map<Class<?>, String> packetIds = new HashMap<>();
        public static final String SPAWN_ENTITY = prefix + "SpawnEntity",
                SPAWN_ENTITY_EXPERIENCE_ORB = prefix + "SpawnEntityExperienceOrb",
                SPAWN_ENTITY_WEATHER = prefix + "SpawnEntityWeather",
                SPAWN_ENTITY_LIVING = prefix + "SpawnEntityLiving",
                SPAWN_ENTITY_PAINTING =  prefix + "SpawnEntityPainting",
                SPAWN_ENTITY_SPAWN =  prefix + "SpawnEntitySpawn",
                ANIMATION =  prefix + "Animation",
                STATISTIC =  prefix + "Statistic",
                BLOCK_BREAK =  prefix + "BlockBreak",
                BLOCK_BREAK_ANIMATION =  prefix + "BlockBreakAnimation",
                TILE_ENTITY_DATA =  prefix + "TileEntityData",
                BLOCK_ACTION =  prefix + "BlockAction",
                BLOCK_CHANGE =  prefix + "BlockChange",
                BOSS = prefix + "Boss",
                SERVER_DIFFICULTY = prefix + "ServerDifficulty",
                CHAT = prefix + "Chat",
                MULTI_BLOCK_CHANGE = prefix + "MultiBlockChange",
                TAB_COMPLETE = prefix + "TabComplete",
                COMMANDS = prefix + "Commands",
                TRANSACTION = prefix + "Transaction",
                CLOSE_WINDOW = prefix + "CloseWindow",
                WINDOW_ITEMS = prefix + "WindowItems",
                WINDOW_DATA = prefix + "WindowData",
                SET_SLOT = prefix + "SetSlot",
                SET_COOLDOWN = prefix + "SetCooldown",
                CUSTOM_PAYLOAD = prefix + "CustomPayload",
                CUSTOM_SOUND_EFFECT = prefix + "CustomSoundEffect",
                KICK_DISCONNECT = prefix + "KickDisconnect",
                ENTITY_STATUS = prefix + "EntityStatus",
                EXPLOSION = prefix + "Explosion",
                UNLOAD_CHUNK = prefix + "UnloadChunk",
                GAME_STATE_CHANGE = prefix + "GameStateChange",
                OPEN_WINDOW_HORSE = prefix + "OpenWindowHorse",
                KEEP_ALIVE = prefix + "KeepAlive",
                MAP_CHUNK = prefix + "MapChunk",
                WORLD_EVENT = prefix + "WorldEvent",
                WORLD_PARTICLES = prefix + "WorldParticles",
                LIGHT_UPDATE = prefix + "LightUpdate",
                LOGIN = prefix + "Login",
                MAP = prefix + "Map",
                OPEN_WINDOW_MERCHANT = prefix + "OpenWindowMerchant",
                REL_ENTITY_MOVE = prefix + "RelEntityMove",
                REL_ENTITY_MOVE_LOOK = prefix + "RelEntityMoveLook",
                ENTITY_LOOK = prefix + "EntityLook",
                ENTITY = prefix + "Entity",
                VEHICLE_MOVE = prefix + "VehicleMove",
                OPEN_BOOK = prefix + "OpenBook",
                OPEN_WINDOW = prefix + "OpenWindow",
                OPEN_SIGN_EDITOR = prefix + "OpenSignEditor",
                AUTO_RECIPE = prefix + "AutoRecipe",
                ABILITIES = prefix + "Abilities",
                COMBAT_EVENT = prefix + "CombatEvent",
                PLAYER_INFO = prefix + "PlayerInfo",
                LOOK_AT = prefix + "LookAt",
                POSITION = prefix + "Position",
                RECIPES = prefix + "Recipes",
                ENTITY_DESTROY = prefix + "EntityDestroy",
                REMOVE_ENTITY_EFFECT = prefix + "RemoveEntityEffect",
                RESOURCE_PACK_SEND = prefix + "ResourcePackSend",
                RESPAWN = prefix + "Respawn",
                ENTITY_HEAD_ROTATION = prefix + "EntityHeadRotation",
                SELECT_ADVANCEMENT_TAB = prefix + "SelectAdvancementTab",
                WORLD_BORDER = prefix + "WorldBorder",
                CAMERA = prefix + "Camera",
                HELD_ITEM_SLOT = prefix + "HeldItemSlot",
                VIEW_CENTRE = prefix + "ViewCentre",
                VIEW_DISTANCE = prefix + "ViewDistance",
                SCOREBOARD_DISPLAY_OBJECTIVE = prefix + "ScoreboardDisplayObjective",
                ENTITY_METADATA = prefix + "EntityMetadata",
                ATTACH_ENTITY = prefix + "AttachEntity",
                ENTITY_VELOCITY = prefix + "EntityVelocity",
                ENTITY_EQUIPMENT = prefix + "EntityEquipment",
                EXPERIENCE = prefix + "Experience",
                UPDATE_HEALTH = prefix + "UpdateHealth",
                SCOREBOARD_OBJECTIVE = prefix + "ScoreboardObjective",
                MOUNT = prefix + "Mount",
                SCOREBOARD_TEAM = prefix + "ScoreboardTeam",
                SCOREBOARD_SCORE = prefix + "ScoreboardScore",
                SPAWN_POSITION = prefix + "SpawnPosition",
                UPDATE_TIME = prefix + "UpdateTime",
                TITLE = prefix + "Title",
                ENTITY_SOUND = prefix + "EntitySound",
                NAMED_SOUND_EFFECT = prefix + "NamedSoundEffect",
                STOP_SOUND = prefix + "StopSound",
                PLAYER_LIST_HEADER_FOOTER = prefix + "PlayerListHeaderFooter",
                NBT_QUERY = prefix + "NbtQuery",
                COLLECT = prefix + "Collect",
                ENTITY_TELEPORT = prefix + "EntityTeleport",
                ADVANCEMENTS = prefix + "Advancements",
                UPDATE_ATTRIBUTES = prefix + "UpdateAttributes",
                ENTITY_EFFECT = prefix + "EntityEffect",
                RECIPE_UPDATE = prefix + "RecipeUpdate",
                TAGS = prefix + "Tags",
                MAP_CHUNK_BULK = prefix + "MapChunkBulk";

        public static void init() {
            packetIds.put(PacketTypeClasses.Server.SPAWN_ENTITY, SPAWN_ENTITY);
            packetIds.put(PacketTypeClasses.Server.SPAWN_ENTITY_EXPERIENCE_ORB, SPAWN_ENTITY_EXPERIENCE_ORB);
            packetIds.put(PacketTypeClasses.Server.SPAWN_ENTITY_WEATHER, SPAWN_ENTITY_WEATHER);
            packetIds.put(PacketTypeClasses.Server.SPAWN_ENTITY_LIVING, SPAWN_ENTITY_LIVING);
            packetIds.put(PacketTypeClasses.Server.SPAWN_ENTITY_PAINTING, SPAWN_ENTITY_PAINTING);
            packetIds.put(PacketTypeClasses.Server.SPAWN_ENTITY_SPAWN, SPAWN_ENTITY_SPAWN);
            packetIds.put(PacketTypeClasses.Server.ANIMATION, ANIMATION);
            packetIds.put(PacketTypeClasses.Server.STATISTIC, STATISTIC);
            packetIds.put(PacketTypeClasses.Server.BLOCK_BREAK, BLOCK_BREAK);
            packetIds.put(PacketTypeClasses.Server.BLOCK_BREAK_ANIMATION, BLOCK_BREAK_ANIMATION);
            packetIds.put(PacketTypeClasses.Server.TILE_ENTITY_DATA, TILE_ENTITY_DATA);
            packetIds.put(PacketTypeClasses.Server.BLOCK_ACTION, BLOCK_ACTION);
            packetIds.put(PacketTypeClasses.Server.BLOCK_CHANGE, BLOCK_CHANGE);
            packetIds.put(PacketTypeClasses.Server.BOSS, BOSS);
            packetIds.put(PacketTypeClasses.Server.SPAWN_ENTITY, SPAWN_ENTITY);
            packetIds.put(PacketTypeClasses.Server.SERVER_DIFFICULTY, SERVER_DIFFICULTY);
            packetIds.put(PacketTypeClasses.Server.CHAT, CHAT);
            packetIds.put(PacketTypeClasses.Server.MULTI_BLOCK_CHANGE, MULTI_BLOCK_CHANGE);
            packetIds.put(PacketTypeClasses.Server.TAB_COMPLETE, TAB_COMPLETE);
            packetIds.put(PacketTypeClasses.Server.COMMANDS, COMMANDS);
            packetIds.put(PacketTypeClasses.Server.TRANSACTION, TRANSACTION);
            packetIds.put(PacketTypeClasses.Server.CLOSE_WINDOW, CLOSE_WINDOW);
            packetIds.put(PacketTypeClasses.Server.WINDOW_ITEMS, WINDOW_ITEMS);
            packetIds.put(PacketTypeClasses.Server.WINDOW_DATA, WINDOW_DATA);
            packetIds.put(PacketTypeClasses.Server.SET_SLOT, SET_SLOT);
            packetIds.put(PacketTypeClasses.Server.SET_COOLDOWN, SET_COOLDOWN);
            packetIds.put(PacketTypeClasses.Server.CUSTOM_PAYLOAD, CUSTOM_PAYLOAD);
            packetIds.put(PacketTypeClasses.Server.CUSTOM_SOUND_EFFECT, CUSTOM_SOUND_EFFECT);
            packetIds.put(PacketTypeClasses.Server.KICK_DISCONNECT, KICK_DISCONNECT);
            packetIds.put(PacketTypeClasses.Server.ENTITY_STATUS, ENTITY_STATUS);
            packetIds.put(PacketTypeClasses.Server.EXPLOSION, EXPLOSION);
            packetIds.put(PacketTypeClasses.Server.UNLOAD_CHUNK, UNLOAD_CHUNK);
            packetIds.put(PacketTypeClasses.Server.GAME_STATE_CHANGE, GAME_STATE_CHANGE);
            packetIds.put(PacketTypeClasses.Server.OPEN_WINDOW_HORSE, OPEN_WINDOW_HORSE);
            packetIds.put(PacketTypeClasses.Server.KEEP_ALIVE, KEEP_ALIVE);
            packetIds.put(PacketTypeClasses.Server.MAP_CHUNK, MAP_CHUNK);
            packetIds.put(PacketTypeClasses.Server.WORLD_EVENT, WORLD_EVENT);
            packetIds.put(PacketTypeClasses.Server.WORLD_EVENT, SPAWN_ENTITY);
            packetIds.put(PacketTypeClasses.Server.WORLD_PARTICLES, WORLD_PARTICLES);
            packetIds.put(PacketTypeClasses.Server.LIGHT_UPDATE, LIGHT_UPDATE);
            packetIds.put(PacketTypeClasses.Server.LOGIN, LOGIN);
            packetIds.put(PacketTypeClasses.Server.MAP, MAP);
            packetIds.put(PacketTypeClasses.Server.OPEN_WINDOW_MERCHANT, OPEN_WINDOW_MERCHANT);
            packetIds.put(PacketTypeClasses.Server.REL_ENTITY_MOVE, REL_ENTITY_MOVE);
            packetIds.put(PacketTypeClasses.Server.REL_ENTITY_MOVE_LOOK, REL_ENTITY_MOVE_LOOK);
            packetIds.put(PacketTypeClasses.Server.ENTITY_LOOK, ENTITY_LOOK);
            packetIds.put(PacketTypeClasses.Server.ENTITY, ENTITY);
            packetIds.put(PacketTypeClasses.Server.VEHICLE_MOVE, VEHICLE_MOVE);
            packetIds.put(PacketTypeClasses.Server.OPEN_BOOK, OPEN_BOOK);
            packetIds.put(PacketTypeClasses.Server.OPEN_WINDOW, OPEN_WINDOW);
            packetIds.put(PacketTypeClasses.Server.OPEN_SIGN_EDITOR, OPEN_SIGN_EDITOR);
            packetIds.put(PacketTypeClasses.Server.AUTO_RECIPE, AUTO_RECIPE);
            packetIds.put(PacketTypeClasses.Server.ABILITIES, ABILITIES);
            packetIds.put(PacketTypeClasses.Server.COMBAT_EVENT, COMBAT_EVENT);
            packetIds.put(PacketTypeClasses.Server.PLAYER_INFO, PLAYER_INFO);
            packetIds.put(PacketTypeClasses.Server.LOOK_AT, LOOK_AT);
            packetIds.put(PacketTypeClasses.Server.POSITION, POSITION);
            packetIds.put(PacketTypeClasses.Server.RECIPES, RECIPES);
            packetIds.put(PacketTypeClasses.Server.ENTITY_DESTROY, ENTITY_DESTROY);
            packetIds.put(PacketTypeClasses.Server.REMOVE_ENTITY_EFFECT, REMOVE_ENTITY_EFFECT);
            packetIds.put(PacketTypeClasses.Server.RESOURCE_PACK_SEND, RESOURCE_PACK_SEND);
            packetIds.put(PacketTypeClasses.Server.RESPAWN, RESPAWN);
            packetIds.put(PacketTypeClasses.Server.ENTITY_HEAD_ROTATION, ENTITY_HEAD_ROTATION);
            packetIds.put(PacketTypeClasses.Server.SELECT_ADVANCEMENT_TAB, SELECT_ADVANCEMENT_TAB);
            packetIds.put(PacketTypeClasses.Server.WORLD_BORDER, WORLD_BORDER);
            packetIds.put(PacketTypeClasses.Server.CAMERA, CAMERA);
            packetIds.put(PacketTypeClasses.Server.HELD_ITEM_SLOT, HELD_ITEM_SLOT);
            packetIds.put(PacketTypeClasses.Server.VIEW_CENTRE, VIEW_CENTRE);
            packetIds.put(PacketTypeClasses.Server.VIEW_DISTANCE, VIEW_DISTANCE);
            packetIds.put(PacketTypeClasses.Server.SCOREBOARD_DISPLAY_OBJECTIVE, SCOREBOARD_DISPLAY_OBJECTIVE);
            packetIds.put(PacketTypeClasses.Server.ENTITY_METADATA, ENTITY_METADATA);
            packetIds.put(PacketTypeClasses.Server.ATTACH_ENTITY, ATTACH_ENTITY);
            packetIds.put(PacketTypeClasses.Server.ENTITY_VELOCITY, ENTITY_VELOCITY);
            packetIds.put(PacketTypeClasses.Server.ENTITY_EQUIPMENT, ENTITY_EQUIPMENT);
            packetIds.put(PacketTypeClasses.Server.EXPERIENCE, EXPERIENCE);
            packetIds.put(PacketTypeClasses.Server.UPDATE_HEALTH, UPDATE_HEALTH);
            packetIds.put(PacketTypeClasses.Server.SCOREBOARD_OBJECTIVE, SCOREBOARD_OBJECTIVE);
            packetIds.put(PacketTypeClasses.Server.MOUNT, MOUNT);
            packetIds.put(PacketTypeClasses.Server.SCOREBOARD_TEAM, SCOREBOARD_TEAM);
            packetIds.put(PacketTypeClasses.Server.SCOREBOARD_SCORE, SCOREBOARD_SCORE);
            packetIds.put(PacketTypeClasses.Server.SPAWN_POSITION, SPAWN_POSITION);
            packetIds.put(PacketTypeClasses.Server.UPDATE_TIME, UPDATE_TIME);
            packetIds.put(PacketTypeClasses.Server.TITLE, TITLE);
            packetIds.put(PacketTypeClasses.Server.ENTITY_SOUND, ENTITY_SOUND);
            packetIds.put(PacketTypeClasses.Server.NAMED_SOUND_EFFECT, NAMED_SOUND_EFFECT);
            packetIds.put(PacketTypeClasses.Server.STOP_SOUND, STOP_SOUND);
            packetIds.put(PacketTypeClasses.Server.PLAYER_LIST_HEADER_FOOTER, PLAYER_LIST_HEADER_FOOTER);
            packetIds.put(PacketTypeClasses.Server.NBT_QUERY, NBT_QUERY);
            packetIds.put(PacketTypeClasses.Server.COLLECT, COLLECT);
            packetIds.put(PacketTypeClasses.Server.ENTITY_TELEPORT, ENTITY_TELEPORT);
            packetIds.put(PacketTypeClasses.Server.ADVANCEMENTS, ADVANCEMENTS);
            packetIds.put(PacketTypeClasses.Server.UPDATE_ATTRIBUTES, UPDATE_ATTRIBUTES);
            packetIds.put(PacketTypeClasses.Server.ENTITY_EFFECT, ENTITY_EFFECT);
            packetIds.put(PacketTypeClasses.Server.RECIPE_UPDATE, RECIPE_UPDATE);
            packetIds.put(PacketTypeClasses.Server.TAGS, TAGS);
            packetIds.put(PacketTypeClasses.Server.MAP_CHUNK_BULK, MAP_CHUNK_BULK);
        }

        public static class Util {
            /**
             * Is the packet an instance of the PacketPlayOutEntity packet?
             *
             * @param packetID
             * @return packetID == ENTITY or REL_ENTITY_MOVE or REL_ENTITY_MOVE_LOOK or ENTITY_LOOK
             */
            public static boolean isInstanceOfEntity(final String packetID) {
                return packetID.equals(ENTITY) || packetID.equals(REL_ENTITY_MOVE) ||
                        packetID.equals(REL_ENTITY_MOVE_LOOK) || packetID.equals(ENTITY_LOOK);
            }
        }
    }


}
