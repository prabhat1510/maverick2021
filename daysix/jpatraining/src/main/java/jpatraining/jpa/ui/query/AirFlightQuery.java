package main.java.jpatraining.jpa.ui.query;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.TemporalType;
import javax.persistence.TypedQuery;

import main.java.jpatraining.entities.AirFlight;




public class AirFlightQuery {
	private static EntityManagerFactory EMF=null;
	private static EntityManager em=null;
	public static void main(String [] args) {
		try {
			EMF=Persistence.createEntityManagerFactory("training");
			em=EMF.createEntityManager();			
			SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");
			String start="13:00:00";
			String end="21:00:00";
			try {
				String query="SELECT af FROM AirFlight af " +
						"WHERE af.departureTime BETWEEN :start AND :end";
				TypedQuery<AirFlight> tq=
						em.createQuery(query,AirFlight.class)
				.setParameter("start", sdf.parse(start), TemporalType.TIME)
				.setParameter("end", sdf.parse(end), TemporalType.TIME);	
				
				List<AirFlight> airFlights= tq.getResultList();
				System.out.println(airFlights);				
			} catch (ParseException e) {				
				e.printStackTrace();
			} 			
		}catch(PersistenceException e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		}finally {
			em.close();
			EMF.close();
		}
	}
}
