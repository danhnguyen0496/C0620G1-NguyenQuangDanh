package dao.contract;

import dao.BaseDAO;
import model.contract.Contract;
import model.contract.ContractDetail;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContractDetailDAO implements IContractDetailDAO {

    BaseDAO baseDAO = new BaseDAO();
    @Override
    public List<ContractDetail> findAllContractDetail() {
        List<ContractDetail> contractDetailList = new ArrayList<>();

        try {
            PreparedStatement preparedStatement = this.baseDAO.getConnection().
                    prepareStatement("select contract_detail_id, quantity, contract_id, attach_service_id from" +
                            "contract_detail;");
            ResultSet rs = preparedStatement.executeQuery();
            ContractDetail contractDetail;
            while (rs.next()){
                String contractDetailId = rs.getString("contract_detail_id");
                String quantity = rs.getString("quantity");
                String contractId = rs.getString("contract_id");
                String attachServiceId = rs.getString("attach_service_id");

                contractDetail = new ContractDetail(contractDetailId, quantity, contractId, attachServiceId);
                contractDetailList.add(contractDetail);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return contractDetailList;
    }

    @Override
    public String addNewContractDetail(ContractDetail contractDetail) {

            try {
                PreparedStatement preparedStatement = this.baseDAO.getConnection().
                        prepareStatement("insert into contract_detail (contract_detail_id, quantity, contract_id, " +
                                "attach_service_id)" +
                                " values (?, ?, ?, ?);");
                preparedStatement.setString(1, contractDetail.getContractDetailId());
                preparedStatement.setString(2, contractDetail.getQuantity());
                preparedStatement.setString(3, contractDetail.getContractId());
                preparedStatement.setString(4, contractDetail.getAttachServiceId());
                preparedStatement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return "Add new service successful";
    }
}
