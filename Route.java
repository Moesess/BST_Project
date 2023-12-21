package routing;

import core.DTNHost;

public class Route {
    private DTNHost nextHop;
    private int hopCount;
    private int maxHops;
    private double expiryTime;

    public Route(DTNHost nextHop, int hopCount, int maxHops) {
        this.nextHop = nextHop;
        this.hopCount = hopCount;
        this.maxHops = maxHops;
    }

    public DTNHost getNextHop() {
        return nextHop;
    }

    public int getHopCount() {
        return hopCount;
    }

    public double getExpiryTime() {
        return expiryTime;
    }
    
    public int getRemainingHops() {
        return maxHops - hopCount;
    }
    
    public boolean isExpired() {
        return getRemainingHops() <= 0;
    }
}
