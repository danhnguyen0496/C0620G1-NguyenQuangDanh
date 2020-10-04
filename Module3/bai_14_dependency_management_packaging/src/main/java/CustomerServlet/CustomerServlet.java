package CustomerServlet;

import Customer.Customer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = {"", "/listCustomer"})
public class CustomerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList = new ArrayList<Customer>();

        customerList.add(new Customer("Nguyễn Hồng Nhật", "10/01/1997", "Đà Nẵng", "https://sieuimba.com/wp-content/uploads/2017/07/a10-1.jpg"));
        customerList.add(new Customer("Hoàng Minh Quân", "20/04/1992", "Đà Nẵng", "https://i.pinimg.com/originals/9b/69/ac/9b69acfda6b057c79950d8103622b648.jpg"));
        customerList.add(new Customer("Nguyễn Quốc Khánh", "02/09/1993", "Quảng Ngãi", "https://cdnsg.kilala.vn/data/upload/article/4589/cac%20nang%20sakura%20(4).jpg"));
        customerList.add(new Customer("Nguyễn Văn Khánh", "22/02/1997", "Đà Nẵng", "https://1.bp.blogspot.com/-dkCiQyiNy2U/WHIEQGcljmI/AAAAAAAAkKo/6XDA3e_ljZAwe2QtuHjYAxi8KNedN5stwCLcB/s640/834a2fe26b5fa376893d7d6de1bcda48.jpg"));

        request.setAttribute("listCustomer", customerList);
        request.getRequestDispatcher("list.jsp").forward(request, response);
    }
}
