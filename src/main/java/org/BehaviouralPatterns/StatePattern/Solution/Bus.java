package org.BehaviouralPatterns.StatePattern.Solution;

public class Bus implements TransportationMode {

    @Override
    public int calcETA() {
        return 10;
    }

    @Override
    public String getDirection() {
        return "Directions for bus route";
    }
}
