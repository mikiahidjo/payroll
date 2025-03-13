package com.startup.entity;

public class EmployeeDemography {
    private String employeeNumber, genderId, raceId;

    private EmployeeDemography(Builder builder){
        this.employeeNumber = builder.employeeNumber;
        this.genderId = builder.genderId;
        this.raceId = builder.raceId;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public String getGenderId() {
        return genderId;
    }

    public String getRaceId() {
        return raceId;
    }

    @Override
    public String toString() {
        return "EmployeeDemography{" +
                "employeeNumber='" + employeeNumber + '\'' +
                ", genderId='" + genderId + '\'' +
                ", raceId='" + raceId + '\'' +
                '}';
    }

    public static class Builder{
        private String employeeNumber, genderId, raceId;

        public Builder setEmployeNumber(String employeeNumber){
            this.employeeNumber = employeeNumber;
            return this;
        }
        public Builder setGenderId(String genderId){
            this.genderId = genderId;
            return this;
        }
        public Builder setRaceId(String raceId){
            this.raceId = raceId;
            return this;
        }
        public Builder copy(EmployeeDemography employeeDemography){
            this.employeeNumber = employeeDemography.employeeNumber;
            this.genderId = employeeDemography.genderId;
            this.raceId = employeeDemography.raceId;
            return this;
        }
        public EmployeeDemography build(){
            return  new EmployeeDemography(this);
        }
    }
}
