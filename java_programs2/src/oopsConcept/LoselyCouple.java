package oopsConcept;

public class LoselyCouple {
	public static void main(String[] args) {
        Engine engine = new Engine(200); // Creating an engine
        Car car = new Car(engine); // Injecting engine dependency into car

        car.startCar(); // Car starts using its engine

        car.upgradeEngine(300); // Upgrading engine without modifying Car's implementation
        car.startCar(); // Car starts again with an upgraded engine

	}
}
