package com.imooc.hello.spring_demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext application = new ClassPathXmlApplicationContext("spring-config.xml");

    	Person person = (Person) application.getBean("person");

        //Person person = (Person)factory.getBean("person");

       person.Introduce();
    }
}
