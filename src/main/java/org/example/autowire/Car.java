package org.example.autowire;

public class Car {
    private Engine engine;

    // Constructor-based injection
    public Car(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        engine.start();
        System.out.println("Car is driving...");
    }
}