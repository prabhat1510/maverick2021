/**
 * 
 */
package main.java.jpatraining.dao;

import main.java.jpatraining.entities.Member;

import java.util.List;

/**
 * @author admi
 *
 */
public interface MemberDAO {
	public boolean isMemberAvailable(int memberId);
	public String addMember(Member member);
	public List<Member> findAllMembers();
	public void removeMember(int id);
	public void updateMember(Member member);
}
