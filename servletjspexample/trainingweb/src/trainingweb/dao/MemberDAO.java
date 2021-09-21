/**
 * 
 */
package trainingweb.dao;

import java.util.List;

import trainingweb.entities.Member;

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
