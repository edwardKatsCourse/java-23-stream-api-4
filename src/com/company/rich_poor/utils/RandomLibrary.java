package com.company.rich_poor.utils;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;

public class RandomLibrary {

    private static String[] FIRST_NAMES = {"Jim", "James", "Sarah", "Nikolay", "Jane", "Daria"};
    private static String[] LAST_NAMES = {"AAA", "BBB", "CCC", "Ivanov", "Dale", "Thomason"};

    private static String[] COMPANIES = {"Microsoft", "Malam", "Hevrat Hashmal", "Bezeq"};
    private static String[] POSITIONS = {"CEO", "MANAGER", "SUPERVISOR", "DEVELOPER", "HUMAN RESOURCES"};
    private static String[] STREETS = {"Rotshild", "Herzl", "Tchernihovky", "Ben Gurion", "HaMasger", "HaBonim"};
    private static String[] CITIES = {"Tel-Aviv", "Bat-Yam", "Holon", "Rishon LeZion", "Rehovot", "Haifa", "Jerusalem"};

    public static String getPhoneNumber() {
        //011 45 67
        int[] numbers = new Random()
                .ints(5, 0, 10)
                .toArray();

        //52
        int[] code = new Random().ints(2, 50, 60)
                .toArray();

        String stringCode = "0" + Arrays.stream(code)
                .mapToObj(x -> String.valueOf(x))
                .collect(Collectors.joining());

        String fullNumber = stringCode + Arrays.stream(numbers)
                .mapToObj(x -> String.valueOf(x))
                .collect(Collectors.joining());

        return fullNumber;
    }

    public static Integer getApartment() {
        return new Random().ints(1, 21)
                .findFirst()
                .getAsInt();
    }

    public static Integer getFloor() {
        return new Random().ints(1, 8)
                .findFirst()
                .getAsInt();
    }

    public static String getHouseNumber() {

        return new Random()
                //1..99
                .ints(1, 100)
                //int -> Stream<String>
                //IntStream -> Stream<Integer>
                .mapToObj(x -> Integer.valueOf(x))

                //Stream<Integer> -> Stream<String>
                .map(x -> String.valueOf(x))

                //Подкрути String
                .map(currentHouseNumber -> {
                    String [] letters = {"A", "B", "C", "D"};
                    //To add letter or not to add: that is the question
                    boolean hasSubLetter = new Random().nextBoolean();
                    if (hasSubLetter) {
                        int randomLetter = new Random().nextInt(letters.length);
                        //98 D
                        //87 A
                        return currentHouseNumber + " " + letters[randomLetter];
                    }
                    return currentHouseNumber;
                })
                .findFirst()
                .get();
    }

    public static LocalDate getDateOfBirth() {
        Integer year = new Random()
                .ints(1950, 2001)
                .findFirst()
                .getAsInt();

        Integer month = new Random()
                .ints(1, 13)
                .findFirst()
                .getAsInt();

        Integer day = new Random()
                .ints(1, 28)
                .findFirst()
                .getAsInt();

        return LocalDate.of(year, month, day);
    }

    public static String getCity() {
        int randomIndex = new Random().nextInt(CITIES.length);
        return CITIES[randomIndex];
    }

    public static String getStreet() {
        int randomIndex = new Random().nextInt(STREETS.length);
        return STREETS[randomIndex];
    }

    public static String getFirstName() {
        int randomIndex = new Random().nextInt(FIRST_NAMES.length);
        return FIRST_NAMES[randomIndex];
    }

    public static String getLastName() {
        int randomIndex = new Random().nextInt(LAST_NAMES.length);
        return LAST_NAMES[randomIndex];
    }


    public static String getCompany() {
        int randomIndex = new Random().nextInt(COMPANIES.length);
        return COMPANIES[randomIndex];
    }

    public static String getPosition() {
        int randomIndex = new Random().nextInt(POSITIONS.length);
        return POSITIONS[randomIndex];
    }


}
