package com.scaler.oops.designpatterns.builder;

public class Student {
    String name;
    int age;
    String batch;
    double psp;
    int gradYear;
    // ....Lot of attrs.

    private Student(Builder builder) {
//        //Validations start.
//        if(builder.getAge() < 18) {
//            throw new RuntimeException("Age must be at least 18");
//        }
//        if (builder.getGradYear() > 2025) {
//            throw new RuntimeException("Grad year must be lesser than 2025");
//        }
//        //Validations end.

        this.name = builder.getName();
        this.age = builder.getAge();
        this.batch = builder.getBatch();
        this.psp = builder.getPsp();
        this.gradYear = builder.getGradYear();
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    /// Inner Class of Student class.
    public static class Builder {
        String name;
        int age;
        String batch;
        double psp;
        int gradYear;
        // ....Lot of attrs.

        private Builder() {

        }

        public Student build() {
            if (this.age < 18) {
                throw new RuntimeException("Age must be at least 18");
            }
            if (this.gradYear < 2025) {
                throw new RuntimeException("GradYear must be at least 2025");
            }

            return new Student(this);
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }
    }
}
