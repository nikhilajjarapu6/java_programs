package oopsConcept;

public class Engine {
	 private int horsepower;

    public Engine(int horsepower) {
        this.horsepower = horsepower;
    }

    public int getHorsepower() {
        return horsepower;
    }
    public void setHorsepower(int horsepower) {
        if (horsepower > 0) {
            this.horsepower = horsepower;
        }
    }

    public void start() {
        System.out.println("Engine with " + horsepower + " HP is starting.");
    }
}
