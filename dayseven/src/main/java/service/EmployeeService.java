package service;

import entities.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();
    public Employee getEmployeeById(Integer empId);
}
