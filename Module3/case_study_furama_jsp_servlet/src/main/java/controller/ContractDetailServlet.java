package controller;

import bo.contract.*;
import dao.contract.IAttachServiceDAO;
import model.contract.AttachService;
import model.contract.Contract;
import model.contract.ContractDetail;
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

@WebServlet(name = "ContractDetailServlet", urlPatterns = {"/contractDetails"})
public class ContractDetailServlet extends HttpServlet {

    IContractDetailBO contractDetailBO = new ContractDetailBO();

    IAttachServiceBO attachServiceBO = new AttachServiceBO();

    IContractBO contractBO = new ContractBO();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        switch (action) {
            case "create":
                addNewContractDetail(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        switch (action) {
            case "create":
                showCreateFormContractDetail(request, response);
                break;
        }
    }

    private void addNewContractDetail(HttpServletRequest request, HttpServletResponse response) {
        String contractDetailId = request.getParameter("contractDetailId");
        String quantity = request.getParameter("quantity");
        String contractId = request.getParameter("contractId");
        String attachServiceId = request.getParameter("attachServiceId");

        ContractDetail contractDetail = new ContractDetail(contractDetailId, quantity, contractId, attachServiceId);
        String message = this.contractDetailBO.addNewContractDetail(contractDetail);
        request.setAttribute("message", message);

        List<ContractDetail> contractDetailList = this.contractDetailBO.findAllContractDetail();
        request.setAttribute("contractDetailList", contractDetailList);

        List<AttachService> attachServiceList = this.attachServiceBO.findAllAttachService();
        request.setAttribute("attachServiceList",attachServiceList);

        List<Contract> contractList = this.contractBO.findAllContract();
        request.setAttribute("contractList",contractList);

        try {
            request.getRequestDispatcher("contract/createContractDetail.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showCreateFormContractDetail(HttpServletRequest request, HttpServletResponse response) {
        List<ContractDetail> contractDetailList = this.contractDetailBO.findAllContractDetail();
        request.setAttribute("contractDetailList", contractDetailList);

        List<AttachService> attachServiceList = this.attachServiceBO.findAllAttachService();
        request.setAttribute("attachServiceList",attachServiceList);

        List<Contract> contractList = this.contractBO.findAllContract();
        request.setAttribute("contractList",contractList);

        RequestDispatcher dispatcher = request.getRequestDispatcher("contract/createContractDetail.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
