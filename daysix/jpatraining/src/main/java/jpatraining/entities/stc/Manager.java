package main.java.jpatraining.entities.stc;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//value for manager rows in Discriminator column
@DiscriminatorValue("MGR")	
public class Manager extends Employees {
	private static final long serialVersionUID = 1L;
	
	private String departmentName;

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	

}
