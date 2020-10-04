package dao;

import model.Customer;

import java.util.List;

public interface ICustomerDAO {

    // Trả về danh sách tất cả khach hang
    List<Customer> findAll();

    // Thêm (lưu) một khách hàng
    void addNewCustomer(Customer customer);

    // Tìm kiếm khách hàng theo tên
    List<Customer> findByName(String name);

    // Xoá một khách hàng khỏi danh sách
    void deleteById(String id);

    // Cập nhật thông tin của một khách hàng
    void edit(String id, Customer customer);

    // Tìm một khách hàng theo Id
//    List<Customer>  findById(String id);
}
