package creationalPatterns.factoryMethod;

import creationalPatterns.abstractMethod.ElectricVehicle;

public abstract class Corporation {
    public abstract MotorVehicle createMotorVehicle();
    public abstract ElectricVehicle createElectricVehicle();
}
