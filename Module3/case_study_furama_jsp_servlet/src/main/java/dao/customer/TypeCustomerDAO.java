package dao.customer;

import dao.BaseDAO;
import model.customer.TypeCustomer;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TypeCustomerDAO implements ITypeCustomerDAO {

    private BaseDAO baseDAO = new BaseDAO();

    @Override
    public List<TypeCustomer> findAllTypeCustomer() {
        List<TypeCustomer> typeCustomerList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseDAO.getConnection().
                    prepareStatement("select customer_type_id, customer_type_name from customer_type");
            ResultSet rs = preparedStatement.executeQuery();
            TypeCustomer typeCustomer;
            while (rs.next()) {
                String customerTypeId = rs.getString("customer_type_id");
                String customerTypeName = rs.getString("customer_type_name");

                typeCustomer = new TypeCustomer(customerTypeId, customerTypeName);

                typeCustomerList.add(typeCustomer);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return typeCustomerList;
    }
}
