package com.company.rich_poor.model;

public class PersonCompany {

    private String firstName;
    private String lastName;

    private String companyName;
    private String positionName;
    private String companyAddress;

    public PersonCompany(String firstName, String lastName, String companyName, String positionName, String companyAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.companyName = companyName;
        this.positionName = positionName;
        this.companyAddress = companyAddress;
    }

    public PersonCompany() {
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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    @Override
    public String toString() {
        return "PersonCompany{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", companyName='" + companyName + '\'' +
                ", positionName='" + positionName + '\'' +
                ", companyAddress='" + companyAddress + '\'' +
                '}';
    }
}
