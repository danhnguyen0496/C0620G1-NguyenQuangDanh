package dao.employee;

import dao.BaseDAO;
import model.employee.Position;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PositionDAO implements IPositionDAO {
    private BaseDAO baseDAO = new BaseDAO();

    @Override
    public List<Position> findAllPosition() {
        List<Position> positionList = new ArrayList<>();

        try {
            PreparedStatement preparedStatement = this.baseDAO.getConnection().
                    prepareStatement("select position_id, position_name from `position`;");
            ResultSet rs = preparedStatement.executeQuery();
            Position position;
            while (rs.next()) {
                String positionId = rs.getString("position_id");
                String positionName = rs.getString("position_name");
                position = new Position(positionId, positionName);
                positionList.add(position);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return positionList;
    }
}
