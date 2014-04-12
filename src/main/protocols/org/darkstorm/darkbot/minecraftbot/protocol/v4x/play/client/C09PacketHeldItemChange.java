package org.darkstorm.darkbot.minecraftbot.protocol.v4x.play.client;

import java.io.*;

import org.darkstorm.darkbot.minecraftbot.protocol.*;
import org.darkstorm.darkbot.minecraftbot.protocol.ProtocolX.State;

public class C09PacketHeldItemChange extends AbstractPacketX implements WriteablePacket {
	private int slot;

	public C09PacketHeldItemChange(int slot) {
		super(0x09, State.PLAY, Direction.UPSTREAM);

		this.slot = slot;
	}

	@Override
	public void writeData(DataOutputStream out) throws IOException {
		out.writeShort(slot);
	}

	public int getSlot() {
		return slot;
	}
}
