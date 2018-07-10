package com.company.rich_poor.repository;

import com.company.rich_poor.model.BasicPerson;
import com.company.rich_poor.model.PersonAddress;
import com.company.rich_poor.model.PersonCompany;
import com.company.rich_poor.model.RichPerson;
import com.company.rich_poor.utils.RandomLibrary;
import com.company.rich_poor.utils.TransformationUtils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PersonRepository {

    private static List<RichPerson> personList = new ArrayList<>();

    static {

        for (int i = 0; i < 100; i++) {
            RichPerson richPerson = new RichPerson(
                    RandomLibrary.getFirstName(),
                    RandomLibrary.getLastName(),
                    RandomLibrary.getDateOfBirth(),
                    "Israel",
                    RandomLibrary.getCity(),
                    RandomLibrary.getStreet(),
                    RandomLibrary.getHouseNumber(),
                    RandomLibrary.getFloor(),
                    RandomLibrary.getApartment(),
                    "000000",
                    RandomLibrary.getCompany(),
                    RandomLibrary.getPosition(),
                    RandomLibrary.getCity() + ",  " + RandomLibrary.getStreet(),
                    RandomLibrary.getPhoneNumber(),
                    RandomLibrary.getPhoneNumber()
            );
            personList.add(richPerson);

            personList = personList
                    .stream()
                    .sorted(Comparator.comparing(RichPerson::getLastName))
                    .collect(Collectors.toList());
        }
    }


    public List<PersonAddress> getPersonAddressList() {
        return personList
                .stream()
                .map(richPerson -> TransformationUtils.getPersonAddress(richPerson))
                .collect(Collectors.toList());
    }

    public List<PersonCompany> getPersonCompanyList() {
        return personList
                .stream()
                .map(richPerson -> TransformationUtils.getPersonCompany(richPerson))
                .collect(Collectors.toList());
    }

    public List<BasicPerson> getBasicPerson() {
        return personList
                .stream()
                .map(richPerson -> TransformationUtils.getBasicPerson(richPerson))
                .collect(Collectors.toList());
    }

    public List<BasicPerson> searchPersonsByLastName(String lastName) {
        return personList
                .stream()
                .filter(x -> x.getLastName().equals(lastName))
                .map(richPerson -> TransformationUtils.getBasicPerson(richPerson))
                .collect(Collectors.toList());
    }

    public List<BasicPerson> searchPersonsByCompanyName(String companyName) {
        return personList
                .stream()
                .filter(richPerson -> richPerson.getCompanyName().equals(companyName))
                .map(richPerson -> TransformationUtils.getBasicPerson(richPerson))
                .collect(Collectors.toList());
    }

    public List<PersonAddress> getPersonAddress(String city) {
        return personList
                .stream()
                .filter(x -> x.getCity().equalsIgnoreCase(city))
                .map(x -> TransformationUtils.getPersonAddress(x))
                .collect(Collectors.toList());
    }


    public List<PersonAddress> getPersonAddress(String city, String street) {
        return personList
                .stream()
                .filter(x -> x.getCity().equalsIgnoreCase(city) && x.getStreet().equalsIgnoreCase(street))
                .map(x -> TransformationUtils.getPersonAddress(x))
                .collect(Collectors.toList());
    }
}
