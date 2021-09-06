package main.java.jpatraining.onetomany;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="department")
public class Department implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id	
	@Column(name="deptno",length = 2)
	private Integer deptno;
	@Column(name = "dname",length = 15,nullable = false)
	private String departmentName;
	private String location;
	@OneToMany(mappedBy = "department")
	private Set<Employee> employees;
	
	public Department() {
		
	}
	
	
	public Department(Integer deptno, String departmentName, String location) {
		super();
		this.deptno = deptno;
		this.departmentName = departmentName;
		this.location = location;		
	}



	public Integer getDeptno() {
		return deptno;
	}
	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Set<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}


	@Override
	public String toString() {
		return "Department [deptno=" + deptno + ", departmentName=" + departmentName + ", location=" + location + "]";
	}
	
	
	
}
