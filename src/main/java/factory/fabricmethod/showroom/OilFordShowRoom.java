package factory.fabricmethod.showroom;

import factory.fabricmethod.car.oil.OilFordCMax;
import factory.fabricmethod.car.oil.OilFordFiesta;
import factory.fabricmethod.car.oil.OilFordMustang;
import factory.simple.Ford;
import factory.simple.UnsupportedCarTypeException;

public class OilFordShowRoom extends FordShowRoom {

    @Override
    Ford createFord(String item) {
        if(item.equalsIgnoreCase("fiesta")) {
            return new OilFordFiesta();
        } else if(item.equalsIgnoreCase("mustang")) {
            return new OilFordMustang();
        } else if(item.equalsIgnoreCase("cmax")) {
            return new OilFordCMax();
        } else {
            throw new UnsupportedCarTypeException("type: " + item + " not supported ");
        }
    }
}
