package controller;

import bo.CategoryBO;
import bo.ICategoryBO;
import bo.IProductBO;
import bo.ProductBO;
import model.Category;
import model.Product;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", urlPatterns = {"", "/products"})
public class ProductServlet extends HttpServlet {

    private IProductBO productBO = new ProductBO();

    private ICategoryBO categoryBO = new CategoryBO();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "delete":
                deleteProduct(request, response);
                break;
            case "create":
                addNewContract(request, response);
                break;
//            case "findPrice":
//                findByPrice(request, response);
//                break;
            case "edit":
                editProduct(request, response);
                break;
            default:
                findByName(request, response);
                break;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
//                showCreateForm(request, response); // hien thi chuyen trang
                break;
            default:
                listProduct(request, response);
                break;
        }
    }


    private void deleteProduct(HttpServletRequest request, HttpServletResponse response) {
        String id = request.getParameter("idDeleteHidden");
        String message = this.productBO.deleteById(id);
        request.setAttribute("message", message);

        listProduct(request, response);
    }

    private void listProduct(HttpServletRequest request, HttpServletResponse response) {

        List<Product> productList = this.productBO.findAll();
        request.setAttribute("productList", productList);

        List<Category> categoryList = this.categoryBO.findAll();
        request.setAttribute("categoryList", categoryList);

        RequestDispatcher dispatcher = request.getRequestDispatcher("list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void findByName(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("nameProduct");

        List<Product> productList = this.productBO.findByName(name);
        request.setAttribute("productList", productList);

        List<Category> categoryList = this.categoryBO.findAll();
        request.setAttribute("categoryList", categoryList);

        RequestDispatcher dispatcher = request.getRequestDispatcher("list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void addNewContract(HttpServletRequest request, HttpServletResponse response) {
        String productId = request.getParameter("productId");
        String productName = request.getParameter("productName");
        String productPrice = request.getParameter("productPrice");
        String productQuantity = request.getParameter("productQuantity");
        String productColor = request.getParameter("productColor");
        String productDescription = request.getParameter("productDescription");
        String categoryId = request.getParameter("categoryId");

        Product product = new Product(productId, productName, productPrice, productQuantity, productColor, productDescription, categoryId);
        String message = this.productBO.addNewProduct(product);
        request.setAttribute("message", message);
        listProduct(request, response);

//        if (Integer.parseInt(product.getProductPrice()) > 10000000){
//            listProduct(request, response);
//        }else {
//            try {
//                response.sendRedirect("/products");
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//        }
    }

    //        private void findByPrice(HttpServletRequest request, HttpServletResponse response) {
//            String price = request.getParameter("priceProduct");
//
//            List<Product> productList = this.productBO.findByName(price);
//            request.setAttribute("productList", productList);
//
//            List<Category> categoryList = this.categoryBO.findAll();
//            request.setAttribute("categoryList", categoryList);
//
//            RequestDispatcher dispatcher = request.getRequestDispatcher("list.jsp");
//            try {
//                dispatcher.forward(request, response);
//            } catch (ServletException e) {
//                e.printStackTrace();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }

        private void editProduct(HttpServletRequest request, HttpServletResponse response) {
        String productName = request.getParameter("productName");
        String productPrice = request.getParameter("productPrice");
        String productQuantity = request.getParameter("productQuantity");
        String productColor = request.getParameter("productColor");
        String productDescription = request.getParameter("productDescription");
        String categoryId = request.getParameter("categoryId");
        String id = request.getParameter("idEditHidden");
        Product product = new Product(id, productName, productPrice, productQuantity, productColor, productDescription, categoryId);
        String message = this.productBO.edit(id, product);
        request.setAttribute("message", message);
        listProduct(request, response);

    }
}
