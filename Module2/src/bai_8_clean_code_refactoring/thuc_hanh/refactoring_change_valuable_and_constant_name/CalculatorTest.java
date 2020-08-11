package bai_8_clean_code_refactoring.thuc_hanh.refactoring_change_valuable_and_constant_name;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {


    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';

    @Test
    @DisplayName("Testing addition")
    void testCalculateAdd() {
        int firstOperand = 1;
        int secondOperand = 1;
        char operator = ADDITION;
        int expected = 2;

        int result = Calculator.calculate(firstOperand, secondOperand, operator);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing subtraction")
    void testCalculateSub() {
        int firstOperand = 2;
        int secondOperand = 1;
        char operator = SUBTRACTION;
        int expected = 1;

        int result = Calculator.calculate(firstOperand, secondOperand, operator);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing multiplication")
    void testCalculateMul() {
        int firstOperand = 2;
        int secondOperand = 2;
        char operator = MULTIPLICATION;
        int expected = 4;

        int result = Calculator.calculate(firstOperand, secondOperand, operator);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing division")
    void testCalculateDiv() {
        int firstOperand = 6;
        int secondOperand = 3;
        char operator = DIVISION;
        int expected = 2;

        int result = Calculator.calculate(firstOperand, secondOperand, operator);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing division by zero")
    void testCalculateDivByZero() {
        int firstOperand = 2;
        int secondOperand = 0;
        char operator = DIVISION;

        assertThrows(RuntimeException.class,
                () -> {
                    Calculator.calculate(firstOperand, secondOperand, operator);
                });
    }

    @Test
    @DisplayName("Testing wrong operator")
    void testCalculateWrongOperator() {
        int firstOperand = 2;
        int secondOperand = 0;
        char operator = '=';

        assertThrows(RuntimeException.class,
                () -> {
                    Calculator.calculate(firstOperand, secondOperand, operator);
                });
    }
}