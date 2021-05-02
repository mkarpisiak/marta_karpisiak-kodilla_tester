package com.kodilla.abstracts.homework.Jobs;


public class Person {

    private String firstName;
    private int age;
    private String job;

    public Person(String firstName, int age, String job) {
        this.firstName= firstName;
        this.age= age;
        this. job= job;

    }

    public String getFirstName(){
        return firstName;
    }

    public int getAge(){
        return age;
    }

    public String getJob(){
        return job;
    }

    Person dominik = new Person( "Dominik", 32, "CEO");


    public void ShowYourResponsibilities (){
        System.out.println("Hi, my name is " + dominik.firstName +". I'm responsible for:" +  boss.responsibilities);
    }


}
