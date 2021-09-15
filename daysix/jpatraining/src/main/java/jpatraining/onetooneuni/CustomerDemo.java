package main.java.jpatraining.onetooneuni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

public class CustomerDemo {


    public static void main(String[] args) {
        EntityManagerFactory factory = null;
        EntityManager em = null;
        try {
            factory =
                    Persistence.createEntityManagerFactory("training");
            em = factory.createEntityManager();

            em.getTransaction().begin();
            CustomerNew customerNew = new CustomerNew();
            System.out.println("----Inside customer new----");
            //persist only customer, no need to persist customerinfo explicitly
            em.persist(customerNew);
            em.getTransaction().commit();
            //String message =deleteStudent(student);
            //System.out.println(message);
            //System.out.println("Added one student with address to database.");
        } catch (PersistenceException e) {
            e.printStackTrace();
        } finally {
            em.close();
            factory.close();
        }
    }
}