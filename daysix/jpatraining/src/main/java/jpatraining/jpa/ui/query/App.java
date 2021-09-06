package main.java.jpatraining.jpa.ui.query;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import main.java.jpatraining.entities.AirPassengerProfile;

public class App {
	private static EntityManagerFactory EMF=null;
	private static EntityManager em=null;
	
	public static void main(String[] args) {
		try {
			EMF=Persistence.createEntityManagerFactory("training");
			em=EMF.createEntityManager();
			em.getTransaction().begin();
			String jpql1= "Select apf from AirPassengerProfile apf";
			Query q1= em.createQuery(jpql1);
			List<AirPassengerProfile> passengerList= q1.getResultList();
			//passengerList.stream().forEach(System.out::println);
			System.out.println(passengerList);
			System.out.println("--------------------------------------");
			TypedQuery<AirPassengerProfile> tq1= 
					em.createQuery(jpql1, AirPassengerProfile.class);
			List<AirPassengerProfile> passengerList1=tq1.getResultList();
			System.out.println(passengerList1);
			System.out.println("------------------------------------");
			String jpql2=
					"Select apf from AirPassengerProfile apf "
					+ "where apf.profileId='PFL001'";
			
			TypedQuery<AirPassengerProfile> tq2=
					em.createQuery(jpql2, AirPassengerProfile.class);
			AirPassengerProfile profile= tq2.getSingleResult();
			System.out.println(profile);
			System.out.println("--------Dynamic Queries: named Parameter------------");
			String jpql3=
					"Select apf from AirPassengerProfile apf "
					+ "where apf.profileId=:profile_id";
			
//			TypedQuery<AirPassengerProfile> tq3=
//					em.createQuery(jpql3, AirPassengerProfile.class);
//			tq3.setParameter("profile_id", "PFL001");
			
			TypedQuery<AirPassengerProfile> tq3=
					em.createQuery(jpql3, AirPassengerProfile.class)
					.setParameter("profile_id", "PFL001");	
			AirPassengerProfile profileNew= tq3.getSingleResult();
			System.out.println(profileNew);
			System.out.println("--------Dynamic Queries: ordinal Parameter------------");
			String jpql4=
					"Select apf from AirPassengerProfile apf "
					+ "where apf.profileId=?1";
			TypedQuery<AirPassengerProfile> tq4=
					em.createQuery(jpql4, AirPassengerProfile.class);
			tq4.setParameter(1, "PFL001");		
			AirPassengerProfile passenger= tq4.getSingleResult();
			System.out.println(passenger);
			em.getTransaction().commit();;
		}catch(PersistenceException e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		}finally {
			em.close();
			EMF.close();
		}
		

	}
}
