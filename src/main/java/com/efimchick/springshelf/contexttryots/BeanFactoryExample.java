package com.efimchick.springshelf.contexttryots;

import com.efimchick.springshelf.pirates.Pirate;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * Created by EE on 2017-02-09.
 */
public class BeanFactoryExample {
    public static void main(String[] args) {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);

        beanDefinitionReader.loadBeanDefinitions("configs/setter-and-constructor-injection-example.xml");

        Pirate pirate = beanFactory.getBean("jack", Pirate.class);

        System.out.println(pirate);
    }
}
