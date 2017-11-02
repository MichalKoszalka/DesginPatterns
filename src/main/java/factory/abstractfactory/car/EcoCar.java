package factory.abstractfactory.car;

import factory.abstractfactory.partsfactory.CarPartsFactory;

public class EcoCar extends Car {

	CarPartsFactory carPartsFactory;

	public EcoCar(CarPartsFactory carPartsFactory) {
		this.carPartsFactory = carPartsFactory;
	}

	public void prepare() {
		System.out.println("Preparing " + model);
		engine = carPartsFactory.createEngine();
		chassis = carPartsFactory.createChassis();
		drive = carPartsFactory.createDrive();
		body = carPartsFactory.createBody();
	}
}
