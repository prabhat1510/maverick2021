package main.java.jpatraining.jpa.ui;

import java.util.Date;
import java.util.Iterator;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import main.java.jpatraining.onetomany.Department;
import main.java.jpatraining.onetomany.Employee;


public class OneToMany {
	private static EntityManagerFactory EMF=
			Persistence.createEntityManagerFactory("training");
	public static void main(String[] args) {
		EntityManager em=null;		
		try {
			em = EMF.createEntityManager();
			em.getTransaction().begin();
			Department department=
					new Department(10,"ACCOUNTS","MUMBAI");
			Employee employee1= new Employee(1001,"Smith",new Date());
			Employee employee2= new Employee(1002,"Jones",new Date());
			employee1.setDepartment(department);
			employee2.setDepartment(department);
			em.persist(employee1);
			em.persist(employee2);
			em.getTransaction().commit();
		}catch(PersistenceException e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		}finally {
			em.close();
		}
		/**
		try {
			em = EMF.createEntityManager();
			em.getTransaction().begin();
			Employee e1=em.find(Employee.class, 1001);
			System.out.println(e1.getEmpno()+","+e1.getEname()+e1.getDepartment().getDeptno());
			Department d= e1.getDepartment();
			System.out.println(d.getDeptno()+","+d.getDepartmentName());
			System.out.println("---------------------");
			Department department=em.find(Department.class, 10);
			Set<Employee> employeeSet=department.getEmployees();
//			Iterator<Employee> iterator= employeeSet.iterator();
//			while(iterator.hasNext()) {
//				Employee e=iterator.next();
//				System.out.println(e.getEmpno()+","+e.getEname());
//			}
			employeeSet.stream().forEach(System.out::println);
			em.getTransaction().commit();			
			
		}catch(PersistenceException e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		}finally {
			em.close();
		}
**/
}		

}
