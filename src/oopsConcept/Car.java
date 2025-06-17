package oopsConcept;

public class Car {
	private Engine engine; // Car has a dependency on Engine, but it's loosely coupled

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void startCar() {
        engine.start(); // Car uses the Engine's start method without knowing its internal details
        System.out.println("Car has started.");
    }

    public void upgradeEngine(int newHorsepower) {
        engine.setHorsepower(newHorsepower); // Using setter to modify engine
    }
}


