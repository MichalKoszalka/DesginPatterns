package builder.generic;

import builder.common.BodyType;
import builder.common.ChassisType;
import builder.common.DriveType;
import builder.common.FuelType;

public abstract class CarBuilder {

    private String brand;

    private String model;

    private FuelType fuelType;

    private BodyType bodyType;

    private DriveType driveType;

    private ChassisType chassisType;

    public abstract CarBuilder withBrand();

    public abstract CarBuilder withModel();

    public abstract CarBuilder withFuelType();

    public abstract CarBuilder withDriveType();

    public abstract CarBuilder withChasisType();

    public abstract CarBuilder withBodyType();

    public abstract Car build();

}
