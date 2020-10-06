package bo.employee;

import common.ValidateName;
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
        } else if (!ValidateName.isValidName(employee.getEmployeeName())) {
            message = "Please do not input digit and special characters";
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
        } else if (!ValidateName.isValidName(employee.getEmployeeName())) {
            message = "Please do not input digit and special characters";
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
