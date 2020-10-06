package controller;

import bo.customer.CustomerBO;
import bo.customer.ICustomerBO;
import bo.customer.ITypeCustomerBO;
import bo.customer.TypeCustomerBO;
import bo.employee.DivisionBO;
import bo.employee.IDivisionBO;
import model.customer.Customer;
import model.customer.TypeCustomer;
import model.employee.Division;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = {"", "/customers"})
public class CustomerServlet extends HttpServlet {

    private ICustomerBO customerBO = new CustomerBO();

    private ITypeCustomerBO typeCustomerBO = new TypeCustomerBO();


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                addNewCustomers(request, response);
                break;
            case "delete":
                deleteCustomers(request, response);
                break;
            case "edit":
                editCustomers(request, response);
                break;
            default:
                findCustomerByName(request, response);
                break;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showCreateFormCustomers(request, response);
                break;
            case "view":
                showViewFormCustomers(request, response);
                break;
            default:
                homePage(request, response);
                break;
        }
    }

    // chỉnh sửa thông tin khách hàng
    private void editCustomers(HttpServletRequest request, HttpServletResponse response) {
        String customerName = request.getParameter("customerName");
        String customerBirthday = request.getParameter("customerBirthday");
        String customerGender = request.getParameter("customerGender");
        String customerIdCard = request.getParameter("customerIdCard");
        String customerPhone = request.getParameter("customerPhone");
        String customerEmail = request.getParameter("customerEmail");
        String customerTypeId = request.getParameter("customerTypeId");
        String customerAddress = request.getParameter("customerAddress");
        String id = request.getParameter("idEditCustomerHidden");
        Customer customer = new Customer(id, customerName, customerBirthday, customerGender, customerIdCard,
                customerPhone, customerEmail, customerTypeId, customerAddress);
        String message = this.customerBO.edit(id, customer);
        request.setAttribute("message", message);
//        showViewFormCustomers(request, response);

        // nhảy trang edit
        List<Customer> customerList = this.customerBO.findAll();
        request.setAttribute("customerList", customerList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/edit.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // xóa khách hàng theo id
    private void deleteCustomers(HttpServletRequest request, HttpServletResponse response) {
        String id = request.getParameter("idCustomerHidden");
        String message = this.customerBO.deleteById(id);
        request.setAttribute("message", message);
//        showViewFormCustomers(request, response);

        // nhảy trang delete
        List<Customer> customerList = this.customerBO.findAll();
        request.setAttribute("customerList", customerList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/delete.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // tim kiem khach hang theo ten
    private void findCustomerByName(HttpServletRequest request, HttpServletResponse response) {
        List<Customer> customerList = this.customerBO.findByName(request.getParameter("nameCustomer"));
        request.setAttribute("customerList", customerList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/view.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // hien thi view tong quan danh sach khach hang
    private void showViewFormCustomers(HttpServletRequest request, HttpServletResponse response) {
        List<Customer> customerList = this.customerBO.findAll();
        request.setAttribute("customerList", customerList);

        List<TypeCustomer> typeCustomerList = this.typeCustomerBO.findAllTypeCustomer();
        request.setAttribute("typeCustomerList", typeCustomerList);

        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/view.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // them moi mot khach hang
    private void addNewCustomers(HttpServletRequest request, HttpServletResponse response) {
        String id = request.getParameter("id");
        String customerName = request.getParameter("customerName");
        String customerBirthday = request.getParameter("customerBirthday");
        String customerGender = request.getParameter("customerGender");
        String customerIdCard = request.getParameter("customerIdCard");
        String customerPhone = request.getParameter("customerPhone");
        String customerEmail = request.getParameter("customerEmail");
        String customerTypeId = request.getParameter("typeCustomerId");
        String customerAddress = request.getParameter("customerAddress");

        Customer customer = new Customer(id, customerName, customerBirthday, customerGender,
                customerIdCard, customerPhone, customerEmail, customerTypeId, customerAddress);

        String message = this.customerBO.addNewCustomer(customer);
        request.setAttribute("message", message);
        // hiện thị sang trang view
        showViewFormCustomers(request, response);

        // hiện thị tại trang create
//        List<Customer> customerList = this.customerBO.findAll();
//        customerList.add(customer); ------
//        request.setAttribute("customerList", customerList);
//        try {
//            request.getRequestDispatcher("customer/create.jsp").forward(request, response);
//        } catch (ServletException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    // hien thi bang tao moi danh sach khach hang
    private void showCreateFormCustomers(HttpServletRequest request, HttpServletResponse response) {
        List<Customer> customerList = this.customerBO.findAll();
        request.setAttribute("customerList", customerList);

        List<TypeCustomer> typeCustomerList = this.typeCustomerBO.findAllTypeCustomer();
        request.setAttribute("typeCustomerList", typeCustomerList);



        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/create.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // hien thi trang chu furama
    private void homePage(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.sendRedirect("homepage.jsp");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
