package bsuir.csan.iapt.g153501.itirod.service;

import bsuir.csan.iapt.g153501.itirod.dao.ContactDao;
import bsuir.csan.iapt.g153501.itirod.domain.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by alex on 11/25/14.
 */
@Service
public class ContactServiceImpl implements ContactService {
    @Autowired
    private ContactDao contactDao;

    @Transactional
    @Override
    public void addContact(Contact contact) {
        this.contactDao.addContact(contact);
    }

    @Override
    @Transactional
    public List<Contact> listContact() {
        return this.contactDao.listContact();
    }

    @Override
    @Transactional
    public void removeContact(Integer id) {
        this.contactDao.removeContact(id);
    }
}
