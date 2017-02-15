package com.efimchick.springshelf.contexttryots;

import com.efimchick.springshelf.pirates.Pirate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Map;

/**
 * Created by EE on 2017-02-07.
 */
public class SetterAndConstructorInjectionExample {
    public static void main(String[] args) {
        ApplicationContext context = new GenericXmlApplicationContext("configs/setter-and-constructor-injection-example.xml");
        Map<String, Pirate> pirates = context.getBeansOfType(Pirate.class);
        System.out.println(pirates);
    }
}
