package dao.employee;

import dao.BaseDAO;
import model.employee.Employee;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO implements IEmployeeDAO {

    private BaseDAO baseDAO = new BaseDAO();

    @Override
    public List<Employee> findAllEmployee() {
        List<Employee> employeeList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseDAO.getConnection().
                    prepareStatement("select employee_id, employee_name, employee_birthday,employee_id_card, " +
                            "employee_salary, employee_phone, employee_email, employee_address, position_id, " +
                            "education_degree_id, division_id from employee;");
            ResultSet rs = preparedStatement.executeQuery();
            Employee employee;
            while (rs.next()) {
                String employeeId = rs.getString("employee_id");
                String employeeName = rs.getString("employee_name");
                String employeeBirthday = rs.getString("employee_birthday");
                String employeeIdCard = rs.getString("employee_id_card");
                String employeeSalary = rs.getString("employee_salary");
                String employeePhone = rs.getString("employee_phone");
                String employeeEmail = rs.getString("employee_email");
                String employeeAddress = rs.getString("employee_address");
                String positionId = rs.getString("position_id");
                String educationDegreeId = rs.getString("education_degree_id");
                String divisionId = rs.getString("division_id");

                employee = new Employee(employeeId, employeeName, employeeBirthday, employeeIdCard, employeeSalary,
                        employeePhone, employeeEmail, employeeAddress, positionId, educationDegreeId, divisionId);
                employeeList.add(employee);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employeeList;
    }

    @Override
    public String addNewEmployee(Employee employee) {

        try {
            PreparedStatement preparedStatement = this.baseDAO.getConnection().
                    prepareStatement("insert into employee (employee_id, employee_name, employee_birthday," +
                            "employee_id_card, employee_salary, employee_phone, employee_email, employee_address, " +
                            "position_id,education_degree_id, division_id) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);");

            preparedStatement.setString(1, employee.getEmployeeId());
            preparedStatement.setString(2, employee.getEmployeeName());
            preparedStatement.setString(3, employee.getEmployeeBirthday());
            preparedStatement.setString(4, employee.getEmployeeIdCard());
            preparedStatement.setString(5, employee.getEmployeeSalary());
            preparedStatement.setString(6, employee.getEmployeePhone());
            preparedStatement.setString(7, employee.getEmployeeEmail());
            preparedStatement.setString(8, employee.getEmployeeAddress());
            preparedStatement.setString(9, employee.getPositionId());
            preparedStatement.setString(10, employee.getEducationDegreeId());
            preparedStatement.setString(11, employee.getDivisionId());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "Add new service successful";
    }

    @Override
    public String edit(String id, Employee employee) {
        try {
            String query = "update employee set employee_name = ?, employee_birthday = ?, employee_id_card = ?, " +
                    "employee_salary = ?, employee_phone = ?, employee_email = ?, employee_address = ?," +
                    " position_id = ?, education_degree_id = ?, division_id=? where employee_id = ?";
            PreparedStatement preparedStatement = this.baseDAO.getConnection().prepareStatement(query);
            preparedStatement.setString(1, employee.getEmployeeName());
            preparedStatement.setString(2, employee.getEmployeeBirthday());
            preparedStatement.setString(3, employee.getEmployeeIdCard());
            preparedStatement.setString(4, employee.getEmployeeSalary());
            preparedStatement.setString(5, employee.getEmployeePhone());
            preparedStatement.setString(6, employee.getEmployeeEmail());
            preparedStatement.setString(7, employee.getEmployeeAddress());
            preparedStatement.setString(8, employee.getPositionId());
            preparedStatement.setString(9, employee.getEducationDegreeId());
            preparedStatement.setString(10, employee.getDivisionId());
            preparedStatement.setString(11, id);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "Edit successfully";
    }

    @Override
    public String deleteById(String id) {
        try {
            PreparedStatement preparedStatement = this.baseDAO.getConnection().
                    prepareStatement("delete from employee where employee_id = ?");
            preparedStatement.setString(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "Deleted successfully";
    }
}
