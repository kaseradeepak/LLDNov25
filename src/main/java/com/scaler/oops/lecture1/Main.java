package com.scaler.oops.lecture1;

public class Main {
    public static void main(String[] args) {
//        Student st1 = new Student();
//        Student st2 = new Student();
//        //Student st3 = st1;
//
//        System.out.println(st1);
//
//        System.out.println("Name: " + st1.name);
//        System.out.println("Age: " + st1.age);
//        System.out.println("Batch: " + st1.batch);
//        System.out.println("Psp: " + st1.psp);
//        System.out.println("Attendance: " + st1.attendance);
//
//        st1.name = "Amit";
//
//        System.out.println("Name: " + st1.name);
//
//        System.out.println(st2);
//        //System.out.println(st3);

        //@980
        Student st = new Student("Manvendra", 24, "LLD", 96.5, 99.5);

        System.out.println(st + " before calling fun() method."); // @980
        System.out.println(st.age + " Age  before calling fun() method."); // 24

        fun(st);

        System.out.println(st + " after calling fun() method."); // @980
        System.out.println(st.age + " Age  after calling fun() method."); // 24

        Student st1 = new Student();

        //Q: Create an Student object with only name and age.
//        Student st2 = new Student(); -> Not a good approach.
//        st2.name = "Ronak";
//        st2.age = 23;

        Student st2 = new Student("Ronak", 23);

        Student st3 = new Student("Amit");

        Student st4 = new Student("LLD");

        Student stCopy = new Student(st);

        //System.out.println("DEBUG");
    }

    static void fun(Student st) {
        //st = new Student();
        st.age = 34;
//        System.out.println(st + " Inside fun() method."); // @1020
    }

    // fun();

    //Constructor - special function which creates an object of the class.
    //Default  Constructor - Constructor with no arguments, and it creates an object of the class with default values.
}
