package factory.abstractfactory;

import factory.abstractfactory.car.Car;
import factory.abstractfactory.showroom.CityCarShowRoom;
import factory.abstractfactory.showroom.MuscleCarShowRoom;
import factory.abstractfactory.showroom.OffRoadCarShowRoom;
import factory.simple.Ford;
import factory.simple.FordShowRoom;
import factory.simple.SimpleFordFactory;
import factory.simple.UnsupportedCarTypeException;

public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MuscleCarShowRoom muscleCarShowRoom = new MuscleCarShowRoom();
        CityCarShowRoom cityCarShowRoom = new CityCarShowRoom();
        OffRoadCarShowRoom offRoadCarShowRoom = new OffRoadCarShowRoom();

        Car car = muscleCarShowRoom.orderCar("eco");
        System.out.println("car " + car.getModel() + " ordered");

		car = muscleCarShowRoom.orderCar("basic");
        System.out.println("car " + car.getModel() + " ordered");

		car = muscleCarShowRoom.orderCar("sports");
        System.out.println("car " + car.getModel() + " ordered");

		car = cityCarShowRoom.orderCar("eco");
		System.out.println("car " + car.getModel() + " ordered");

		car = cityCarShowRoom.orderCar("basic");
		System.out.println("car " + car.getModel() + " ordered");

		car = cityCarShowRoom.orderCar("sports");
		System.out.println("car " + car.getModel() + " ordered");

		car = offRoadCarShowRoom.orderCar("eco");
		System.out.println("car " + car.getModel() + " ordered");

		car = offRoadCarShowRoom.orderCar("basic");
		System.out.println("car " + car.getModel() + " ordered");

		car = offRoadCarShowRoom.orderCar("sports");
		System.out.println("car " + car.getModel() + " ordered");

    }
}
