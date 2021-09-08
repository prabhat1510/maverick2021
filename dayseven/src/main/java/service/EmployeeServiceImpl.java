package service;

import entities.Department;
import entities.Employee;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public List<Employee> getAllEmployees() {
        //List<Employee> employeeList = null;
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
        return employeeList;
    }

    @Override
    public Employee getEmployeeById(Integer empId) {
        Employee employee = null;
        return employee;
    }
}
