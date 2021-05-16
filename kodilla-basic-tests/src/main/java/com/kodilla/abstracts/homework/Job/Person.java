package com.kodilla.abstracts.homework.Job;


public class Person {

    private String firstName;
    private int age;

    public Person (String firstName, int age) {
        this.firstName= firstName;
        this.age= age;

    }

    public String getFirstName(){
        return firstName;
    }

    public int getAge(){
        return age;
    }


    public static void main(String[] args) {

        Person dominik = new Person("Dominik", 32);
        Boss boss = new Boss("Bossing around!", 10000000);

        System.out.println("Hi, my name is " + dominik.getFirstName() + ". I'm responsible for: " + boss.getResponsibilities() );

    }
}

