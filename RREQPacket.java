package routing.util;

import core.DTNHost;
import core.Message;

public class RREQPacket extends Message {
	private DTNHost destination;
	private DTNHost source;
	private String id;
	private int hopCount;
	private DTNHost fromHost;
	
    public RREQPacket(DTNHost src, DTNHost dest, String id, int size) {
    	super(src, dest, id, size);
        this.source = src;
        this.destination = dest;
        this.id = id;
        this.hopCount = 0;
    }

    // Gettery i settery
    public DTNHost getSource() {
        return source;
    }

    public DTNHost getDestination() {
        return destination;
    }

    public String getId() {
        return id;
    }

    public int getHopCount() {
        return hopCount;
    }

    public void incrementHopCount() {
        this.hopCount++;
    }
    
    public void setFromHost(DTNHost host) {
        this.fromHost = host;
    }
    
	public DTNHost getFromHost() {
		return this.fromHost;
	}
}
