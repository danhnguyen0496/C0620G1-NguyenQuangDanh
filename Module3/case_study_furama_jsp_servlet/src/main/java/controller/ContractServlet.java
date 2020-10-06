package controller;

import bo.contract.ContractBO;
import bo.contract.IContractBO;
import bo.customer.CustomerBO;
import bo.customer.ICustomerBO;
import bo.employee.EmployeeBO;
import bo.employee.IEmployeeBO;
import bo.service.IServiceBO;
import bo.service.ServiceBO;
import model.contract.Contract;
import model.customer.Customer;
import model.employee.Employee;
import model.service.Service;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ContractServlet", urlPatterns = {"/contracts"})
public class ContractServlet extends HttpServlet {

    private IContractBO contractBO = new ContractBO();

    private IEmployeeBO employeeBO = new EmployeeBO();

    private IServiceBO serviceBO = new ServiceBO();

    private ICustomerBO customerBO = new CustomerBO();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        switch (action) {
            case "create":
                addNewContract(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        switch (action) {
            case "create":
                showCreateFormContract(request, response);
                break;
        }
    }

    private void addNewContract(HttpServletRequest request, HttpServletResponse response) {
        String id = request.getParameter("contractId");
        String contractStartDate = request.getParameter("contractStartDate");
        String contractEndDate = request.getParameter("contractEndDate");
        String contractDeposit = request.getParameter("contractDeposit");
        String contractTotalMoney = request.getParameter("contractTotalMoney");
        String employeeId = request.getParameter("employeeId");
        String customerId = request.getParameter("customerId");
        String serviceId = request.getParameter("serviceId");

        Contract contract = new Contract(id, contractStartDate, contractEndDate, contractDeposit,contractTotalMoney,
                employeeId, customerId, serviceId);

        String message = this.contractBO.addNewContract(contract);

        request.setAttribute("message", message);

        List<Contract> contractList  = this.contractBO.findAllContract();

        request.setAttribute("contractList", contractList);
        try {
            request.getRequestDispatcher("contract/create.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showCreateFormContract(HttpServletRequest request, HttpServletResponse response) {
        List<Contract> contractList  = this.contractBO.findAllContract();
        request.setAttribute("contractList", contractList);

        List<Employee> employeeList = this.employeeBO.findAllEmployee();
        request.setAttribute("employeeList",employeeList);

        List<Service> serviceList = this.serviceBO.findAll();
        request.setAttribute("serviceList",serviceList);

        List<Customer> customerList = this.customerBO.findAll();
        request.setAttribute("customerList",customerList);

        RequestDispatcher dispatcher = request.getRequestDispatcher("contract/create.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
