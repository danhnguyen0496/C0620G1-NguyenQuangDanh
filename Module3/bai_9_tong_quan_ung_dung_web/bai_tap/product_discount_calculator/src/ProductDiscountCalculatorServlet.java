import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ProductDiscountCalculatorServlet", urlPatterns = "/product-discount-calculator")
public class ProductDiscountCalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String description = request.getParameter("droduct_description");
        String price = request.getParameter("list_price");
        String discount_percent = request.getParameter("discount_percent");

//        Discount Amount = List Price * Discount Percent * 0.01
        float discount_amount = (float) (Float.parseFloat(price) * Float.parseFloat(discount_percent) * 0.01);
        float price_stage = Float.parseFloat(price) - discount_amount;

        request.setAttribute("result_description", description);
        request.setAttribute("result_price", price);
        request.setAttribute("result_discount_percent", discount_percent);


        request.setAttribute("result_discount_amount", String.valueOf(discount_amount));
        request.setAttribute("result_price_stage", String.valueOf(price_stage));

        request.getRequestDispatcher("display-discount.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
