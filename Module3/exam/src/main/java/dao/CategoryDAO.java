package dao;

import model.Category;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoryDAO implements ICategoryDAO {
    BaseDAO baseDAO = new BaseDAO();

    @Override
    public List<Category> findAll() {

        List<Category> categoryList = new ArrayList<>();

        try {
            PreparedStatement preparedStatement = this.baseDAO.getConnection().
                    prepareStatement("select category_id, category_name from category;");
            ResultSet rs = preparedStatement.executeQuery();
            Category category;
            while (rs.next()) {
                String categoryId = rs.getString("category_id");
                String categoryName = rs.getString("category_name");
                category = new Category(categoryId, categoryName);
                categoryList.add(category);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return categoryList;
    }
}
