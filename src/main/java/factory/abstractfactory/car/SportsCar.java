package factory.abstractfactory.car;

import factory.abstractfactory.partsfactory.CarPartsFactory;

public class SportsCar extends Car {

	CarPartsFactory carPartsFactory;

	public SportsCar(CarPartsFactory carPartsFactory) {
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
