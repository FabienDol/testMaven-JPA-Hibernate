package com.cgi;

import com.cgi.model.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("company");
        EntityManager em = emf.createEntityManager();

        // crée un employé en db
        /*Employee e1 = new Employee("Frodon", "Sacquet", 5000);
        em.getTransaction().begin();
        em.persist(e1);
        em.getTransaction().commit();*/

        emf.close();

    }
}
