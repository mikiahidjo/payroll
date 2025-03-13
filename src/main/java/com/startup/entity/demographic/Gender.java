package com.startup.entity;

public class Gender {
    private String genderId, genderDesc;

    private Gender(Builder builder){
        this.genderId = builder.genderId;
        this.genderDesc = builder.genderDesc;
    }

    public String getGenderId() {
        return genderId;
    }

    public String getGenderDescription() {
        return genderDesc;
    }

    @Override
    public String toString() {
        return "Gender{" +
                "id='" + genderId + '\'' +
                ", description='" + genderDesc + '\'' +
                '}';
    }

    public static class Builder{
        private String genderId, genderDesc;

        public Builder setGenderId(String genderId){
            this.genderId= genderId;
            return this;
        }
        public Builder setGenderDescription(String genderDesc){
            this.genderDesc = genderDesc;
            return this;
        }
        public Builder copy(Gender gender){
            this.genderId = gender.genderId;
            this.genderDesc = gender.genderDesc;
            return this;
        }
        public Gender build(){
            return new Gender(this);
        }
    }
}
