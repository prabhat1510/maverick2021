/**
 * 
 */
package trainingweb.service;

import java.util.List;

import trainingweb.entities.Member;

/**
 * @author admi
 *
 */
public interface MemberService {
	public boolean isMemberAvailable(int memberId);
	public String addMember(Member member);
	public List<Member> findAllMembers();
	public void removeMember(int id);
	public void updateMember(Member member);
}
