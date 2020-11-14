package com.vinaylogics.springdi;

import com.vinaylogics.springdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

    public static void main(String[] args) {
       ApplicationContext ctx = SpringApplication.run(SpringDiApplication.class, args);
        I18nController i18nController = ctx.getBean("i18nController", I18nController.class);
        System.out.println(i18nController.sayGreeting());

        MyController myController = ctx.getBean("myController", MyController.class);

        System.out.println("----------------- Primary Bean -------------------");

        System.out.println(myController.sayHello());

        System.out.println("--------------- Property ------------------------");
        PropertyInjectedController propertyInjectedController = ctx.getBean("propertyInjectedController",
                PropertyInjectedController.class);

        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("--------------- Setter ----------------------------");
        SetterInjectedController setterInjectedController = ctx.getBean("setterInjectedController",
                SetterInjectedController.class);
        System.out.println(setterInjectedController.getGreeting());
        System.out.println("-------------- Constructor ------------------------");
        ConstructorInjectedController constructorInjectedController = ctx.getBean("constructorInjectedController",
                ConstructorInjectedController.class);
        System.out.println(constructorInjectedController.getGreeting());
    }

}
