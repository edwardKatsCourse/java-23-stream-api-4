package com.company.rich_poor.utils;

import com.company.rich_poor.model.BasicPerson;
import com.company.rich_poor.model.PersonAddress;
import com.company.rich_poor.model.PersonCompany;
import com.company.rich_poor.model.RichPerson;

public class TransformationUtils {

    public static BasicPerson getBasicPerson(RichPerson richPerson) {
        return new BasicPerson(
                richPerson.getFirstName(),
                richPerson.getLastName(),
                richPerson.getDateOfBirth(),
                richPerson.getPhoneNumber(),
                richPerson.getAdditionalPhoneNumber()
        );
    }

    public static PersonCompany getPersonCompany(RichPerson richPerson) {
        return new PersonCompany(
                richPerson.getFirstName(),
                richPerson.getLastName(),
                richPerson.getCompanyName(),
                richPerson.getPositionName(),
                richPerson.getCompanyAddress()
        );
    }

    public static PersonAddress getPersonAddress(RichPerson richPerson) {
        return new PersonAddress(
                richPerson.getFirstName(),
                richPerson.getLastName(),
                richPerson.getDateOfBirth(),
                richPerson.getCountry(),
                richPerson.getCity(),
                richPerson.getStreet(),
                richPerson.getHouseNumber(),
                richPerson.getFloor(),
                richPerson.getApartmentNumber(),
                richPerson.getPostcode()
        );
    }
}
