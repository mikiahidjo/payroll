package com.startup.factory;

import com.startup.entity.Address;
import com.startup.util.ValidationHelper;

public class AddressFactory {
    public static Address createAddress(String streetAddress, String postalAddress, String city, String state, String country){
        if(ValidationHelper.isEmptyOrNullString(streetAddress)|| ValidationHelper.isEmptyOrNullString(postalAddress)|| ValidationHelper.isEmptyOrNullString(city)
                || ValidationHelper.isEmptyOrNullString(state)|| ValidationHelper.isEmptyOrNullString(country)){
            return null;
        }
        return new Address.Builder()
                .setStreetAddress(streetAddress)
                .setPostalAddress(postalAddress)
                .setCity(city)
                .setState(state)
                .setCountry(country)
                .build();
    }
}
