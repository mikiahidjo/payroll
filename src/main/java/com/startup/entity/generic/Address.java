package com.startup.entity;

public class Address {
    private String streetAddress, postatAddress, city, state, country;

    private Address (Builder builder){
        this.streetAddress = builder.streetAddress;
        this.postatAddress = builder.postatAddress;
        this.city = builder.city;
        this.state = builder.state;
        this.country = builder.country;
    }

    public Address(String streetAddress, String postatAddress, String city, String state, String country) {
        this.streetAddress = streetAddress;
        this.postatAddress = postatAddress;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetAddress='" + streetAddress + '\'' +
                ", postatAddress='" + postatAddress + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
    public static class Builder{
        private String streetAddress, postatAddress, city, state, country;

        public Builder setStreetAddress(String streetAddress){
            this.streetAddress = streetAddress;
            return this;
        }
        public Builder setPostalAddress(String postalAddress){
            this.postatAddress = postalAddress;
            return this;
        }
        public Builder setCity(String city){
            this.city = city;
            return this;
        }
        public Builder setState(String state){
            this.state = state;
            return this;
        }
        public Builder setCountry(String country){
            this.country = country;
            return this;
        }
        public Address build(){
            return new Address(this);
        }

    }

}
