package com.kodilla.abstracts.homework.Jobs;

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
     Boss boss = new Boss(100000, "Bossing around!");
     System.out.println(boss.getResponsibilities());


    }




// salary nie na sztywno
}
