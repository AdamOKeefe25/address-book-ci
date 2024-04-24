package com.example.addressbook.model;

import java.util.ArrayList;
import java.util.List;

/**
 * A class that represent users with permissions to manage contacts in the database.
 */
public class ContactManager {
    /**
     * The data access object assigned to the user.
     */
    private IContactDAO contactDAO;

    /**
     * Constructs a new ContactManager with the specified data access object.
     * @param contactDAO The data access object to manage contacts
     */
    public ContactManager(IContactDAO contactDAO) {
        this.contactDAO = contactDAO;
    }

    /**
     * Filters the contact list by a specific term.
     * @param query The search term entered by the user
     * @return The filtered contact list.
     */
    public List<Contact> searchContacts(String query) {
        return contactDAO.getAllContacts()
                .stream()
                .filter(contact -> isContactMatched(contact, query))
                .toList();
    }

    /**
     * Checks to see if a given search term matches a contact in the database.
     * @param contact The contact to be matched
     * @param query The search term entered by the user
     * @return True iff the contact matches the query term.
     */
    private boolean isContactMatched(Contact contact, String query) {
        if (query == null || query.isEmpty()) return true;
        query = query.toLowerCase();
        String searchString = contact.getFullName()
                + " " + contact.getEmail()
                + " " + contact.getPhone();
        return searchString.toLowerCase().contains(query);
    }

    /**
     * Adds a new contact to the database.
     * @param contact The contact to add.
     */
    public void addContact(Contact contact) {
        contactDAO.addContact(contact);
    }

    /**
     * Deletes a contact from the database.
     * @param contact The contact to delete.
     */
    public void deleteContact(Contact contact) {
        contactDAO.deleteContact(contact);
    }

    /**
     * Updates an existing contact in the database.
     * @param contact The contact to update.
     */
    public void updateContact(Contact contact) {
        contactDAO.updateContact(contact);
    }

    /**
     * Retrieves all contacts from the database.
     * @return A list of all contacts in the database.
     */
    public List<Contact> getAllContacts() {
        return contactDAO.getAllContacts();
    }
}