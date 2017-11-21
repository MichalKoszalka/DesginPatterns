package builder.generic;

import builder.common.BodyType;
import builder.common.ChassisType;
import builder.common.DriveType;
import builder.common.FuelType;

public abstract class Car {

    private String brand;

    private String model;

    private FuelType fuelType;

    private BodyType bodyType;

    private DriveType driveType;

    private ChassisType chassisType;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public DriveType getDriveType() {
        return driveType;
    }

    public void setDriveType(DriveType driveType) {
        this.driveType = driveType;
    }

    public ChassisType getChassisType() {
        return chassisType;
    }

    public void setChassisType(ChassisType chassisType) {
        this.chassisType = chassisType;
    }
}
