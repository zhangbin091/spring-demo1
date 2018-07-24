package com.imooc.hello.spring_demo1;

public class Person {
	private String name;

    private String age;

    private Region region;

    public String getName() {

       return name;

    }

 

    public void setName(String name) {

       this.name =name;

    }

 

    public String getAge() {

       return age;

    }

 

    public void setAge(String age) {

       this.age =age;

    }

 

    private String discribe;

   

    public Person(Region region,String discribe){

       this.region =region;

       this.discribe =discribe;

    }

   

    public void Introduce(){

       System.out.println("I am " +name +",I comefrom " +region +"my age is" +age);

       System.out.println(discribe);

    }
}
