package factory.simplefactoryclassregistration.factory;

import factory.common.exception.UnsupportedCarSegmentException;
import factory.simplefactoryclassregistration.car.Car;
import factory.simplefactoryclassregistration.car.CarSegment;
import factory.simplefactoryclassregistration.car.opel.Astra;
import factory.simplefactoryclassregistration.car.opel.Insignia;

public class OpelFactory implements CarFactory {

    @Override
    public Car createCar(CarSegment carSegment) {
        switch (carSegment) {
            case C_SEGMENT:
                return new Astra();
            case E_SEGMENT:
                return new Insignia();
            default:
                throw new UnsupportedCarSegmentException(carSegment + " segment unsupported!");
        }
    }
}

