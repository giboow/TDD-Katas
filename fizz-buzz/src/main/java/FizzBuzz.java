public class FizzBuzz {

    private static final Integer FIZZ_DIVISOR = 3;
    private static final Integer BUZZ_DIVISOR = 5;

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";

    public String fizzBuzz(Integer number) {
        StringBuilder result = new StringBuilder();

        if (isMultipleOf(number, FIZZ_DIVISOR)) {
            result.append(FIZZ);
        }
        if (isMultipleOf(number, BUZZ_DIVISOR)) {
            result.append(BUZZ);
        }

        if (result.length() > 0) {
            return result.toString();
        }

        return number.toString();
    }

    protected boolean isMultipleOf(Integer number, Integer divisor) {
        return number % divisor == 0;
    }

}
