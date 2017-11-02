package factory.simplefactoryclassregistration;

import factory.simplefactoryclassregistration.car.Car;

import java.util.HashMap;
import java.util.Map;

public class AllCarsFactory {

	private Map<String, Class<Car>> registeredCars = new HashMap();

	public void registerItem(String id, Class car) {
		registeredCars.put(id, car);
	}

}
