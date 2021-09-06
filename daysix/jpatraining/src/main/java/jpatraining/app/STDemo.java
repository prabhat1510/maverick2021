package main.java.jpatraining.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.audintel.jpa.stc.Employee;
import com.audintel.jpa.stc.Manager;

public class STDemo {
	private static EntityManagerFactory EMF=null;
	private static EntityManager em=null;
	
	public static void main(String[] args) {
		try {
			EMF=Persistence.createEntityManagerFactory("jpa-inheritance-app");
			em=EMF.createEntityManager();
			em.getTransaction().begin();
			Employee e1= new Employee();
			e1.setName("Smith");
			e1.setSalary(67865.50);
			em.persist(e1);
			Manager m1=new Manager();
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
