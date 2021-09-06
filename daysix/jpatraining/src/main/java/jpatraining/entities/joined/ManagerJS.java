package main.java.jpatraining.entities.joined;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="manager_js")
//public class ManagerJS extends EmployeeJS {
public class ManagerJS{
	private EmployeeJS ejs;
	private static final long serialVersionUID = 1L;
	
	private String departmentName;

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	

}
