package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AnimalsDAO {
    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("rt");

    public static void insert(Animals animals){

        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(animals);
        em.getTransaction().commit();
        em.close();
    }


    public static void update(int id2, String ages) {
        EntityManager em1 = emf.createEntityManager();
        em1.getTransaction().begin();
        Animals animals = em1.find(Animals.class,id2);
        animals.setAge(ages);
        em1.merge(animals);
        em1.getTransaction().commit();
        em1.close();

    }

    public static void delete(int tid) {
        EntityManager em5 = emf.createEntityManager();
        em5.getTransaction().begin();
        Animals anima = em5.find(Animals.class,tid);
        em5.remove(anima);
        em5.getTransaction().commit();
        em5.close();
    }


}
