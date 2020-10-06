package bo.customer;

import model.customer.Customer;
import model.customer.TypeCustomer;

import java.util.List;

public interface ITypeCustomerBO {

    List<TypeCustomer> findAllTypeCustomer();

}
