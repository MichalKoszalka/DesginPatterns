package factory.simplefactoryclassregistration.factory;

import factory.common.exception.UnsupportedCarSegmentException;
import factory.simplefactoryclassregistration.car.Car;
import factory.simplefactoryclassregistration.car.CarSegment;
import factory.simplefactoryclassregistration.car.mercedes.CClass;
import factory.simplefactoryclassregistration.car.mercedes.EClass;
import factory.simplefactoryclassregistration.car.mercedes.SClass;

public class MercedesFactory implements CarFactory {

    @Override
    public Car createCar(CarSegment carSegment) {
        switch (carSegment) {
            case C_SEGMENT:
                return new CClass();
            case D_SEGMENT:
                return new EClass();
            case E_SEGMENT:
                return new SClass();
                default:
                    throw new UnsupportedCarSegmentException(carSegment + " segment unsupported!");
        }
    }
}
