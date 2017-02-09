package com.efimchick.contexttryots;

import com.efimchick.pirates.Pirate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by EE on 2017-02-07.
 */
public class AnnotationInjectionExample {
    public static void main(String[] args) {
        ApplicationContext context = new GenericXmlApplicationContext("configs/annotation-injections-example.xml");
        Pirate pirate = context.getBean(Pirate.class);
        System.out.println(pirate);
    }
}
