package com.kodilla.collections.sets.homework;

public class Stamp {
    private String name;
    private double height;
    private double width;
    private boolean clean;

public Stamp (String name, double height, double width, boolean clean){
    this.name= name;
    this.height = height;
    this.width = width;
    this.clean = clean;

}

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public boolean getClean() {
        return clean;
    }
}
