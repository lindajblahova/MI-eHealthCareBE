package sk.fri.bioinf.ehealthcare.model;

import java.util.Date;

public class Person {

    private String identificationNumber;
    private String firstName, lastName;
    private Date dateOfBirth;
    private String street;
    private String streetNumber;
    private String city;
    private String state;
    private String telephoneNumber;
    private String email;
    private String contactPersonFirstName, contactPersonLastName;
    private String contactPersonTelephoneNumber, contactPersonEmail;


    public Person(String identificationNumber, String firstName, String lastName, Date dateOfBirth,
                  String street, String streetNumber, String city, String state, String telephoneNumber,
                  String email, String contactPersonFirstName, String contactPersonLastName,
                  String contactPersonTelephoneNumber, String contactPersonEmail) {
        this.identificationNumber = identificationNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.street = street;
        this.streetNumber = streetNumber;
        this.city = city;
        this.state = state;
        this.telephoneNumber = telephoneNumber;
        this.email = email;
        this.contactPersonFirstName = contactPersonFirstName;
        this.contactPersonLastName = contactPersonLastName;
        this.contactPersonTelephoneNumber = contactPersonTelephoneNumber;
        this.contactPersonEmail = contactPersonEmail;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactPersonFirstName() {
        return contactPersonFirstName;
    }

    public void setContactPersonFirstName(String contactPersonFirstName) {
        this.contactPersonFirstName = contactPersonFirstName;
    }

    public String getContactPersonLastName() {
        return contactPersonLastName;
    }

    public void setContactPersonLastName(String contactPersonLastName) {
        this.contactPersonLastName = contactPersonLastName;
    }

    public String getContactPersonTelephoneNumber() {
        return contactPersonTelephoneNumber;
    }

    public void setContactPersonTelephoneNumber(String contactPersonTelephoneNumber) {
        this.contactPersonTelephoneNumber = contactPersonTelephoneNumber;
    }

    public String getContactPersonEmail() {
        return contactPersonEmail;
    }

    public void setContactPersonEmail(String contactPersonEmail) {
        this.contactPersonEmail = contactPersonEmail;
    }
}
