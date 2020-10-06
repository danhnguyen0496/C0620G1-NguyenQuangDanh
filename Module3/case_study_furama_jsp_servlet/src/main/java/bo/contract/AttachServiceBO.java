package bo.contract;

import dao.contract.AttachServiceDAO;
import dao.contract.IAttachServiceDAO;
import model.contract.AttachService;

import java.util.List;

public class AttachServiceBO implements IAttachServiceBO {

    IAttachServiceDAO attachServiceDAO = new AttachServiceDAO();

    @Override
    public List<AttachService> findAllAttachService() {
        return this.attachServiceDAO.findAllAttachService();
    }
}
