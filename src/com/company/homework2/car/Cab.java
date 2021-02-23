package com.company.homework2.car;

public class Cab {
    private double length;
    private double width;
    private String colour;


    public double changeLength(int k){

        return length * k;
    }
    public double changeWidth(int n){

        return width * n;
    }
    public String changeColour(String newCol){

        return newCol;
    }

    public Cab(double length, double width, String colour) {
        this.length = length;
        this.width = width;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Cab{" +
                "length=" + length +
                ", width=" + width +
                ", colour='" + colour + '\'' +
                '}';
    }

    public double getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
