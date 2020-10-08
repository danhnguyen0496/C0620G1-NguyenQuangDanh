package controller;

import bo.employee.*;
import model.customer.Customer;
import model.employee.Division;
import model.employee.EducationDegree;
import model.employee.Employee;
import model.employee.Position;
import model.service.Service;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "EmployeeServlet", urlPatterns = "/employees")
public class EmployeeServlet extends HttpServlet {

    private IEmployeeBO employeeBO = new EmployeeBO();

    private IPositionBO positionBO = new PositionBO();

    private IEducationDegreeBO educationDegreeBO = new EducationDegreeBO();

    private IDivisionBO divisionBO = new DivisionBO();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");
        switch (action) {
            case "create":
                addNewEmployee(request, response);
                break;
            case "edit":
                editEmployee(request, response);
                break;
            case "delete":
                deleteEmployee(request, response);
                break;
        }
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        switch (action) {
            case "create":
                showCreateFormEmployee(request, response);
                break;
            case "view":
                showViewListEmployee(request, response);
                break;
        }
    }


    private void deleteEmployee(HttpServletRequest request, HttpServletResponse response) {
        String id = request.getParameter("idDeleteEmployeeHidden");
        String message = this.employeeBO.deleteById(id);
        showViewListEmployee(request, response);
        request.setAttribute("message", message);
    }

    private void editEmployee(HttpServletRequest request, HttpServletResponse response) {
        String employeeName = request.getParameter("employeeName");
        String employeeBirthday = request.getParameter("employeeBirthday");
        String employeeIdCard = request.getParameter("employeeIdCard");
        String employeeSalary = request.getParameter("employeeSalary");
        String employeePhone = request.getParameter("employeePhone");
        String employeeEmail = request.getParameter("employeeEmail");
        String customerAddress = request.getParameter("customerAddress");
        String positionId = request.getParameter("positionId");
        String educationDegreeId = request.getParameter("educationDegreeId");
        String divisionId = request.getParameter("divisionId");
        String id = request.getParameter("idEditEmployeeHidden");
        Employee employee = new Employee(id, employeeName, employeeBirthday, employeeIdCard, employeeSalary,
                employeePhone, employeeEmail, customerAddress, positionId, educationDegreeId, divisionId);
        String message = this.employeeBO.edit(id, employee);

        request.setAttribute("message", message);

        showViewListEmployee(request, response);
    }

    private void showViewListEmployee(HttpServletRequest request, HttpServletResponse response) {

        List<Employee> employeeList = this.employeeBO.findAllEmployee();
        request.setAttribute("employeeList", employeeList);

        List<Position> positionList = this.positionBO.findAllPosition();
        request.setAttribute("positionList", positionList);

        List<EducationDegree> educationDegreeList = this.educationDegreeBO.findAllEducationDegree();
        request.setAttribute("educationDegreeList", educationDegreeList);

        List<Division> divisionList = this.divisionBO.findAllDivision();
        request.setAttribute("divisionList", divisionList);

        RequestDispatcher dispatcher = request.getRequestDispatcher("employee/view.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void addNewEmployee(HttpServletRequest request, HttpServletResponse response) {
        String employeeId = request.getParameter("employeeId");
        String employeeName = request.getParameter("employeeName");
        String employeeBirthday = request.getParameter("employeeBirthday");
        String employeeIdCard = request.getParameter("employeeIdCard");
        String employeeSalary = request.getParameter("employeeSalary");
        String employeePhone = request.getParameter("employeePhone");
        String employeeEmail = request.getParameter("employeeEmail");
        String employeeAddress = request.getParameter("employeeAddress");
        String positionId = request.getParameter("positionId");
        String educationDegreeId = request.getParameter("educationDegreeId");
        String divisionId = request.getParameter("divisionId");

        Employee employee = new Employee(employeeId, employeeName, employeeBirthday, employeeIdCard, employeeSalary,
                employeePhone, employeeEmail, employeeAddress, positionId, educationDegreeId, divisionId);

        String message = this.employeeBO.addNewEmployee(employee);

        request.setAttribute("message", message);

        List<Employee> employeeList = this.employeeBO.findAllEmployee();

        request.setAttribute("employeeList", employeeList);

//        showViewListEmployee(request, response);
        try {
            request.getRequestDispatcher("employee/create.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showCreateFormEmployee(HttpServletRequest request, HttpServletResponse response) {

        List<Employee> employeeList = this.employeeBO.findAllEmployee();
        request.setAttribute("employeeList", employeeList);

        List<Position> positionList = this.positionBO.findAllPosition();
        request.setAttribute("positionList", positionList);

        List<EducationDegree> educationDegreeList = this.educationDegreeBO.findAllEducationDegree();
        request.setAttribute("educationDegreeList", educationDegreeList);

        List<Division> divisionList = this.divisionBO.findAllDivision();
        request.setAttribute("divisionList", divisionList);

        RequestDispatcher dispatcher = request.getRequestDispatcher("employee/create.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
