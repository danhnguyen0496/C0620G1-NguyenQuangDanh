package dao.customer;

import model.customer.TypeCustomer;

import java.util.List;

public interface ITypeCustomerDAO {
    List<TypeCustomer> findAllTypeCustomer();
}
