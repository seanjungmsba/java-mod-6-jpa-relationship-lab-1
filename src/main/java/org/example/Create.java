package org.example;

import org.example.models.Capital;
import org.example.models.Country;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Create {
    public static void main(String[] args) {

        // create country instances
        Country country1 = new Country();
        country1.setName("Japan");

        Country country2 = new Country();
        country2.setName("France");

        // create capital instances
        Capital capital1 = new Capital();
        capital1.setName("Tokyo");
        capital1.setMetropolitan(true);

        Capital capital2 = new Capital();
        capital2.setName("Paris");
        capital2.setMetropolitan(true);

        // create country-capital associations
        country1.setCapital(capital1);
        country2.setCapital(capital2);

        // create EntityManager
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("example");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // access transaction object
        EntityTransaction transaction = entityManager.getTransaction();

        // create and use transactions
        transaction.begin();
        entityManager.persist(country1);
        entityManager.persist(country2);
        entityManager.persist(capital1);
        entityManager.persist(capital2);
        transaction.commit();

        // close entity manager
        entityManager.close();
        entityManagerFactory.close();
    }
}