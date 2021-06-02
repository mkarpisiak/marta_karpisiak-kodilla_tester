package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String name;
    private double height;
    private double width;
    private boolean clean;

public Stamp (String name, double height, double width, boolean clean) {
    this.name = name;
    this.height = height;
    this.width = width;
    this.clean = clean;
}
@Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Stamp stamp = (Stamp) o;
        return Objects.equals(name, stamp.name)
                && Objects.equals(height, stamp.height)
                && Objects.equals(width, stamp.width)
                && Objects.equals(clean, stamp.clean);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, height, width, clean);
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
