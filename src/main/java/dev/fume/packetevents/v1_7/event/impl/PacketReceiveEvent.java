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

package dev.fume.packetevents.v1_7.event.impl;

import dev.fume.packetevents.v1_7.event.PacketEvent;
import dev.fume.packetevents.v1_7.packettype.PacketType;
import dev.fume.packetevents.v1_7.utils.reflection.ClassUtil;
import dev.fume.packetevents.v1_7.event.eventtypes.CancellableEvent;
import dev.fume.packetevents.v1_7.event.eventtypes.PlayerEvent;
import org.bukkit.entity.Player;

/**
 * This event is called each time a packet is received from a client.
 */
public final class PacketReceiveEvent extends PacketEvent implements CancellableEvent, PlayerEvent {
    private final Player player;
    private final Object packet;
    private boolean cancelled;

    public PacketReceiveEvent(final Player player, final Object packet) {
        this.player = player;
        this.packet = packet;
    }

    /**
     * Get the packet sender
     * @return player
     */
    @Override
    public Player getPlayer() {
        return player;
    }

    /**
     * Get the packet's name (NMS packet class simple name).
     * The class simple name is cached.
     * @return Name of the packet
     */
    public String getPacketName() {
        return ClassUtil.getClassSimpleName(packet.getClass());
    }

    /**
     * Get the raw packet object
     * @return packet object
     */
    public Object getNMSPacket() {
        return packet;
    }

    /**
     * Get the ID of the packet
     * @return packet id
     */
    public String getPacketId() {
        return PacketType.Client.packetIds.getOrDefault(packet.getClass(), "Unknown");
    }

    @Override
    public void cancel() {
        cancelled = true;
    }

    @Override
    public void uncancel() {
        cancelled = false;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean value) {
        cancelled = value;
    }

}
