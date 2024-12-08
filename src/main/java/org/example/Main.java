package org.example;

import org.example.autowiring.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("autowireByType.xml");

        // Retrieve the 'car' bean
        Car car = (Car) context.getBean("car");

        // Call the 'drive' method to see the output
        car.drive();
    }
}