package jpatraining.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import jpatraining.entities.Member;
import jpatraining.utility.EntityManagerUtility;

public class MemberDAOImpl implements MemberDAO {

	/**
	 * private static EntityManagerFactory emf; private static EntityManager
	 * entityManager;
	 * 
	 * static { emf = Persistence.createEntityManagerFactory("training");
	 * entityManager = emf.createEntityManager(); }
	 **/
	public boolean isMemberAvailable(int memberId) {
		// TODO Auto-generated method stub
		EntityManager entityManager = EntityManagerUtility.getEntityManager();
		Member member = entityManager.find(Member.class, memberId);

		if (member == null) {
			return false;
		}
		return true;
	}

	@Override
	public String addMember(Member member) {
		// TODO Auto-generated method stub
		EntityManager entityManager = EntityManagerUtility.getEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(member);
		entityManager.getTransaction().commit();
		entityManager.close();
		return "member added successfully";
	}

	@Override
	public List<Member> findAllMembers() {
		EntityManager entityManager = EntityManagerUtility.getEntityManager();
		entityManager.getTransaction().begin();
		TypedQuery<Member> query = entityManager.createQuery("Select e from Member e", Member.class);
		List<Member> members = query.getResultList();
		entityManager.close();
		return members;

	}

	@Override
	public void removeMember(int id) {

		EntityManager entityManager = EntityManagerUtility.getEntityManager();
		Member member = entityManager.find(Member.class, id);
		if (member != null) {
			entityManager.getTransaction().begin();
			entityManager.remove(member);
			entityManager.getTransaction().commit();
			entityManager.close();
		}
	}

	@Override
	public void updateMember(Member member) {
		// TODO Auto-generated method stub
		EntityManager entityManager = EntityManagerUtility.getEntityManager();
		entityManager.getTransaction().begin();
		int result = entityManager.createQuery("Update Member SET membername=:membername  where id=:id")
				.setParameter("membername", member.getName())
				.setParameter("id",member.getId()).executeUpdate();
		System.out.println(result);
		entityManager.getTransaction().commit();
		entityManager.close();
		
		
	}

}
