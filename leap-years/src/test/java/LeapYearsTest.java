import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class LeapYearsTest {

    @Test 
    public void allYearDivisbleBy400AreLeapYear() {
        LeapYears leapYears = new LeapYears();
        assertTrue(leapYears.isLeapYear(2000));
    }

    @Test void allYearDivisibleBy100ButNot400AreNotLeapYear() {
        LeapYears leapYears = new LeapYears();

        assertFalse(leapYears.isLeapYear(1700));
        assertFalse(leapYears.isLeapYear(1800));
        assertFalse(leapYears.isLeapYear(1900));
        assertFalse(leapYears.isLeapYear(2100));
    }

    @Test void allYearDivisibleBy4tNot100AreLeapYear() {
        LeapYears leapYears = new LeapYears();

        assertTrue(leapYears.isLeapYear(2008));
        assertTrue(leapYears.isLeapYear(2012));
        assertTrue(leapYears.isLeapYear(2016));
        
    }

    @Test void allYearNotDivisibleBy4AreNotLeapYear() {
        LeapYears leapYears = new LeapYears();

        assertFalse(leapYears.isLeapYear(2017));
        assertFalse(leapYears.isLeapYear(2018));
        assertFalse(leapYears.isLeapYear(2019));
        
    }

}
