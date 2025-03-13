package com.startup.factory;

import com.startup.entity.Contact;
import com.startup.util.ValidationHelper;

public class ContactFactory {
    public static Contact createContact(String cellPhone, String homePhone, String email){
        if(ValidationHelper.isEmptyOrNullString(cellPhone)|| ValidationHelper.isEmptyOrNullString(homePhone)|| ValidationHelper.isEmptyOrNullString(email)){
            return null;
        }
        return new Contact.Builder()
                .setCellPhone(cellPhone)
                .setHomePhone(homePhone)
                .setEmail(email)
                .build();
    }
}
