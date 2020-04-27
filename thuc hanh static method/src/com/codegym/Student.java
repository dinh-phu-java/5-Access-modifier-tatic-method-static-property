package com.codegym;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";
    public Student(int r,String n){
        this.rollno=r;
        this.name=n;
    }
    static void change(){
        college="CODEGYM";
    }
    public void display(){
        System.out.println(this.rollno+ " "+this.name+" "+college);
    }
}
