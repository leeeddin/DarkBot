package org.darkstorm.darkbot.minecraftbot.protocol.v4x.play.server;

import java.io.*;

import org.darkstorm.darkbot.minecraftbot.protocol.*;
import org.darkstorm.darkbot.minecraftbot.protocol.ProtocolX.State;

public class S0DPacketCollectItem extends AbstractPacketX implements ReadablePacket {
	private int itemEntityId, collectorEntityId;

	public S0DPacketCollectItem() {
		super(0x0D, State.PLAY, Direction.DOWNSTREAM);
	}

	@Override
	public void readData(DataInputStream in) throws IOException {
		itemEntityId = in.readInt();
		collectorEntityId = in.readInt();
	}

	public int getItemEntityId() {
		return itemEntityId;
	}

	public int getCollectorEntityId() {
		return collectorEntityId;
	}
}
