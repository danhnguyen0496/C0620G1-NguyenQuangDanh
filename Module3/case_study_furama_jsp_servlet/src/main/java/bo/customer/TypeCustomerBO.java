package bo.customer;

import dao.customer.ITypeCustomerDAO;
import dao.customer.TypeCustomerDAO;
import model.customer.TypeCustomer;

import java.util.ArrayList;
import java.util.List;

public class TypeCustomerBO implements ITypeCustomerBO {

    ITypeCustomerDAO typeCustomerDAO = new TypeCustomerDAO();

    @Override
    public List<TypeCustomer> findAllTypeCustomer() {
        List<TypeCustomer>typeCustomerList=new ArrayList<>();
        typeCustomerList=this.typeCustomerDAO.findAllTypeCustomer();
        return typeCustomerList;
    }
}
