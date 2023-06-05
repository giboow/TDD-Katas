import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {


    @Test
    public void testFizzBuzzWhenNumberIsDivisibleBy3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.fizzBuzz(3);
        assertEquals("Fizz", result);
    }


    @Test
    public void testFizzBuzzWhenNumberIsDivisibleBy5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.fizzBuzz(5);
        assertEquals("Buzz", result);
    }

    @Test
    public void testFizzBuzzWhenNotDivisibleBy3Or5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.fizzBuzz(7);
        assertEquals("7", result);
    }

    @Test
    public void testFizzBuzzWhenDivisibleBy3And5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.fizzBuzz(15);
        assertEquals("FizzBuzz", result);
    }
}
