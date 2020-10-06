package bo.customer;

import model.customer.Customer;

import java.util.List;

public interface ICustomerBO {

    // Trả về danh sách tất cả khách hàng
    List<Customer> findAll();

    // Thêm (lưu) một khách hàng
    String addNewCustomer(Customer customer);

    // Tìm kiếm khách hàng theo tên
    List<Customer> findByName(String name);

    // Xoá một khách hàng khỏi danh sách
    String deleteById(String id);

    // Cập nhật thông tin của một khách hàng
    String edit(String id, Customer customer);

}
