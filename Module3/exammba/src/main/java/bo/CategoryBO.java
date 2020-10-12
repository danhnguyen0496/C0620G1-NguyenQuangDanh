package bo;

import dao.CategoryDAO;
import dao.ICategoryDAO;
import model.Category;

import java.util.List;

public class CategoryBO implements ICategoryBO {
    ICategoryDAO categoryDAO = new CategoryDAO();

    @Override
    public List<Category> findAll() {
        return this.categoryDAO.findAll();
    }
}
