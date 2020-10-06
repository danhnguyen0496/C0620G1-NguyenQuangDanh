package dao.employee;

import model.employee.Position;

import java.util.List;

public interface IPositionDAO {
    List<Position> findAllPosition();
}
