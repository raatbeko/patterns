package creationalPatterns.factoryMethod;

import creationalPatterns.abstractFactory.ElectricVehicle;

public abstract class Corporation {
    public abstract MotorVehicle createMotorVehicle();
    public abstract ElectricVehicle createElectricVehicle();
}
