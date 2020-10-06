package dao.contract;

import dao.BaseDAO;
import model.contract.Contract;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContractDAO implements IContractDAO {

    BaseDAO baseDAO = new BaseDAO();

    @Override
    public List<Contract> findAllContract() {
        List<Contract> contractList = new ArrayList<>();

        try {
            PreparedStatement preparedStatement = this.baseDAO.getConnection().
                    prepareStatement("select contract_id, contract_start_date, contract_end_date," +
                            "contract_deposit, contract_total_money, employee_id, customer_id, service_id from contract;");
            ResultSet rs = preparedStatement.executeQuery();
            Contract contract;
            while (rs.next()) {
                String contractId = rs.getString("contract_id");
                String contractStartDate = rs.getString("contract_start_date");
                String contractEndDate = rs.getString("contract_end_date");
                String contractDeposit = rs.getString("contract_deposit");
                String contractTotalMoney = rs.getString("contract_total_money");
                String employeeId = rs.getString("employee_id");
                String customerId = rs.getString("customer_id");
                String serviceId = rs.getString("service_id");

                contract = new Contract(contractId, contractStartDate, contractEndDate, contractDeposit, contractTotalMoney,
                        employeeId, customerId, serviceId);
                contractList.add(contract);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return contractList;
    }

    @Override
    public String addNewContract(Contract contract) {
        try {
            PreparedStatement preparedStatement = this.baseDAO.getConnection().
                    prepareStatement("insert into contract (contract_id, contract_start_date, contract_end_date, " +
                            "contract_deposit, contract_total_money, employee_id, customer_id, service_id)" +
                            " values (?, ?, ?, ?, ?, ?, ?, ?);");
            preparedStatement.setString(1, contract.getContractId());
            preparedStatement.setString(2, contract.getContractStartDate());
            preparedStatement.setString(3, contract.getContractEndDate());
            preparedStatement.setString(4, contract.getContractDeposit());
            preparedStatement.setString(5, contract.getContractTotalMoney());
            preparedStatement.setString(6, contract.getEmployeeId());
            preparedStatement.setString(7, contract.getCustomerId());
            preparedStatement.setString(8, contract.getServiceId());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "Add new service successful";
    }
}
