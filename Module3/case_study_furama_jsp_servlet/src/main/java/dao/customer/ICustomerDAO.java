package dao.customer;

import model.Customer;

import java.util.List;

public interface ICustomerDAO {

    // Trả về danh sách tất cả khach hang
    List<Customer> findAll();

    // Thêm (lưu) một khách hàng
    String addNewCustomer(Customer customer);

    // Tìm kiếm khách hàng theo tên
    List<Customer> findByName(String name);

    // Xoá một khách hàng khỏi danh sách
    String deleteById(String id);

    // Cập nhật thông tin của một khách hàng
    String edit(String id, Customer customer);

    // Tìm một khách hàng theo Id
//    List<Customer>  findById(String id);
}
