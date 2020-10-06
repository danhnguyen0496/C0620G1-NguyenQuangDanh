package bo.employee;

import model.customer.Customer;
import model.employee.Employee;

import java.util.List;

public interface IEmployeeBO {

    List<Employee> findAllEmployee();

    String addNewEmployee(Employee employee);

    String edit(String id, Employee employee);

    String deleteById(String id);
}
