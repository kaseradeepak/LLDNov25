package com.scaler.oops.designpatterns.prototype;

public class Client {
    public static void fillRegistry(StudentRegistry registry) {
        Student lldMwfEveningPrototype = new Student();
        lldMwfEveningPrototype.setBatch("LLD MWF Evening Batch");
        lldMwfEveningPrototype.setAvgPsp(90.5);

        registry.put("LLDEvenPrototype", lldMwfEveningPrototype);

        IntelligentStudent intelligentStudentPrototype = new IntelligentStudent();
        intelligentStudentPrototype.setBatch("Intelligent Batch");
        intelligentStudentPrototype.setAvgPsp(95.7);

        registry.put("intelligentStudentPrototype", intelligentStudentPrototype);
    }


    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        Student inesh = studentRegistry.get("LLDEvenPrototype").clone();
        inesh.setName("Inesh");
        inesh.setPsp(86.8);

        Student manvendra = studentRegistry.get("intelligentStudentPrototype").clone();
        ((IntelligentStudent)manvendra).iq = 150;

        System.out.println("DEBUG");
    }
}
