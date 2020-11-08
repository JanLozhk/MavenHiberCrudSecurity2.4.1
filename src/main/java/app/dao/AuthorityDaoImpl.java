package app.dao;

import app.model.Authority;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class AuthorityDaoImpl {

    @PersistenceContext
    EntityManager entityManager;

    public void create(Authority authority) {
        entityManager.persist(authority);
    }

}
