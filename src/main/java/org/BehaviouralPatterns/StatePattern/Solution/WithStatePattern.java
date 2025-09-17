package org.BehaviouralPatterns.StatePattern.Solution;


public class WithStatePattern {
    public static void main(String[] args) {
        DirectionService service = new DirectionService(new Car());
        // service.setTransportationMode(new Cycling());

        System.out.println("ETA: " + service.getETA());
        System.out.println("Direction: " + service.getDirection());


        DirectionService service2 = new DirectionService(new Bus());
        System.out.println("ETA: " + service2.getETA());
        System.out.println("Direction: " + service2.getDirection());

    }
}
