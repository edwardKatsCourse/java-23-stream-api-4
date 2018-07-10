package com.company.rich_poor;

import com.company.rich_poor.repository.PersonRepository;

import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    static PersonRepository personRepository = new PersonRepository();

    public static void main(String[] args) {

        System.out.println("Basic persons");
        personRepository.getBasicPerson().stream()
                .collect(Collectors.toList())
                .forEach(x -> System.out.println(x));

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("----------------");
        System.out.println();
        System.out.println();
        System.out.println();
        while (true) {


            System.out.println("Search by last name:");
            String lastName = new Scanner(System.in).nextLine();

            if (lastName.equals("q")) {
                System.exit(0);
            }

            printBasicPersons(lastName);

            System.out.println();
            System.out.println();
            System.out.println("-------------");
            System.out.println();
            System.out.println();
            System.out.println("Search by company name: ");
            String companyName = new Scanner(System.in).nextLine();
            if (companyName.equals("q")) {
                System.exit(0);
            }
            personRepository.searchPersonsByCompanyName(companyName)
                    .forEach(x -> System.out.println(x));


            System.out.println("Search by city:");
            String city = new Scanner(System.in).nextLine();
            if (city.equals("q")) {
                System.exit(0);
            }

            System.out.println("Street (enter to skip): ");
            String street = new Scanner(System.in).nextLine();
            if (city.equals("q")) {
                System.exit(0);
            }

            if (street == null || street.trim().isEmpty()) {
                personRepository.getPersonAddress(city)
                        .forEach(x -> System.out.println(x));
            } else {
                personRepository.getPersonAddress(city, street)
                        .forEach(x -> System.out.println(x));
            }

        }
    }

    public static void printBasicPersons(String lastName) {
        if (lastName == null || lastName.trim().isEmpty()) {

            personRepository.getBasicPerson()
                    .stream()
                    .limit(10)
                    .forEach(x -> System.out.println(x));
        } else {

            personRepository.searchPersonsByLastName(lastName)
                    .stream()
                    .limit(10)
                    .forEach(x -> System.out.println(x));
        }
    }

    public static void printBasicPersons() {
        printBasicPersons(null);
    }
}
