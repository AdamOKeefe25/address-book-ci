package com.example.addressbook.model;

/**
 * A simple model class representing a contact with a first name, last name, email, and phone number.
 */
public class Contact {
    /**
     * The auto-incremental ID assigned to each contact in the database.
     */
    private int id;
    /**
     * The first name of the contact.
     */
    private String firstName;
    /**
     * The last name of the contact.
     */
    private String lastName;
    /**
     * The email address of the contact.
     */
    private String email;
    /**
     * The phone number of the contact.
     */
    private String phone;

    /**
     * Constructs a new Contact with the specified first name, last name, email, and phone number.
     * @param firstName The first name of the contact
     * @param lastName The last name of the contact
     * @param email The email address of the contact
     * @param phone The phone number of the contact
     */
    public Contact(String firstName, String lastName, String email, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }

    /**
     * Obtains the contact ID for a given contact.
     * @return The contact's database ID.
     */
    public int getId() {
        return id;
    }

    /**
     * Delegates an ID number to a given contact.
     * @param id The contact ID from the database
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtains the first name of a given contact.
     * @return The contact's first name.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Applies a given first name to a contact.
     * @param firstName The contact's first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Obtains the last name of a given contact.
     * @return The contact's first name.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Applies a given last name to a contact.
     * @param lastName The contact's last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Obtains the email address of a given contact.
     * @return The contact's email address.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Applies a given email address to a contact.
     * @param email The contact's email address
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Obtains the phone number of a given contact.
     * @return The contact's phone number.
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Applies a given phone number to a contact.
     * @param phone The contact's phone number
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Obtains a contact's first and last name.
     * @return The contact's full name.
     */
    public String getFullName() {
        return firstName + " " + lastName;
    }
}