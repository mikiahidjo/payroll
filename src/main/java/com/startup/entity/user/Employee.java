package com.startup.entity;

public class Employee {
    private String employeeNumber, firstName, lastName, nationality;
    private Employee(Builder builder){
        this.employeeNumber = builder.employeeNumber;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.nationality = builder.nationality;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNationality() {
        return nationality;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeNumber='" + employeeNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nationality='" + nationality + '\'' +
                '}';
    }

    public static class Builder{
        private String employeeNumber, firstName, lastName,nationality;

        public Builder setEmployeeNumber(String employeeNumber){
            this.employeeNumber = employeeNumber;
            return this;
        }
        public Builder setFirstName(String firstName){
            this.firstName = firstName;
            return this;
        }
        public Builder setLastName(String lastName){
            this.lastName = lastName;
            return this;
        }
        public Builder setNationality(String nationality){
            this.nationality = nationality;
            return this;
        }

        // copy methods
        public Builder copy(Employee employee){
            this.employeeNumber = employee.employeeNumber;
            this.firstName = employee.firstName;
            this.lastName = employee.lastName;
            this.nationality = employee.nationality;
            return this;
        }
        public Employee build(){
            return new Employee(this);
        }
    }

}
