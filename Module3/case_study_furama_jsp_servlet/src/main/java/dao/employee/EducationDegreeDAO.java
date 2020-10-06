package dao.employee;

import dao.BaseDAO;
import model.employee.EducationDegree;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EducationDegreeDAO implements IEducationDegreeDAO {

    BaseDAO baseDAO = new BaseDAO();

    @Override
    public List<EducationDegree> findAllEducationDegree() {

        List<EducationDegree> educationDegreeList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseDAO.getConnection().
                    prepareStatement("select education_degree_id, education_degree_name from education_degree;");
            ResultSet rs = preparedStatement.executeQuery();

            EducationDegree educationDegree;
            while (rs.next()) {
                String educationDegreeId = rs.getString("education_degree_id");
                String educationDegreeName = rs.getString("education_degree_name");
                educationDegree = new EducationDegree(educationDegreeId, educationDegreeName);
                educationDegreeList.add(educationDegree);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return educationDegreeList;
    }
}
