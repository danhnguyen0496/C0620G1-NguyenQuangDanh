package dao.employee;

import dao.BaseDAO;
import model.employee.Division;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DivisionDAO implements IDivisionDAO {

    BaseDAO baseDAO = new BaseDAO();

    @Override
    public List<Division> findAllDivision() {
        List<Division> divisionList = new ArrayList<>();

        try {
            PreparedStatement preparedStatement = this.baseDAO.getConnection().
                    prepareStatement("select division_id,division_name from division");

            ResultSet rs = preparedStatement.executeQuery();
            Division division;
            while (rs.next()) {
                String divisionId = rs.getString("division_id");
                String divisionName = rs.getString("division_name");
                division = new Division(divisionId, divisionName);
                divisionList.add(division);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return divisionList;
    }
}
