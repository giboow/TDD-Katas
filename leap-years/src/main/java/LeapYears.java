
public class LeapYears {

    public boolean isLeapYear(int year) {
        if (isDivisibleBy(year, 400))
            return true;
        if (isDivisibleBy(year, 100))
            return false;
        if (isDivisibleBy(year, 4))
            return true;
        else
            return false;

    }

    private boolean isDivisibleBy(int year, int divisor) {
        return year % divisor == 0;
    }
}
