package structuralPatterns.facade;

import structuralPatterns.facade.carSystem.AirFlowController;

public class CarEngineFacade {
    private static final int DEFAULT_COOLING_TEMP = 90;
    private static final int MAX_ALLOWED_TEMP = 50;
    private final AirFlowController airFlowController = new AirFlowController();

    public void startEngine() {
        airFlowController.takeAir();
    }

    public void stopEngine() {
        airFlowController.off();
    }
}