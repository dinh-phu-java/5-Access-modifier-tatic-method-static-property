package com.codegym;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();
        Student s1= new Student(11,"hoang");
        Student s2=new Student(12,"tham");
        Student s3= new Student(14,"nam");

        s1.display();
        s2.display();
        s3.display();

    }
}
