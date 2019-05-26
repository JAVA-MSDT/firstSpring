package com.serenity.firstSpring.runner;

import com.serenity.firstSpring.bean.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = applicationContext.getBean("person", Person.class);
        System.out.println("Person id: " + person.getId() + ", Person Name: " + person.getName());

        Person person1 = applicationContext.getBean("person1", Person.class);
        System.out.println("Person id One: " + person1.getId() + ", Person Name One: " + person1.getName());
        
        applicationContext.close();

    }
}
