package com.startup.entity;

public class Employment {
    private EmploymentType employmentType;
    private String employmentDescription;


    public String getEmploymentDescription() {
        return employmentDescription;
    }

    public EmploymentType getEmploymentType() {
        return employmentType;
    }

    public enum EmploymentType{
        CONTRACT, PERMANENT;
    }
    private Employment (Builder builder){
        this.employmentType = builder.employmentType;
        this.employmentDescription = builder.employmentDescription;
    }

    public static class Builder{
        private EmploymentType employmentType = EmploymentType.CONTRACT;
        private String employmentDescription;

        public Builder setEmploymentType(EmploymentType employmentType){
            this.employmentType = employmentType;
            return this;
        }
      public Builder setEmploymentDescription(String employmentDescritpion){
            this.employmentDescription = employmentDescritpion;
            return this;
      }
      public Builder copy(Employment employment){
            this.employmentType = employment.employmentType;
            this.employmentDescription = employment.employmentDescription;
            return this;
      }
      public Employment build(){
            return new Employment(this);
      }
    }
}
