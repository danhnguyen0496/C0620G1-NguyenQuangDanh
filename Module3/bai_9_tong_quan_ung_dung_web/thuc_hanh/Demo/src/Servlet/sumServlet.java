package Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "sumServlet", urlPatterns = "/sumServlet")
public class sumServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String numberOne = request.getParameter("number1");
        String numberTwo = request.getParameter("number2");
        int result = Integer.parseInt(numberOne) + Integer.parseInt(numberTwo);

        request.setAttribute("total", String.valueOf(result));
        request.getRequestDispatcher("sumServlet.jsp").forward(request, response);
    }
}
