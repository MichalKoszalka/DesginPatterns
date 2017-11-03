package factory.simplefactoryclassregistration.factory;

import factory.common.exception.UnsupportedCarSegmentException;
import factory.simplefactoryclassregistration.car.Car;
import factory.simplefactoryclassregistration.car.CarSegment;
import factory.simplefactoryclassregistration.car.ford.Focus;
import factory.simplefactoryclassregistration.car.ford.Mondeo;

public class FordFactory implements CarFactory {

    @Override
    public Car createCar(CarSegment carSegment) {
        switch (carSegment) {
            case C_SEGMENT:
                return new Focus();
            case D_SEGMENT:
                return new Mondeo();
            default:
                throw new UnsupportedCarSegmentException(carSegment + " segment unsupported!");
        }
    }
}
