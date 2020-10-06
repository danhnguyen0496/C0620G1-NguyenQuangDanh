package dao.contract;

import model.contract.Contract;

import java.util.List;

public interface IContractDAO {

    List<Contract> findAllContract();

    String addNewContract(Contract contract);
}
