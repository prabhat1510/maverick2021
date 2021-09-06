package main.java.jpatraining.onetoonebi;



import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="student_bi")
public class StudentBi implements Serializable {	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "student_id")
	private int studentId;	
	@Column(name = "student_name")
	private String name;	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="address_id")
	private AddressBi addressBi;
	
	public AddressBi getAddress() {
		return addressBi;
	}
	public void setAddress(AddressBi address) {
		this.addressBi = address;
	}	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
