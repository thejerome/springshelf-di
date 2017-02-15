package com.efimchick.springshelf.contexttryots;

import com.efimchick.springshelf.pirates.Pirate;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Map;

/**
 * Created by EE on 2017-02-07.
 */
public class ParentingExample {
    public static void main(String[] args) {
        GenericXmlApplicationContext context1 = new GenericXmlApplicationContext();
        context1.load("configs/setter-and-constructor-injection-example.xml");
        context1.refresh();

        GenericXmlApplicationContext context2 = new GenericXmlApplicationContext();
        context2.load("configs/annotation-injections-example.xml");
        context2.setParent(context1);
        context2.refresh();

        System.out.println(context2.getBean("jack"));

        Map<String, Pirate> pirates = context2.getBeansOfType(Pirate.class, true, true);
        System.out.println(pirates);
    }
}
