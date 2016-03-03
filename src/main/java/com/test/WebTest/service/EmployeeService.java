package com.test.WebTest.service;

import com.test.WebTest.model.Employee;

import java.util.List;

/**
 * Created by zhangxibo on 16/3/3.
 */
public interface EmployeeService {
    Employee findById(int id);

    void saveEmployee(Employee employee);

    void updateEmployee(Employee employee);

    void deleteEmployeeBySsn(String ssn);

    List<Employee> findAllEmployees();

    Employee findEmployeeBySsn(String ssn);

    boolean isEmployeeSsnUnique(Integer id, String ssn);
}
