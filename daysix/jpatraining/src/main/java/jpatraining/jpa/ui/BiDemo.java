package main.java.jpatraining.jpa.ui;

import main.java.jpatraining.onetoonebi.AddressBi;
import main.java.jpatraining.onetoonebi.StudentBi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;




public class BiDemo {

	public static void main(String[] args) {
		EntityManagerFactory factory =null;
		EntityManager em=null;
		try {		

			factory = 
					Persistence.createEntityManagerFactory("training");
			em = factory.createEntityManager();
			em.getTransaction().begin();
			StudentBi student = new StudentBi();
			student.setName("Lakshmi");
			AddressBi homeAddress = new AddressBi();
			homeAddress.setStreet("MG Road");
			homeAddress.setCity("Pune");
			homeAddress.setState("Maharastra");
			homeAddress.setZipCode("400001");

			//inject address into student
			student.setAddress(homeAddress);

			//persist only student, no need to persist Address explicitly
			em.persist(student);
			em.getTransaction().commit();

			System.out.println("Added one student with address to database.");
		}catch(PersistenceException e) {
			e.printStackTrace();
		}finally{
			em.close();
			factory.close();
		}

	}

}
