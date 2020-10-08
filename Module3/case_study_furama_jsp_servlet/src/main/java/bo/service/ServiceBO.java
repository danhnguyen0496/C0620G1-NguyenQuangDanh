package bo.service;

import common.Validate;
import dao.service.IServiceDAO;
import dao.service.ServiceDAO;
import model.service.Service;

import java.util.List;

public class ServiceBO implements IServiceBO {

    IServiceDAO serviceDAO = new ServiceDAO();

    @Override
    public List<Service> findAll() {
        return this.serviceDAO.findAll();
    }

    @Override
    public String addNewService(Service service) {
        String message = "";
        if (service.getServiceName() == null || service.getServiceName().equals("")) {
            message = "Please input name";
        } else {
            message = serviceDAO.addNewService(service);
        }
        return message;
    }
}
