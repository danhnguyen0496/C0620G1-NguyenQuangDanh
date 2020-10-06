package bo.contract;

import model.contract.Contract;

import java.util.List;

public interface IContractBO {
    List<Contract> findAllContract();

    String addNewContract(Contract contract);
}
