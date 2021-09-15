package main.java.jpatraining.onetooneuni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

public class EmployeEmbeddableDEMO {
    public static void main(String[] args) {
        EntityManagerFactory factory = null;
        EntityManager em = null;
        try {
            factory =
                    Persistence.createEntityManagerFactory("training");
            em = factory.createEntityManager();

            em.getTransaction().begin();
            ParkingSpot parkingSpot = new ParkingSpot();
            parkingSpot.setId(199);
            parkingSpot.setGarage("Janta Garage");

            EmployeeNew employeeNew = new EmployeeNew();
            employeeNew.setId(17);

            LocationDetails locationDetails = new LocationDetails();
            locationDetails.setOfficeNumber(118);

            parkingSpot.setAssignedTo(employeeNew);
            locationDetails.setParkingSpot(parkingSpot);
            employeeNew.setLocation(locationDetails);
            //persist only customer, no need to persist customerinfo explicitly
            em.persist(employeeNew);
            em.getTransaction().commit();

        } catch (PersistenceException e) {
            e.printStackTrace();
        } finally {
            em.close();
            factory.close();
        }
    }
}
