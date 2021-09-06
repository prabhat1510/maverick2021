package main.java.jpatraining.app;

import main.java.jpatraining.entities.tpc.EmployeeTPC;
import main.java.jpatraining.entities.tpc.ManagerTPC;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;



public class TPCDemo {

	private static EntityManagerFactory EMF=null;
	private static EntityManager em=null;
	
	public static void main(String[] args) {
		try {
			EMF=Persistence.createEntityManagerFactory("training");
			em=EMF.createEntityManager();
			em.getTransaction().begin();
			EmployeeTPC e1= new EmployeeTPC();
			e1.setName("Smith");
			e1.setSalary(67865.50);
			em.persist(e1);
			ManagerTPC m1=new ManagerTPC();
			m1.setName("Ravi Kumar");
			m1.setSalary(123456.0);
			m1.setDepartmentName("Accounts");
			em.persist(m1);
			em.getTransaction().commit();
			System.out.println("Transactions completed");
		}catch(PersistenceException e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		}finally {
			em.close();
			EMF.close();
		}
		

	}

}
