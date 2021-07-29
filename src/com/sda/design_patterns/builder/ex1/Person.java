package com.sda.design_patterns.builder.ex1;

import java.util.Date;

public class Person {

    private final String CNP;
    private final String lastName;
    private final String firstName;
    private final Date dateOfBirth;
    private final String gender;
    private final String emailAddress;
    private final String phoneNumber;
    private final String address;
    private final String studies;
    private final String religion;


    public String getCNP() {
        return CNP;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getStudies() {
        return studies;
    }

    public String getReligion() {
        return religion;
    }

    @Override
    public String toString() {
        return "Person{" +
                "CNP='" + CNP + '\'' +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender='" + gender + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", studies='" + studies + '\'' +
                ", religion='" + religion + '\'' +
                '}';
    }
    private Person(PersonBuilder builder) {
        this.CNP = builder.CNP;
        this.lastName =builder.lastName;
        this.firstName = builder.firstName;
        this.dateOfBirth = builder.dateOfBirth;
        this.gender = builder.gender;
        this.emailAddress = builder.emailAddress;
        this.phoneNumber = builder.phoneNumber;
        this.address = builder.address;
        this.studies = builder.studies;
        this.religion= builder.religion;
    }

    public static class PersonBuilder {

        private final String CNP;
        private final String lastName;
        private final String firstName;
        private final Date dateOfBirth;
        private final String gender;

        private String emailAddress;
        private String phoneNumber;
        private String address;
        private String studies;
        private String religion;

        public PersonBuilder(String CNP, String lastName, String firstName, Date dateOfBirth, String gender) {
            this.CNP = CNP;
            this.lastName = lastName;
            this.firstName = firstName;
            this.dateOfBirth = dateOfBirth;
            this.gender = gender;
        }

        public PersonBuilder setEmailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        public PersonBuilder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public PersonBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public PersonBuilder setStudies(String studies) {
            this.studies = studies;
            return this;
        }

        public PersonBuilder setReligion(String religion) {
            this.religion = religion;
            return this;
        }
    }



}
