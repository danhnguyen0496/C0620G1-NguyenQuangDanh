package controller;

import bo.service.IServiceBO;
import bo.service.ServiceBO;
import dao.service.IServiceDAO;
import dao.service.ServiceDAO;
import model.service.Service;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ServiceServlet", urlPatterns = {"/services"})
public class ServiceServlet extends HttpServlet {

    private IServiceBO serviceBO = new ServiceBO();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        switch (action) {
            case "create":
                addNewService(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        switch (action) {
            case "create":
                showCreateFormService(request, response);
                break;
        }
    }

    private void addNewService(HttpServletRequest request, HttpServletResponse response) {
        String id = request.getParameter("id");
        String serviceName = request.getParameter("serviceName");
        String serviceArea = request.getParameter("serviceArea");
        String serviceCost = request.getParameter("serviceCost");
        String serviceMaxPeople = request.getParameter("serviceMaxPeople");
        String standardRoom = request.getParameter("standardRoom");
        String descriptionOtherConvenience = request.getParameter("descriptionOtherConvenience");
        String poolArea = request.getParameter("poolArea");
        String numberOfFloors = request.getParameter("numberOfFloors");
        String rentTypeId = request.getParameter("rentTypeId");
        String serviceTypeId = request.getParameter("serviceTypeId");

        Service service = new Service(id, serviceName, serviceArea, serviceCost, serviceMaxPeople, standardRoom,
                descriptionOtherConvenience, poolArea, numberOfFloors, rentTypeId, serviceTypeId);

        String message = this.serviceBO.addNewService(service);

        request.setAttribute("message", message);

        List<Service> serviceList = this.serviceBO.findAll();

        request.setAttribute("serviceList", serviceList);
        try {
            request.getRequestDispatcher("service/create.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showCreateFormService(HttpServletRequest request, HttpServletResponse response) {
        List<Service> serviceList = this.serviceBO.findAll();
        request.setAttribute("serviceList", serviceList);
//        request.getParameter("action");
        RequestDispatcher dispatcher = request.getRequestDispatcher("service/create.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
