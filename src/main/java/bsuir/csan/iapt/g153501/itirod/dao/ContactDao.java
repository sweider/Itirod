package bsuir.csan.iapt.g153501.itirod.dao;

import bsuir.csan.iapt.g153501.itirod.domain.Contact;

import java.util.List;

/**
 * Created by alex on 11/25/14.
 */
public interface ContactDao {
    public void addContact(Contact contact);

    public List<Contact> listContact();

    public void removeContact(Integer id);
}
