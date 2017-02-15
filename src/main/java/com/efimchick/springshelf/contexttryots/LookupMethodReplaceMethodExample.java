package com.efimchick.springshelf.contexttryots;

import com.efimchick.springshelf.pirates.AbstractTreasure;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * Created by EE on 2017-02-07.
 */
public class LookupMethodReplaceMethodExample {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        ApplicationContext context = new GenericXmlApplicationContext("configs/lookup-method-replace-method-example.xml");
        AbstractTreasure tr = context.getBean(AbstractTreasure.class);
        System.out.println(tr.getName());
        System.out.println(tr.getValue());

        System.out.println("tr.getName() == tr.getName() = " + (tr.getName() == tr.getName()));

        Class clazz = tr.getClass();
        while (!clazz.getName().equals("com.efimchick.springshelf.pirates.AbstractTreasure")) {
            System.out.println("looking for initial class in"  + clazz.getName());
            clazz = clazz.getSuperclass();
        }

        Field valueField = clazz.getDeclaredField("value");
        valueField.setAccessible(true);
        System.out.println("Value fileld value through reflection = " + valueField.get(tr));

    }

}
