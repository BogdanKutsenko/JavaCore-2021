package com.company.homework2.car;

public class Wheel {
    private int diam;
    private int width;

    public int changeDiam(int k){
        return diam * k;
    }
    public int changeWidth(int n){
        return width * n;
    }

    public Wheel(int diam, int width) {
        this.diam = diam;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "diam=" + diam +
                ", width=" + width +
                '}';
    }

    public int getDiam() {
        return diam;
    }

    public void setDiam(int diam) {
        this.diam = diam;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
