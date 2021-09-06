/**
 * 
 */
package jpatraining.app;

import java.util.List;

import jpatraining.dao.MemberDAOImpl;
import jpatraining.entities.Member;

/**
 * @author admi
 *
 */
public class MemberApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MemberDAOImpl memberDao =  new MemberDAOImpl();
		boolean isMemberAvailable;
		isMemberAvailable=memberDao.isMemberAvailable(11111);
		System.out.println(isMemberAvailable);
		System.out.println("*************************************");
		//Add member
		Member member = new Member();
		member.setId(7);
		member.setName("Cisco");
		String memberAdded = memberDao.addMember(member);
		System.out.println(memberAdded);
		System.out.println("*************************************");
		//Get all members
		List<Member> membersList =memberDao.findAllMembers();
		System.out.println(membersList);

		//Update member
		Member updatedMember = new Member();
		updatedMember.setId(2);
		updatedMember.setName("Oracle");
		memberDao.updateMember(updatedMember);
		System.out.println("*************************************");
		List<Member> updatedMembersList =memberDao.findAllMembers();
		System.out.println(updatedMembersList);
	}

}
