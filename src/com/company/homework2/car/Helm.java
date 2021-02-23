package com.company.homework2.car;

public class Helm {
    private int diam;
    private String material;

    public int changeDiam(int k){

        return diam * k;
    }

    public Helm(int diam, String material) {
        this.diam = diam;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Helm{" +
                "diam=" + diam +
                ", material='" + material + '\'' +
                '}';
    }

    public int getDiam() {
        return diam;
    }

    public void setDiam(int diam) {
        this.diam = diam;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
