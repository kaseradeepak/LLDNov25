package com.scaler.oops.designpatterns.builder;

import javax.swing.plaf.synth.SynthToolTipUI;

public class Client {
    public static void main(String[] args) {
//        Builder builder = new Builder();

//        Builder builder = Student.getBuilder();
//        builder.setName("Amit");
//        builder.setBatch("LLD Evening batch");
//        builder.setPsp(93.5);
//        builder.setGradYear(2026);
//        builder.setAge(21);
//
//        Student student = new Student(builder);

//        Builder builder = Student.getBuilder();
//        builder.setName("Amit");
//        builder.setBatch("LLD Evening batch");
//        builder.setPsp(93.5);
//        builder.setGradYear(2026);
//        builder.setAge(21);
//
//        Student student = builder.build();

        //Method Chaining.


        Student student = Student.getBuilder()
                                .setName("Amit")
                                .setAge(25)
                                .setBatch("LLD Evening batch")
                                .setPsp(90.0)
                                .setGradYear(2026)
                                .build();



        System.out.println("DEBUG");
    }
}

/**
 * 1. getBuilder() static method
 * 2. Make the Builder class static
 * 3. build method in Builder class.
 * 4. Make the setters of Builder class return Builder object.
 *
 * Why we made setters return Builder object -> To support Method chaining.
 */
