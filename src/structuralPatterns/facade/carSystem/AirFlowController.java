package structuralPatterns.facade.carSystem;

public class AirFlowController {

    private final AirFlowMeter airFlowMeter = new AirFlowMeter();

    public void takeAir() {
        airFlowMeter.getMeasurements();
    }

    public void off() {
    }
}