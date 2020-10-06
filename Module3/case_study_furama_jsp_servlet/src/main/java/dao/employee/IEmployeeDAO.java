package dao.employee;

import model.employee.Employee;

import java.util.List;

public interface IEmployeeDAO {
    List<Employee> findAllEmployee();

    String addNewEmployee(Employee employee);

    String edit(String id, Employee employee);

    String deleteById(String id);
}
