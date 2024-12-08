package org.example.autowiring;

public class Car {
    private Engine engine;

    // Setter for autowiring
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        engine.start();
        System.out.println("Car is driving...");
    }
}
