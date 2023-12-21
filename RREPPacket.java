package routing.util;

import core.DTNHost;
import core.Message;

public class RREPPacket extends Message {
	private DTNHost destination;
    private DTNHost source;
    private int hopCount;
    
    public RREPPacket(DTNHost src, DTNHost dest, String id, int size) {
    	super(src, dest, id, size);
        this.source = src;
        this.destination = dest;
        this.hopCount = 0;
    }

    public DTNHost getSource() {
        return source;
    }

    public DTNHost getDestination() {
        return destination;
    }

    public int getHopCount() {
        return hopCount;
    }

    public void incrementHopCount() {
        this.hopCount++;
    }

	public void setHopCount(int i) {
		hopCount = i;
	}
}
