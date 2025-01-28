package creationalPatterns.abstractFactory;

public class NextGenMotorcycle implements MotorVehicle {
    @Override
    public void build() {
        System.out.println("NextGen Motorcycle");
    }
}