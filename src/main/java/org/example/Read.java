package org.example;

import org.example.models.Capital;
import org.example.models.Country;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Read {

    public static void main(String[] args) {

        // create EntityManager
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("example");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // get records
        Country country = entityManager.find(Country.class, 1);
        Capital capital = country.getCapital();
        System.out.println(capital.toString());

        // close entity manager
        entityManager.close();
        entityManagerFactory.close();
    }
}
