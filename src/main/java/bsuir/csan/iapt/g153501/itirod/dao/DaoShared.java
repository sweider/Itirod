package bsuir.csan.iapt.g153501.itirod.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 * Created by alex on 11/25/14.
 */
@Component
public class DaoShared {
    @Autowired
    public EntityManagerFactory factory;

    @Bean
    public EntityManager getEntityManager(){
        return this.factory.createEntityManager();
    }
}
