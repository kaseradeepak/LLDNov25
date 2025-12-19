package com.scaler.oops.designpatterns.prototype;

public class IntelligentStudent extends Student {
    public int iq;

    IntelligentStudent(IntelligentStudent intelligentStudent) {
//        this.name = intelligentStudent.name;
//        this.age = intelligentStudent.age;
//        this.batch = intelligentStudent.batch;

        super(intelligentStudent);
        this.iq = intelligentStudent.iq;
    }

    IntelligentStudent() {

    }

    @Override
    public Student clone() {
        //Create a copy of IntelligentStudent object.
        return new IntelligentStudent(this);
    }
}


// IntelligentStudent is = new IntelligentStudent();
