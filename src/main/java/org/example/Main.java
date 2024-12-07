package org.example;

import org.example.myBean.MyBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        // ApplicationContext is an interface representing the IOC Container of Spring
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationBeanContext.xml");
        /* ClassPathXmlApplicationContext is an specific implementation of the ApplicationContext
         loading the configuration from xml file and configuring the container */

        MyBean myBean = (MyBean) applicationContext.getBean("myBean");

        MyBean myBean1 = (MyBean) applicationContext.getBean("myBean2");

        System.out.println("Bean = "+myBean);

        System.out.println("Bean1 = "+myBean1);
    }
}