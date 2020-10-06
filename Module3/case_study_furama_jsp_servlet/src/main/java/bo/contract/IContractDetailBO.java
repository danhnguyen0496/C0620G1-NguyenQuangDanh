package bo.contract;

import model.contract.Contract;
import model.contract.ContractDetail;

import java.util.List;

public interface IContractDetailBO {
    List<ContractDetail> findAllContractDetail ();

    String addNewContractDetail(ContractDetail contractDetail);
}
