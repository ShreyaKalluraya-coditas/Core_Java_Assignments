package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ZooDAO {
    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("rt");
    public static void insert(Zoo zoo){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(zoo);
        em.getTransaction().commit();
        em.close();

    }

    public static void update(int id8, String city2) {
        EntityManager em9 = emf.createEntityManager();
        em9.getTransaction().begin();
        Zoo zoo8 = em9.find(Zoo.class,id8);
        zoo8.setCity(city2);
        em9.merge(zoo8);
        em9.getTransaction().commit();
        em9.close();
    }

    public static void delete(int zooid) {
        EntityManager em6 = emf.createEntityManager();
        em6.getTransaction().begin();
        Zoo zoos = em6.find(Zoo.class,zooid);
        em6.remove(zoos);
        em6.getTransaction().commit();
        em6.close();
    }
}
