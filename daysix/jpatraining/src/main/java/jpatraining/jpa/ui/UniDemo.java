package main.java.jpatraining.jpa.ui;

import main.java.jpatraining.manytomany.Order;
import main.java.jpatraining.onetooneuni.Address;
import main.java.jpatraining.onetooneuni.OrderNew;
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
			student.setName("Sharma");
			Address homeAddress = new Address();
			homeAddress.setStreet("Belapur");
			homeAddress.setCity("Mumbai");
			homeAddress.setState("Maharashtra");
			homeAddress.setZipCode("400005");

			//inject address into student
			student.setAddress(homeAddress);

			//persist only student, no need to persist Address explicitly
			em.persist(student);
			em.getTransaction().commit();
			//String message =deleteStudent(student);
			//System.out.println(message);
			//System.out.println("Added one student with address to database.");
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
/**
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
			//Parsing string to Long value
			OrderNew orderNew = em.find(OrderNew.class,Long.parseLong("15") );
			//Convert Integer to Long value //new Long() is deprecated
			OrderNew orderIntToLong = em.find(OrderNew.class,Long.valueOf(15));
			OrderNew order = em.find(OrderNew.class,15L);

			System.out.println("Order details for 15 is -----"+order);
			em.remove(student1);
			em.getTransaction().commit();
		}catch (Exception e){
			e.printStackTrace();

		}
		return "Student deleted successfully";
	}
 **/
}
