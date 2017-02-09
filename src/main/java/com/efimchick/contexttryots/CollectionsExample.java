package com.efimchick.contexttryots;

import com.efimchick.pirates.Crew;
import com.efimchick.pirates.Pirate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Map;

/**
 * Created by EE on 2017-02-07.
 */
public class CollectionsExample {
    public static void main(String[] args) {
        ApplicationContext context = new GenericXmlApplicationContext("configs/collections-example.xml");
        Map<String, Crew> crews = context.getBeansOfType(Crew.class);
        System.out.println(crews);
    }
}
