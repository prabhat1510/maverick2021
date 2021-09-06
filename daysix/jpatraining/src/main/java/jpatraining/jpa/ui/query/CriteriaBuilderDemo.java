package main.java.jpatraining.jpa.ui.query;

import main.java.jpatraining.entities.AirPassengerProfile;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;



public class CriteriaBuilderDemo {
	private static EntityManagerFactory EMF=null;
	private static EntityManager em=null;

	public static void main(String[] args) {
		try {
			EMF=Persistence.createEntityManagerFactory("training");
			em=EMF.createEntityManager();
			em.getTransaction().begin();
			CriteriaBuilder criteriaBuilder = 
										em.getCriteriaBuilder();			
			CriteriaQuery<Object> criteriaQuery = 
								criteriaBuilder.createQuery();			
			Root<AirPassengerProfile> from =
							criteriaQuery.from(AirPassengerProfile.class);
			//select all records
			System.out.println("Select all records");
			CriteriaQuery<Object> select = criteriaQuery.select(from);
			select.orderBy(criteriaBuilder.desc(from.get("firstName")));
			TypedQuery<Object> typedQuery = em.createQuery(select);
			
			List<Object> resultlist = typedQuery.getResultList();
			for(Object o:resultlist) {
				System.out.println((AirPassengerProfile)o);
			}

	
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
