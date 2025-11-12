package com.scaler.oops.lecture1;

public class Student {
    public String name;
    int age;
    String batch;
    double psp;
    double attendance;

    Student() {

    }

    Student(String name) {
        this.name = name;
    }

//    Student(String batch) {
//        this.batch = batch;
//    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    Student(int age, String name) {
//
//    }
//
//    Student(String name, String batch, int psp) {
//        this.name = name;
//        this.batch = batch;
//        this.psp = 100.0;
//    }

    //custom constructor.
    Student(String name, int age, String batch, double psp, double attendance) {
        this.name = name;
        this.age = age;
        this.batch = batch;
        this.psp = psp;
        this.attendance = attendance;
    }

    Student(Student student) {
        this.name = student.name;
        this.age = student.age;
        this.batch = student.batch;
        this.psp = student.psp;
        this.attendance = student.attendance;
    }

    void bookMockInterview() {
        System.out.println("Booking Mock Interview");
    }
}

//
//Student("", 25);
//Student(25, "");