package com.company.rich_poor.model;

import java.time.LocalDate;

public class BasicPerson {

    private String firstName;
    private String lastName;

    private LocalDate dateOfBirth;

    private String phoneNumber;
    private String additionalPhoneNumber;


    public BasicPerson(String firstName, String lastName, LocalDate dateOfBirth, String phoneNumber, String additionalPhoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.additionalPhoneNumber = additionalPhoneNumber;
    }

    public BasicPerson() {
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAdditionalPhoneNumber() {
        return additionalPhoneNumber;
    }

    public void setAdditionalPhoneNumber(String additionalPhoneNumber) {
        this.additionalPhoneNumber = additionalPhoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "BasicPerson{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", additionalPhoneNumber='" + additionalPhoneNumber + '\'' +
                '}';
    }
}
