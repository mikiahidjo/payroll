package za.ac.cput.domain;

public class Employee {
    private int employeeNumber;
    private String firstName;
    private String lastName;

    private Employee(){

    }
    private Employee(Builder builder) {
        this.employeeNumber = builder.employeeNumber;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }


    public String getFirstName() {
        return firstName;
    }

       public String getLastName() {
        return lastName;
    }



    @Override
    public String toString() {
        return "Employee{" +
                "employeeNumber=" + employeeNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static class Builder{
        private int employeeNumber;
        private String firstName;
        private String lastName;

        public Builder setEmployeeNumber(int employeeNumber) {
            this.employeeNumber = employeeNumber;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Employee build() {return new Employee(this);}
    }

}
