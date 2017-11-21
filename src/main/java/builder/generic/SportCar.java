package builder.generic;

public class SportCar extends Car {

    public static class SportCarBuilder extends CarBuilder {



        @Override
        public CarBuilder withBrand() {
            return null;
        }

        @Override
        public CarBuilder withModel() {
            return null;
        }

        @Override
        public CarBuilder withFuelType() {
            return null;
        }

        @Override
        public CarBuilder withDriveType() {
            return null;
        }

        @Override
        public CarBuilder withChasisType() {
            return null;
        }

        @Override
        public CarBuilder withBodyType() {
            return null;
        }

        @Override
        public Car build() {
            return null;
        }
    }

}
