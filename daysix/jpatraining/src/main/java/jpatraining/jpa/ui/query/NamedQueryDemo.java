package main.java.jpatraining.jpa.ui.query;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import main.java.jpatraining.entities.AirFlight;


public class NamedQueryDemo {
	private static EntityManagerFactory EMF=null;
	private static EntityManager em=null;
	
	public static void main(String[] args) {
		try {
			EMF=Persistence.createEntityManagerFactory("training");
			em=EMF.createEntityManager();
			
			Query q1= em.createNamedQuery("allFlights");
			List<AirFlight> airFlights=q1.getResultList();
			System.out.println(airFlights);
			System.out.println("-------------------------");			
			TypedQuery<AirFlight> q2= 
					em.createNamedQuery("flightsToChennai", AirFlight.class);
			List<AirFlight> flightsToChennai= q2.getResultList();
			System.out.println(flightsToChennai);
		}catch(PersistenceException e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		}finally {
			em.close();
			EMF.close();
		}
		

	}

}
