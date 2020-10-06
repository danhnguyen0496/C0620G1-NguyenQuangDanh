package bo.employee;

import dao.employee.DivisionDAO;
import dao.employee.IDivisionDAO;
import model.employee.Division;

import java.util.List;

public class DivisionBO implements IDivisionBO {

    IDivisionDAO divisionDAO = new DivisionDAO();

    @Override
    public List<Division> findAllDivision() {
        return this.divisionDAO.findAllDivision();
    }
}
