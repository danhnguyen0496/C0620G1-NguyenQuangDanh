package bo.contract;

import dao.contract.ContractDAO;
import dao.contract.IContractDAO;
import model.contract.Contract;

import java.util.List;

public class ContractBO implements IContractBO {

    IContractDAO contractDAO = new ContractDAO();

    @Override
    public List<Contract> findAllContract() {
        return this.contractDAO.findAllContract();
    }

    @Override
    public String addNewContract(Contract contract) {
        String message = contractDAO.addNewContract(contract);
        return message;
    }
}
