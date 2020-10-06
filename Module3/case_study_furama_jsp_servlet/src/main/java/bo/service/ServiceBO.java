package bo.service;

import common.ValidateName;
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
        } else if (!ValidateName.isValidName(service.getServiceName())) {
            message = "Please do not input digit and special characters";
        } else {
            message = serviceDAO.addNewService(service);
        }
        return message;
    }
}
