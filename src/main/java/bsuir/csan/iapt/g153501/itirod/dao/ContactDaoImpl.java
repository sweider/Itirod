package bsuir.csan.iapt.g153501.itirod.dao;

import bsuir.csan.iapt.g153501.itirod.domain.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * Created by alex on 11/25/14.
 */
@Component
public class ContactDaoImpl implements ContactDao {
    @PersistenceContext
    @Autowired
    private EntityManager entityManager;

    public ContactDaoImpl() {
    }

    @Override
    public void addContact(Contact contact) {
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(contact);
        this.entityManager.getTransaction().commit();
    }

    @Override
    public List<Contact> listContact() {
        CriteriaBuilder builder = this.entityManager.getCriteriaBuilder();
        CriteriaQuery<Contact> cq = builder.createQuery(Contact.class);
        Root<Contact> cont = cq.from(Contact.class);
        List<Contact> contacts = this.entityManager.createQuery(cq).getResultList();
        return contacts;
    }

    @Override
    public void removeContact(Integer id) {
        Contact contact = this.entityManager.find(Contact.class, id);
        this.entityManager.detach(contact);
        this.entityManager.flush();
    }
}
