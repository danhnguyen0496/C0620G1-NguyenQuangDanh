package dao.contract;

import dao.BaseDAO;
import model.contract.AttachService;
import model.contract.ContractDetail;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AttachServiceDAO implements IAttachServiceDAO {
    BaseDAO baseDAO = new BaseDAO();

    @Override
    public List<AttachService> findAllAttachService() {

        List<AttachService> attachServiceList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseDAO.getConnection().
                    prepareStatement("select attach_service_id, attach_service_name, attach_service_cost," +
                            "attach_service_unit, attach_service_status from attach_service;");

            ResultSet rs = preparedStatement.executeQuery();
            AttachService attachService;
            while (rs.next()) {
                String attachServiceId = rs.getString("attach_service_id");
                String attachServiceName = rs.getString("attach_service_name");
                String attachServiceCost = rs.getString("attach_service_cost");
                String attachServiceUnit = rs.getString("attach_service_unit");
                String attachServiceStatus = rs.getString("attach_service_status");
                attachService = new AttachService(attachServiceId, attachServiceName, attachServiceCost,
                        attachServiceUnit, attachServiceStatus);
                attachServiceList.add(attachService);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return attachServiceList;
    }
}
