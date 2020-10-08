package bo.customer;

import common.Validate;
import dao.customer.CustomerDAO;
import dao.customer.ICustomerDAO;
import model.customer.Customer;

import java.util.List;

public class CustomerBO implements ICustomerBO {

    ICustomerDAO customerDAO = new CustomerDAO();

    @Override
    public List<Customer> findAll() {
        return this.customerDAO.findAll();
    }

    @Override
    public String addNewCustomer(Customer customer) {
        String message = "";
        if (!Validate.isValidCustomerID(customer.getId())) {
            message = "Mã Khách hàng có định dạng là KH-XXXX (X là số từ 0-9)";
        } else if (!Validate.isValidPhone(customer.getCustomerPhone())) {
            message = "Số điện thoại phải đúng định dạng 090xxxxxxx hoặc 091xxxxxxx hoặc (84)+90xxxxxxx hoặc (84)+91xxxxxxx";}
        else if (!Validate.isValidEmail(customer.getCustomerEmail())) {
            message = "Email phải đúng định dạng ^[\\w.]+@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+){1,2}$";
        } else {
            message = customerDAO.addNewCustomer(customer);
        }
        return message;
    }

    @Override
    public List<Customer> findByName(String name) {
        return this.customerDAO.findByName(name);
    }

    @Override
    public String deleteById(String id) {
        return this.customerDAO.deleteById(id);
    }

    @Override
    public String edit(String id, Customer customer) {
        String message = "";
        if (customer.getCustomerName() == null || customer.getCustomerName().equals("")) {
            message = "Please input name";
        } else {
            message = customerDAO.edit(id, customer);
        }
        return message;
    }


}
