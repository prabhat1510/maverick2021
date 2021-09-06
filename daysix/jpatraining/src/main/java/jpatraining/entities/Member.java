/**
 * 
 */
package jpatraining.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author admi
 *
 */
@Entity
public class Member {

	@Id
	@Column(name="id")
	private int id;
	@Column(name="membername")
	private String memberName;
	
	
	
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return memberName;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String memberName) {
		this.memberName = memberName;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", memberName=" + memberName + "]";
	}
}
