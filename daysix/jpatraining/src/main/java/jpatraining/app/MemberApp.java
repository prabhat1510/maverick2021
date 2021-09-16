/**
 * 
 */
package main.java.jpatraining.app;

import java.io.BufferedInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.text.NumberFormat;
import java.util.List;

import main.java.jpatraining.dao.MemberDAOImpl;
import main.java.jpatraining.entities.Member;

import javax.xml.parsers.DocumentBuilderFactory;

/**
 * @author admi
 *
 */
public class MemberApp {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		NumberFormat nf;
		Charset cs;
		DocumentBuilderFactory dbf;
		Integer index;
		Boolean bool;
		InputStreamReader isr;
		BufferedInputStream bis;
		
		MemberDAOImpl memberDao =  new MemberDAOImpl();
		boolean isMemberAvailable;
		isMemberAvailable=memberDao.isMemberAvailable(7);
		System.out.println(isMemberAvailable);
		System.out.println("*************************************");
		//Add member
		Member member = new Member();
		member.setId(18);
		member.setName("Schneider Electric");
		System.out.println("*************************************");
		//Get all members
		List<Member> membersList =memberDao.findAllMembers();
		System.out.println(membersList);
/**
		//Update member
		Member updatedMember = new Member();
		updatedMember.setId(15);
		updatedMember.setName("Maveric Systems");
		memberDao.updateMember(updatedMember);
		System.out.println("************************************");
		List<Member> updatedMembersList =memberDao.findAllMembers();
		System.out.println(updatedMembersList);**/

 }

}
