package task2;

import java.util.ArrayList;
import java.util.List;

public class CommandCentre {
    private List<Runway> runways = new ArrayList<>();
    private List<Aircraft> aircrafts = new ArrayList<>();

    public void addRunway(Runway runway) {
        runways.add(runway);
    }

    public void addAircraft(Aircraft aircraft) {
        aircrafts.add(aircraft);
    }

    public void requestLanding(Aircraft aircraft) {
        System.out.println("Aircraft " + aircraft.getName() + " is landing.");
        System.out.println("Checking runway.");

        Runway freeRunway = null;
        for (Runway r : runways) {
            if (r.getIsBusyWithAircraft() == null) {
                freeRunway = r;
                break;
            }
        }

        if (freeRunway != null) {
            System.out.println("Aircraft " + aircraft.getName() + " has landed.");
            freeRunway.setIsBusyWithAircraft(aircraft);
            freeRunway.highLightRed();
            aircraft.setCurrentRunway(freeRunway);
        } else {
            System.out.println("Could not land, the runway is busy.");
        }
    }

    public void requestTakeOff(Aircraft aircraft) {
        Runway runway = aircraft.getCurrentRunway();
        if (runway != null) {
            System.out.println("Aircraft " + aircraft.getName() + " is taking off.");
            runway.setIsBusyWithAircraft(null);
            aircraft.setCurrentRunway(null);
            runway.highLightGreen();
            System.out.println("Aircraft " + aircraft.getName() + " has took off.");
        }
    }
}