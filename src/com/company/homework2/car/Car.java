package com.company.homework2.car;

public class Car {

    private String model;
    private int weight;
    Helm helm;
    Wheel wheel;
    Cab cab;

    public Car(String model, int weight, Helm helm, Wheel wheel, Cab cab) {
        this.model = model;
        this.weight = weight;
        this.helm = helm;
        this.wheel = wheel;
        this.cab = cab;
    }

    public void changeModel(String newModel){

        this.model = newModel;
    }

    public void changeWeight(int newWeight){

        this.weight =  newWeight;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Helm getHelm() {
        return helm;
    }

    public void setHelm(Helm helm) {
        this.helm = helm;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Cab getCab() {
        return cab;
    }

    public void setCab(Cab cab) {
        this.cab = cab;
    }
}
