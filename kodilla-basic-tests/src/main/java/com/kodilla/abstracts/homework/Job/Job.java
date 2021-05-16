package com.kodilla.abstracts.homework.Job;

public abstract class Job {

    private int salary;
    private String responsibilities;


    public int getSalary(){
        return salary;
    }

    public String getResponsibilities(){
        return responsibilities;
    }


    public Job (String responsibilities, int salary){
        this.responsibilities = responsibilities;
        this.salary = salary;
    }

}
