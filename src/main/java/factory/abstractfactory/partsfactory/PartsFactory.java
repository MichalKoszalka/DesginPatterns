package factory.abstractfactory.partsfactory;

public interface PartsFactory {

    public Engine createEngine();
    public Chassis createChassis();
    public Body createBody();
    public Drive createDrive();

}
