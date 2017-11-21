package builder.simple;

import builder.common.BodyType;
import builder.common.ChassisType;
import builder.common.DriveType;
import builder.common.FuelType;

public class Car {

    private String brand;

    private String model;

    private FuelType fuelType;

    private BodyType bodyType;

    private DriveType driveType;

    private ChassisType chassisType;

    private Car(CarBuilder carBuilder){
        this.brand=carBuilder.brand;
        this.model=carBuilder.model;
        this.fuelType=carBuilder.fuelType;
        this.driveType=carBuilder.driveType;
        this.chassisType =carBuilder.chassisType;
        this.bodyType=carBuilder.bodyType;
    }

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

    public static class CarBuilder {

        private String brand;

        private String model;

        private FuelType fuelType;

        private BodyType bodyType;

        private DriveType driveType;

        private ChassisType chassisType;

        public CarBuilder withBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public CarBuilder withModel(String model) {
            this.model = model;
            return this;
        }

        public CarBuilder withFuelType(FuelType fuelType) {
            this.fuelType = fuelType;
            return this;
        }

        public CarBuilder withDriveType(DriveType driveType) {
            this.driveType = driveType;
            return this;
        }

        public CarBuilder withChasisType(ChassisType chassisType) {
            this.chassisType = chassisType;
            return this;
        }

        public CarBuilder withBodyType(BodyType bodyType) {
            this.bodyType = bodyType;
            return this;
        }

        public Car build() {
            return new Car(this);
        }


    }
}
