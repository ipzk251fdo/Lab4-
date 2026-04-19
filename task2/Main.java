package task2;

public class Main {
    public static void main(String[] args) {
        CommandCentre centre = new CommandCentre();

        Runway runway = new Runway();
        centre.addRunway(runway);

        Aircraft boeing = new Aircraft("Boeing 747", centre);
        Aircraft airbus = new Aircraft("Airbus A320", centre);

        boeing.land();
        System.out.println();

        airbus.land();
        System.out.println();

        boeing.takeOff();
        System.out.println();

        airbus.land();
    }
}