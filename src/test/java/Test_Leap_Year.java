import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Test_Leap_Year {

    @Test
    public void say_no_if_year_is_not_divisible_by_4() {
         Years years = new Years();

        assertFalse(Years.boolisLeapYear(3));
        assertFalse(Years.boolisLeapYear(5));
        assertFalse(Years.boolisLeapYear(2));
        assertFalse(Years.boolisLeapYear(1997));
    }

    @Test
    public void say_yes_if_year_is_divisible_by_4() {
        Years years = new Years();

        assertTrue(Years.boolisLeapYear(0));
        assertTrue(Years.boolisLeapYear(4));
        assertTrue(Years.boolisLeapYear(8));
        assertTrue(Years.boolisLeapYear(1996));
    }

    @Test
    public void say_no_if_year_is_divisible_by_100_but_not_by_400() {
        Years years = new Years();

        assertFalse(Years.boolisLeapYear(100));
        assertFalse(Years.boolisLeapYear(200));
        assertFalse(Years.boolisLeapYear(300));
        assertFalse(Years.boolisLeapYear(500));
        assertFalse(Years.boolisLeapYear(1800));
    }

    @Test
    public void say_yes_if_year_is_divisible_by_400() {
        Years years = new Years();

        assertTrue(Years.boolisLeapYear(0));
        assertTrue(Years.boolisLeapYear(400));
        assertTrue(Years.boolisLeapYear(800));
        assertTrue(Years.boolisLeapYear(1200));
        assertTrue(Years.boolisLeapYear(1600));
    }
}
























