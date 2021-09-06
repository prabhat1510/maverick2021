package main.java.jpatraining.entities.stc;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="employee_st")
//Following annotation must be written only on parent class
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
//Following is additional column to differ parent and child
@DiscriminatorColumn(name="emp_type",
		discriminatorType=DiscriminatorType.STRING)   
//parent rows will have this value in Discriminator column
@DiscriminatorValue("EMP")		
public class Employees implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "employee_id")
	private int employeeId;
	private String name;
	private double salary;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}	
	
}
