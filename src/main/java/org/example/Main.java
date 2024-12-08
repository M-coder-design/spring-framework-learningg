package org.example;

import org.example.setterInjection.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("setterInjectionContext.xml");

        Car car = (Car) context.getBean("car");
        car.drive();
    }
}