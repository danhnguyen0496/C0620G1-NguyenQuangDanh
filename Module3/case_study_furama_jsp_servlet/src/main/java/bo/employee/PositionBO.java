package bo.employee;

import dao.employee.IPositionDAO;
import dao.employee.PositionDAO;
import model.employee.Position;

import java.util.List;

public class PositionBO implements IPositionBO {

    IPositionDAO positionDAO = new PositionDAO();

    @Override
    public List<Position> findAllPosition() {
        return this.positionDAO.findAllPosition();
    }
}
