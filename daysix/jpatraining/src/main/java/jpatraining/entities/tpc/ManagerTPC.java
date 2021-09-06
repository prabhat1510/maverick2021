package main.java.jpatraining.entities.tpc;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="manager_tpc")
public class ManagerTPC extends EmployeeTPC {

	private static final long serialVersionUID = 1L;
	
	private String departmentName;

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	

}
