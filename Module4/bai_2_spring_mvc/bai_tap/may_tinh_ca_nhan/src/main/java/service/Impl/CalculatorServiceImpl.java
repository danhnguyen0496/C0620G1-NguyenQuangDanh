package service.Impl;

import org.springframework.stereotype.Service;
import service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public double calculator(double number1, double number2, String operator) {

        switch (operator) {
            case "+":
                return number1 + number2;
            case "-":
                return number1 - number2;
            case "*":
                return number1 * number2;
            case "/":
                if (number2 != 0) {
                    return number1 / number2;
                } else {
                    throw new RuntimeException("Không thể chia cho 0");
                }
            default:
                throw new RuntimeException("Không có giá trị nào có nghĩa");
        }
    }
}
