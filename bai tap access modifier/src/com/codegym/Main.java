package com.codegym;

public class Main {
    public static void main(String[] args){
        Circle circle= new Circle(18.5);
        double a=circle.getArea();
        System.out.println(String.format("Area is %.2f",a));
    }
}
