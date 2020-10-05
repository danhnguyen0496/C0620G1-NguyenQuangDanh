package dao.customer;

import dao.BaseDAO;
import model.Customer;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAO implements ICustomerDAO {

    private BaseDAO baseDAO = new BaseDAO();

    @Override
    public List<Customer> findAll() {
        List<Customer> customerList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseDAO.getConnection().
                    prepareStatement("select customer_id, customer_name, customer_birthday, " +
                            "customer_gender, customer_id_card, customer_phone, customer_email, " +
                            "customer_type_id, customer_address from customer");

            ResultSet rs = preparedStatement.executeQuery();
            Customer customer;
            while (rs.next()) {
                String id = rs.getString("customer_id");
                String customerName = rs.getString("customer_name");
                String customerBirthday = rs.getString("customer_birthday");
                String customerGender = rs.getString("customer_gender");
                String customerIdCard = rs.getString("customer_id_card");
                String customerPhone = rs.getString("customer_phone");
                String customerEmail = rs.getString("customer_email");
                String customerTypeId = rs.getString("customer_type_id");
                String customerAddress = rs.getString("customer_address");

                customer = new Customer(id, customerName, customerBirthday, customerGender, customerIdCard,
                        customerPhone, customerEmail, customerTypeId, customerAddress);
                customerList.add(customer);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerList;
    }

    @Override
    public String addNewCustomer(Customer customer) {
        try {
            PreparedStatement preparedStatement = this.baseDAO.getConnection().
                    prepareStatement("insert into customer (customer_id, customer_name, customer_birthday, " +
                            "customer_gender, customer_id_card, customer_phone, customer_email," +
                            "customer_type_id, customer_address) values (?, ?, ?, ?, ?, ?, ?, ?, ?)");
            preparedStatement.setString(1, customer.getId());
            preparedStatement.setString(2, customer.getCustomerName());
            preparedStatement.setString(3, customer.getCustomerBirthday());
            preparedStatement.setString(4, customer.getCustomerGender());
            preparedStatement.setString(5, customer.getCustomerIdCard());
            preparedStatement.setString(6, customer.getCustomerPhone());
            preparedStatement.setString(7, customer.getCustomerEmail());
            preparedStatement.setString(8, customer.getCustomerTypeId());
            preparedStatement.setString(9, customer.getCustomerAddress());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "Add new customer successful";
    }

    @Override
    public List<Customer> findByName(String name) {
        List<Customer> customerList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseDAO.getConnection().
                    prepareStatement("select customer_id, customer_name, customer_birthday, " +
                            "customer_gender, customer_id_card, customer_phone, customer_email, " +
                            "customer_type_id, customer_address from customer where customer_name like ?");
            preparedStatement.setString(1, '%' + name + '%');
            ResultSet rs = preparedStatement.executeQuery();
            System.out.println(rs);
            Customer customer;
            while (rs.next()) {
                String id = rs.getString("customer_id");
                String customerName = rs.getString("customer_name");
                String customerBirthday = rs.getString("customer_birthday");
                String customerGender = rs.getString("customer_gender");
                String customerIdCard = rs.getString("customer_id_card");
                String customerPhone = rs.getString("customer_phone");
                String customerEmail = rs.getString("customer_email");
                String customerTypeId = rs.getString("customer_type_id");
                String customerAddress = rs.getString("customer_address");
                customer = new Customer(id, customerName, customerBirthday, customerGender, customerIdCard,
                        customerPhone, customerEmail, customerTypeId, customerAddress);
                customerList.add(customer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerList;
    }

    @Override
    public String deleteById(String id) {
        try {
            PreparedStatement preparedStatement = this.baseDAO.getConnection().
                    prepareStatement("delete from customer where customer_id = ?");
            preparedStatement.setString(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "Deleted successfully";
    }

    @Override
    public String edit(String id, Customer customer) {
        try {
            String query = "update customer set customer_name = ?, customer_birthday = ?, customer_gender = ?, " +
                    "customer_id_card = ?, customer_phone = ?, customer_email = ?, customer_type_id = ?," +
                    " customer_address = ? where customer_id = ?";
            PreparedStatement preparedStatement = this.baseDAO.getConnection().prepareStatement(query);
            preparedStatement.setString(1, customer.getCustomerName());
            preparedStatement.setString(2, customer.getCustomerBirthday());
            preparedStatement.setString(3, customer.getCustomerGender());
            preparedStatement.setString(4, customer.getCustomerIdCard());
            preparedStatement.setString(5, customer.getCustomerPhone());
            preparedStatement.setString(6, customer.getCustomerEmail());
            preparedStatement.setString(7, customer.getCustomerTypeId());
            preparedStatement.setString(8, customer.getCustomerAddress());
            preparedStatement.setString(9, id);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "Edit successfully";
    }
}
