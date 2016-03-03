package com.test.WebTest.dao;

import com.test.WebTest.model.Employee;

import java.util.List;

/**
 * Created by zhangxibo on 16/3/3.
 */
public interface EmployeeDao {

    Employee findById(int id);

    void saveEmployee(Employee employee);

    void deleteEmployeeBySsn(String ssn);

    List<Employee> findAllEmployees();

    Employee findEmployeeBySsn(String ssn);

}