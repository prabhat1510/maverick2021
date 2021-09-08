package service;

import entities.Department;
import entities.Employee;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.jupiter.api.Disabled;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class EmployeeServiceTest {

    EmployeeService employeeService = new EmployeeServiceImpl();

    @Ignore
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


    @Test
    public void test_getAllEmployees(){
        Department department = new Department();
        department.setDepartmentName("IT Services");
        Employee employee =  new Employee();
        employee.setEmpno(15);
        employee.setEname("Rakesh");
        employee.setDepartment(department);
        employee.setHiredate(new Date());

        Employee employeeTwo =  new Employee();
        employeeTwo.setEmpno(16);
        employeeTwo.setEname("Rajesh");
        employeeTwo.setDepartment(department);
        employeeTwo.setHiredate(new Date());


        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(employee);
        employeeList.add(employeeTwo);
        assertEquals(employeeList.size(),(employeeService.getAllEmployees().size()));
    }
}
