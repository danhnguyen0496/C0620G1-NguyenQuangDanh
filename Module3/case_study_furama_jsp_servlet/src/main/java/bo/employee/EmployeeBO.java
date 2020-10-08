package bo.employee;

import common.Validate;
import dao.employee.EmployeeDAO;
import dao.employee.IEmployeeDAO;
import model.employee.Employee;

import java.util.List;

public class EmployeeBO implements IEmployeeBO {

    IEmployeeDAO employeeDAO = new EmployeeDAO();

    @Override
    public List<Employee> findAllEmployee() {
        return this.employeeDAO.findAllEmployee();
    }

    @Override
    public String addNewEmployee(Employee employee) {
        String message = "";
        if (employee.getEmployeeName() == null || employee.getEmployeeName().equals("")) {
            message = "Please input name";
        } else {
            message = employeeDAO.addNewEmployee(employee);
        }
        return message;
    }

    @Override
    public String edit(String id, Employee employee) {
        String message = "";
        if (employee.getEmployeeName() == null || employee.getEmployeeName().equals("")) {
            message = "Please input name";
        } else {
            message = employeeDAO.edit(id, employee);
        }
        return message;
    }

    @Override
    public String deleteById(String id) {
        return this.employeeDAO.deleteById(id);
    }
}
