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
		try {
			factory =
					Persistence.createEntityManagerFactory("training");
			em = factory.createEntityManager();

			em.getTransaction().begin();
			Student student = new Student();
			student.setName("Mittal");
			Address homeAddress = new Address();
			homeAddress.setStreet("Triplicane");
			homeAddress.setCity("Chennai");
			homeAddress.setState("TamilNadu");
			homeAddress.setZipCode("400003");

			//inject address into student
			student.setAddress(homeAddress);

			//persist only student, no need to persist Address explicitly
			em.persist(student);
			em.getTransaction().commit();
			String message =deleteStudent(student);
			System.out.println(message);
			System.out.println("Added one student with address to database.");
		}catch(PersistenceException e) {
			e.printStackTrace();
		}finally {
			em.close();
			factory.close();
		}
		
		/**
		try {
			factory = 
					Persistence.createEntityManagerFactory("training");
			em = factory.createEntityManager();
			Address address = new Address();
			address.setCity("Chennai");
			address.setState("TamilNadu");
			address.setStreet("Velachery");
			address.setZipCode("124563");

			Student student = new Student();
			student.setAddress(address);
			student.setName("Marina Beach");
			em.persist(address);
			em.persist(student);
			/**
			student= em.find(Student.class, 1);
			System.out.println(student.getStudentId()+","+student.getName());
			address = student.getAddress();
			System.out.println(address.getCity());

		}catch(PersistenceException e) {
			e.printStackTrace();
		}finally {
			em.close();
			factory.close();
		}**/
	}

	public static String deleteStudent(Student student){

		EntityManagerFactory factory =null;
		EntityManager em=null;
		try {
			factory =
					Persistence.createEntityManagerFactory("training");
			em = factory.createEntityManager();

			em.getTransaction().begin();
			Student student1;
			student1 = em.find(Student.class,student.getStudentId());
			em.remove(student1);
			em.getTransaction().commit();
		}catch (Exception e){
			e.printStackTrace();

		}
		return "Student deleted successfully";
	}
}
