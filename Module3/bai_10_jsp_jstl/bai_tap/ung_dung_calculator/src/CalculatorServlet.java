import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CalculatorServlet", urlPatterns = "/calculator")
public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Integer firstOperator = Integer.parseInt(request.getParameter("first-operand"));
        Integer secondOperator = Integer.parseInt(request.getParameter("second-operand"));
        String operator = request.getParameter("operator");

        int result;
        switch (operator) {
            case "+":
                result = firstOperator + secondOperator;
                break;
            case "-":
                result = firstOperator - secondOperator;
                break;
            case "*":
                result = firstOperator * secondOperator;
                break;
            case "/":
                if (secondOperator != 0) {
                    result = firstOperator / secondOperator;
                } else {
                    throw new RuntimeException("Can't divide by zero");
                }
                break;
            default:
                throw new RuntimeException("Invalid operation");
        }

        request.setAttribute("resultCalculator", String.valueOf(result));
        request.getRequestDispatcher("calculator.jsp").forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
