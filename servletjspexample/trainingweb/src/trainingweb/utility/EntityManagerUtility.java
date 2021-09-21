/**
 * 
 */
package trainingweb.utility;

/**
 * @author admi
 *
 */
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerUtility {

	private EntityManagerUtility() {
		throw new AssertionError();
		// Enforce noninstantiability with a private constructor
		// Joshua Bloch , Effective Java Item 04
	}

	private static EntityManagerFactory entityManagerFactory = Persistence
			.createEntityManagerFactory("training");
	
	public static EntityManager getEntityManager() {
		return entityManagerFactory.createEntityManager();
	}

}