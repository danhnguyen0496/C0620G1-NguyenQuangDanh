package dao.contract;

import model.contract.AttachService;

import java.util.List;

public interface IAttachServiceDAO {
    List<AttachService> findAllAttachService();
}
