package bo;

import dao.CustomerDAO;
import dao.ICustomerDAO;
import model.Customer;

import java.util.List;

public class CustomerBO implements ICustomerBO {

    ICustomerDAO customerDAO = new CustomerDAO();

    @Override
    public List<Customer> findAll() {
        return this.customerDAO.findAll();
    }

    @Override
    public void addNewCustomer(Customer customer) {

    }

    @Override
    public List<Customer> findByName(String name) {
        return this.customerDAO.findByName(name);
    }

    @Override
    public void deleteById(String id) {

    }

    @Override
    public void edit(String id, Customer customer) {

    }

}
