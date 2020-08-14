package bai_9_automated_testing_tdd.bai_tap.calculator_next_day;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void findNextDay() {
        int day = 12;
        int month = 10;
        int year = 1980;
        String expect = "12/10/1980";

        String result = NextDayCalculator.findNextDay(day,month,year);
        assertEquals(expect, result);
    }
}