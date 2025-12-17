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
