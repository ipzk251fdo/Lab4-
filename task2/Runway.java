package task2;

import java.util.UUID;

public class Runway {
    private final UUID id = UUID.randomUUID();
    private Aircraft isBusyWithAircraft;

    public Aircraft getIsBusyWithAircraft() { return isBusyWithAircraft; }
    public void setIsBusyWithAircraft(Aircraft aircraft) { this.isBusyWithAircraft = aircraft; }

    public void highLightRed() {
        System.out.println("Runway " + id + " is busy!");
    }

    public void highLightGreen() {
        System.out.println("Runway " + id + " is free!");
    }
}