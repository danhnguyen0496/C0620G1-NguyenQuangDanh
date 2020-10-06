package bo.employee;

import dao.employee.EducationDegreeDAO;
import dao.employee.IEducationDegreeDAO;
import model.employee.EducationDegree;

import java.util.List;

public class EducationDegreeBO implements IEducationDegreeBO {

    IEducationDegreeDAO educationDegreeDAO = new EducationDegreeDAO();

    @Override
    public List<EducationDegree> findAllEducationDegree() {
        return this.educationDegreeDAO.findAllEducationDegree();
    }
}
