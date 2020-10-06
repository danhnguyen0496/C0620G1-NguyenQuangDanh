package dao.service;

import dao.BaseDAO;
import model.service.Service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ServiceDAO implements IServiceDAO {

    private BaseDAO baseDAO = new BaseDAO();

    @Override
    public List<Service> findAll() {
        List<Service> serviceList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseDAO.getConnection().prepareStatement("select service_id,service_name," +
                    "service_area,service_cost,service_max_people,standard_room,description_other_convenience,pool_area,number_of_floors" +
                    ",rent_type_id,service_type_id from service");

            ResultSet rs = preparedStatement.executeQuery();
            Service service;
            while (rs.next()) {
                String id = rs.getString("service_id");
                String serviceName = rs.getString("service_name");
                String serviceArea = rs.getString("service_area");
                String servicCost = rs.getString("service_cost");
                String serviceMaxPeople = rs.getString("service_max_people");
                String standardRoom = rs.getString("standard_room");
                String descriptionOtherConvenience = rs.getString("description_other_convenience");
                String poolArea = rs.getString("pool_area");
                String numberOfFloors = rs.getString("number_of_floors");
                String rentTypeId = rs.getString("rent_type_id");
                String serviceTypeId = rs.getString("service_type_id");

                service = new Service(id, serviceName, serviceArea, servicCost, serviceMaxPeople, standardRoom,
                        descriptionOtherConvenience, poolArea, numberOfFloors, rentTypeId, serviceTypeId);
                serviceList.add(service);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return serviceList;
    }

    @Override
    public String addNewService(Service service) {
        try {
            PreparedStatement preparedStatement = this.baseDAO.getConnection().
                    prepareStatement("insert into service (service_id, service_name, service_area, service_cost," +
                            "service_max_people, standard_room, description_other_convenience, pool_area,number_of_floors," +
                            " rent_type_id,service_type_id) values (?, ?, ?, ?, ?, ?, ?, ?, ?,?,?);");
            preparedStatement.setString(1, service.getId());
            preparedStatement.setString(2, service.getServiceName());
            preparedStatement.setString(3, service.getServiceArea());
            preparedStatement.setString(4, service.getServiceCost());
            preparedStatement.setString(5, service.getServiceMaxPeople());
            preparedStatement.setString(6, service.getStandardRoom());
            preparedStatement.setString(7, service.getDescriptionOtherConvenience());
            preparedStatement.setString(8, service.getPoolArea());
            preparedStatement.setString(9, service.getNumberOfFloors());
            preparedStatement.setString(10, service.getRentTypeId());
            preparedStatement.setString(11, service.getServiceTypeId());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "Add new service successful";
    }


}
