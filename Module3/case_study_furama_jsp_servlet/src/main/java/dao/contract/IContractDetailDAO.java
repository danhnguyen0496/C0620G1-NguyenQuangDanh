package dao.contract;

import model.contract.ContractDetail;

import java.util.List;

public interface IContractDetailDAO {
    List<ContractDetail> findAllContractDetail ();
    String addNewContractDetail(ContractDetail contractDetail);
}
