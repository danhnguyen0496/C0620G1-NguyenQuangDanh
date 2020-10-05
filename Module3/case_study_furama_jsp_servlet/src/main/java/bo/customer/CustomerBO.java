package bo.customer;

import common.ValidateName;
import dao.customer.CustomerDAO;
import dao.customer.ICustomerDAO;
import model.Customer;

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
        if (customer.getCustomerName() == null || customer.getCustomerName().equals("")) {
            message = "Please input name";
        } else if (!ValidateName.isValidName(customer.getCustomerName())) {
            message = "Please do not input digit and special characters";
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
        } else if (!ValidateName.isValidName(customer.getCustomerName())) {
            message = "Please do not input digit and special characters";
        } else {
            message = customerDAO.edit(id, customer);
        }
        return message;
    }

}
