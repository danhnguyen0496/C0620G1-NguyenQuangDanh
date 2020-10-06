package bo.customer;

import dao.customer.ITypeCustomerDAO;
import dao.customer.TypeCustomerDAO;
import model.customer.TypeCustomer;

import java.util.List;

public class TypeCustomerBO implements ITypeCustomerBO {

    ITypeCustomerDAO typeCustomerDAO = new TypeCustomerDAO();

    @Override
    public List<TypeCustomer> findAllTypeCustomer() {
        return this.typeCustomerDAO.findAllTypeCustomer();
    }
}
