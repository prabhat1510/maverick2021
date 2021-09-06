package main.java.jpatraining.jpa.ui;

import main.java.jpatraining.onetoonebi.AddressBi;
import main.java.jpatraining.onetoonebi.StudentBi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;





public class ClientBiQuery {

	public static void main(String[] args) {
		EntityManagerFactory factory =null;
		EntityManager em=null;
		try {		

			factory = 
					Persistence.createEntityManagerFactory("training");
			em = factory.createEntityManager();
			em.getTransaction().begin();

			StudentBi studentBi1=
					em.find(StudentBi.class, 1);
			AddressBi addressBi1= studentBi1.getAddress();
			System.out.println(addressBi1.getAddressId());
			System.out.println("------------------------");

			AddressBi addressBi2=
					em.find(AddressBi.class, 1);
			StudentBi studentBi2 = addressBi2.getStudentBi();
			System.out.println(studentBi2.getStudentId());

			em.getTransaction().commit();	
		}catch(PersistenceException e) {
			e.printStackTrace();
		}finally {
			em.close();
			factory.close();
		}
		
//		try {		
//
//			factory = 
//					Persistence.createEntityManagerFactory("jpa-mapping-app");
//			em = factory.createEntityManager();
//			em.getTransaction().begin();
//
//			StudentBi studentBi1= 
//					em.find(StudentBi.class, 1);
//			em.remove(studentBi1);
//
//			em.getTransaction().commit();	
//		}catch(PersistenceException e) {
//			e.printStackTrace();
//		}finally {
//			em.close();
//			factory.close();
//		}
//
	}

}
