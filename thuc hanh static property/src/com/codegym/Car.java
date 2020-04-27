package com.codegym;

public class Car {
    private String name;
    private String engine;

    public static int numberOfCar;

    public Car(String name,String engine){
        this.name=name;
        this.engine=engine;
        numberOfCar++;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setEngine(String engine){
        this.engine=engine;
    }
    public String getEngine(){
        return this.engine;
    }
}
