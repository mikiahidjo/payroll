package com.startup.factory;

import com.startup.entity.demographic.EmployeeDemography;
import com.startup.util.ValidationHelper;

public class EmplyeeDemographyFactory {
    public static EmployeeDemography createEmployeeDemography(String employeeNumber, String genderId, String raceId){
        if(ValidationHelper.isEmptyOrNullString(employeeNumber) || ValidationHelper.isEmptyOrNullString(genderId)|| ValidationHelper.isEmptyOrNullString(raceId)){
            return null;
        }
        return  new EmployeeDemography.Builder()
                .setEmployeNumber(employeeNumber)
                .setGenderId(genderId)
                .setRaceId(raceId)
                .build();
    }
}
