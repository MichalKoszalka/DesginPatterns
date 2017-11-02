package factory.abstractfactory.car;

import factory.abstractfactory.partsfactory.CarPartsFactory;

public class BasicCar extends Car {

	CarPartsFactory carPartsFactory;

	public BasicCar(CarPartsFactory carPartsFactory) {
		this.carPartsFactory = carPartsFactory;
	}

	public void prepare() {
		System.out.println("Preparing " + model);
		engine = carPartsFactory.createEngine();
		chassis = carPartsFactory.createChassis();
		drive = carPartsFactory.createDrive();
		body = carPartsFactory.createBody();
		turboCharger = carPartsFactory.createTurboCharger();
	}
}
