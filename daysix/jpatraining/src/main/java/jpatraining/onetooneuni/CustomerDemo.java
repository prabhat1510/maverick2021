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
            customerNew.setId(Long.valueOf(15));
            CustomerInfo customerInfo = new CustomerInfo();
            //customerInfo.setId(customerNew.getId());
            customerInfo.setId(Long.valueOf(15));
            customerNew.setCustomerInfo(customerInfo);
            //persist only customer, no need to persist customerinfo explicitly
            em.persist(customerNew);
            em.getTransaction().commit();

        } catch (PersistenceException e) {
            e.printStackTrace();
        } finally {
            em.close();
            factory.close();
        }
    }
}