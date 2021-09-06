package main.java.jpatraining.jpa.ui;

import main.java.jpatraining.manytomany.Order;
import main.java.jpatraining.manytomany.Product;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;





public class ManyToMany {
	private static EntityManagerFactory EMF=
			Persistence.createEntityManagerFactory("training");
	
	public static void main(String[] args) {
		EntityManager em=null;
		try {
			em = EMF.createEntityManager();
			em.getTransaction().begin();
			Order o1= new Order();
			o1.setOrderId(101);o1.setOrderDate(new Date());
			Order o2= new Order();
			o2.setOrderId(102);o2.setOrderDate(new Date());
			
			Product p1= new Product();
			Product p2= new Product();
			p1.setProductId(23456);p1.setProductName("Apple iPhone X");
			p1.setPrice(135600.0);
			p2.setProductId(23457);p2.setProductName("Samsung Galaxy m40");
			p2.setPrice(19900.0);
			Set<Product> productSet1= new HashSet<>();
			productSet1.add(p1); productSet1.add(p2);
			o1.setProducts(productSet1);
			
			Set<Product> productSet2= new HashSet<>();
			productSet2.add(p1);
			o2.setProducts(productSet2);
			//Order is the owning entity
			em.persist(o1);
			em.persist(o2);
			em.getTransaction().commit();		
			
		}catch(PersistenceException e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		}finally {
			em.close();
		}

	}

}
