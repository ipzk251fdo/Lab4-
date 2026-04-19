package task2;

public class Aircraft {
    private String name;
    private Runway currentRunway;
    private CommandCentre mediator;

    public Aircraft(String name, CommandCentre mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public String getName() { return name; }
    public Runway getCurrentRunway() { return currentRunway; }
    public void setCurrentRunway(Runway runway) { this.currentRunway = runway; }

    public void land() {
        mediator.requestLanding(this);
    }

    public void takeOff() {
        mediator.requestTakeOff(this);
    }
}