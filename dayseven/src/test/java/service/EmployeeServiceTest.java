package service;

import entities.Department;
import entities.Employee;
import org.junit.Test;

import java.util.Date;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class EmployeeServiceTest {

    EmployeeService employeeService = new EmployeeServiceImpl();

    @Test
    public void test_getEmployeeById(){
        int empno = 15;
        Department department = new Department();
        department.setDepartmentName("IT Services");
        Employee employee =  new Employee();
        employee.setEmpno(15);
        employee.setEname("Rakesh");
        employee.setDepartment(department);
        employee.setHiredate(new Date());

        //assertEquals(employee,employeeService.getEmployeeById(employee.getEmpno()));
    }

    @Test
    public void test_getEmployeeById_NullValues(){
        int empno = 15;
        Department department = new Department();
        department.setDepartmentName("IT Services");
        Employee employee =  new Employee();
        employee.setEmpno(15);
        employee.setEname("Rakesh");
        employee.setDepartment(department);
        employee.setHiredate(new Date());

        assertNull(employeeService.getEmployeeById(employee.getEmpno()));
    }

}
