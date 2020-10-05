package dao.service;

import model.Customer;
import model.Service;

import java.util.List;

public interface IServiceDAO {
    // Trả về danh sách tất cả dich vu
    List<Service> findAll();

    // Thêm (lưu) một dich vu
    String addNewService(Service service);
}
