package com.kodilla.abstracts.homework.Jobs;

public abstract class Job {

    private int salary;
    private String responsibilities;



    public int getSalary();

    public String getResponsibilities();


    public Job (int salary, String responsibilities){
        this.salary= salary;
        this.responsibilities= responsibilities;
    }
}
