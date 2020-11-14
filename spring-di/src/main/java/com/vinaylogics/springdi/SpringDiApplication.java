package com.vinaylogics.springdi;

import com.vinaylogics.springdi.controllers.ConstructorInjectedController;
import com.vinaylogics.springdi.controllers.MyController;
import com.vinaylogics.springdi.controllers.PropertyInjectedController;
import com.vinaylogics.springdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

    public static void main(String[] args) {
       ApplicationContext ctx = SpringApplication.run(SpringDiApplication.class, args);
        MyController myController = ctx.getBean("myController", MyController.class);

        String greetings = myController.sayHello();

        System.out.println(greetings);

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
