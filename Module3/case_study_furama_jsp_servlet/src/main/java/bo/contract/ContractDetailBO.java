package bo.contract;

import dao.contract.ContractDetailDAO;
import dao.contract.IContractDetailDAO;
import model.contract.ContractDetail;

import java.util.List;

public class ContractDetailBO implements IContractDetailBO {
    IContractDetailDAO contractDetailDAO = new ContractDetailDAO();
    @Override
    public List<ContractDetail> findAllContractDetail() {
        return this.contractDetailDAO.findAllContractDetail();
    }

    @Override
    public String addNewContractDetail(ContractDetail contractDetail) {
        return this.contractDetailDAO.addNewContractDetail(contractDetail);
    }
}
