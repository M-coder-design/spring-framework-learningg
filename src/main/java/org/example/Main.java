package org.example;

import org.example.autowire.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Load the Spring context from the XML configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("autowireByConstructor.xml");

        // Retrieve the 'car' bean (which will have the 'engine' bean injected)
        Car car = (Car) context.getBean("car");

        // Call the 'drive' method to see the output
        car.drive();
    }
}