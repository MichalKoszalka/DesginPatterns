package factory.simplefactoryclassregistration.factory;

import factory.simplefactoryclassregistration.car.Car;
import factory.simplefactoryclassregistration.car.CarSegment;

public interface CarFactory {

    public Car createCar(CarSegment carSegment);

}
