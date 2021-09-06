package main.java.jpatraining.jpa.ui;

import main.java.jpatraining.onetooneuni.Address;
import main.java.jpatraining.onetooneuni.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;



public class UniDemo {

	public static void main(String[] args) {
		EntityManagerFactory factory =null;
		EntityManager em=null;
//		try {
//			factory = 
//					Persistence.createEntityManagerFactory("jpa-mapping-app");
//			em = factory.createEntityManager();
//		
//			em.getTransaction().begin();
//			Student student = new Student();
//			student.setName("Lakshmi");
//			Address homeAddress = new Address();
//			homeAddress.setStreet("MG Road");
//			homeAddress.setCity("Pune");
//			homeAddress.setState("Maharastra");
//			homeAddress.setZipCode("400001");
//
//			//inject address into student
//			student.setAddress(homeAddress);
//
//			//persist only student, no need to persist Address explicitly
//			em.persist(student);
//			em.getTransaction().commit();
//
//			System.out.println("Added one student with address to database.");
//		}catch(PersistenceException e) {
//			e.printStackTrace();
//		}finally {
//			em.close();
//			factory.close();
//		}
		
		
		try {
			factory = 
					Persistence.createEntityManagerFactory("training");
			em = factory.createEntityManager();
		
			Student student= em.find(Student.class, 1);
			System.out.println(student.getStudentId()+","+student.getName());
			Address address = student.getAddress();
			System.out.println(address.getCity());
		}catch(PersistenceException e) {
			e.printStackTrace();
		}finally {
			em.close();
			factory.close();
		}
	}
}
