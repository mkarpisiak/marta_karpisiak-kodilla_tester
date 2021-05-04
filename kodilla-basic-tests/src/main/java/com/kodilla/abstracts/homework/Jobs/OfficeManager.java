package com.kodilla.abstracts.homework.Jobs;

public class OfficeManager extends Job {

    private int salary;
    private String responsibilities;

    public int getSalary(){
        return salary;
    }

    public String getResponsibilities(){
        return responsibilities;
    }


    public OfficeManager(int salary, String responsibilities) {
        this.salary = salary;
        this.responsibilities = responsibilities;
    }
}