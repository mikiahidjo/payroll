package com.startup.entity.demographic;

public class Identity {
    private String identityType,identityValue;

    private Identity(Builder builder){
        this.identityType = builder.identityType;
        this.identityValue = builder.identityValue;
    }

    public String getIdentityType() {
        return identityType;
    }

    public String getIdentityValue() {
        return identityValue;
    }

    @Override
    public String toString() {
        return "Identity{" +
                "type='" + identityType + '\'' +
                ", identityValue='" + identityValue + '\'' +
                '}';
    }

    public static class Builder{
        private String identityType,identityValue;
        public Builder SetIdentitytype(String identityType){
            this.identityType = identityType;
            return this;
        }
        public Builder setIdentityDesc(String identityValue){
           this.identityValue = identityValue;
           return this;
        }
        public Builder copy(Identity identity){
            this.identityType = identity.identityType;
            this.identityValue = identity.identityValue;
            return this;
        }
        public Builder copy(Builder builder){
            this.identityType = builder.identityType;
            this.identityValue = builder.identityValue;
            return this;
        }
        public Identity build(){
            return new Identity(this);
        }
    }
}
