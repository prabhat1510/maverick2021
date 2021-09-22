/**
 * 
 */
package trainingweb.service;

import java.util.List;

import trainingweb.dao.MemberDAO;
import trainingweb.entities.Member;

/**
 * @author admi
 *
 */
public class MemberServiceImpl implements MemberService {

	private MemberDAO memberdao;
	@Override
	public boolean isMemberAvailable(int memberId) {
		// TODO Auto-generated method stub
		boolean isMemberAvailable;
		isMemberAvailable= memberdao.isMemberAvailable(memberId);
		return isMemberAvailable;
	}

	@Override
	public String addMember(Member member) {
		// TODO Auto-generated method stub
		return memberdao.addMember(member);
	}

	@Override
	public List<Member> findAllMembers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeMember(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateMember(Member member) {
		// TODO Auto-generated method stub

	}

}
