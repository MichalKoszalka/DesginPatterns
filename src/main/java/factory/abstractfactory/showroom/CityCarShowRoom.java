package factory.abstractfactory.showroom;

import factory.abstractfactory.car.BasicCar;
import factory.abstractfactory.car.Car;
import factory.abstractfactory.car.EcoCar;
import factory.abstractfactory.car.SportsCar;
import factory.abstractfactory.partsfactory.CarPartsFactory;
import factory.abstractfactory.partsfactory.CityCarPartsFactory;

public class CityCarShowRoom extends ShowRoom{

	protected Car createCar(String item) {
		Car car = null;
		CarPartsFactory carPartsFactory =
				new CityCarPartsFactory();

		if (item.equals("eco")) {

			car = new EcoCar(carPartsFactory);
			car.setModel("Eco city car");

		} else if (item.equals("basic")) {

			car = new BasicCar(carPartsFactory);
			car.setModel("Basic city car");

		} else if (item.equals("sports")) {

			car = new SportsCar(carPartsFactory);
			car.setModel("Sports city car");
		}

		return car;
	}

}
