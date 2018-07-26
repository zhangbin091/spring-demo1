package com.imooc.hello.spring_demo1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonConfig {
	@Bean
    public Person person(){
           Person person =  new Person(regiona(),"a funny man");
           person.setName("liming");
           person.setAge("19");
           return person;
    }

    @Bean
    public Region regiona(){
           Region region = new Region();
           region.setProvince("beijing");
           region.setCity("haidian");
           return region;
    }
}
