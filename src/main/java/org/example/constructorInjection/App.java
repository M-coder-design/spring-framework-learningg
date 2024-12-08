package org.example.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("constructorInjectionContext.xml");

        Car car = (Car) context.getBean("car");
        car.drive();
    }
}
