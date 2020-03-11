import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {
    @Test
public void shouldReturn1for1(){
    FizzBuzz fizzBuzz = new FizzBuzz();
    String actualReturnValue = fizzBuzz.process(1);
    String expectedReturnValue = "1";
    assertEquals(expectedReturnValue, actualReturnValue);
    }
    @Test
public void shouldReturnFizzforAnyMultipleOf3(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualReturnValue = fizzBuzz.process(6);
        String expectedReturnValue = "Fizz";
        assertEquals(expectedReturnValue, actualReturnValue);
}
@Test
    public void shouldReturnBuzzForAnyMultipleof5(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualReturnValue = fizzBuzz.process(5);
        String expectedReturnValue = "Buzz";
        assertEquals(expectedReturnValue, actualReturnValue);
    }
    @Test
    public void shouldReturnFizzBuzzForAnyMultipleof3And5(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualReturnValue = fizzBuzz.process(15);
        String expectedReturnValue = "FizzBuzz";
        assertEquals(expectedReturnValue, actualReturnValue);
    }
    @Test
    public void shouldReturnInputForInput(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualReturnValue = fizzBuzz.process(7);
        String expectedReturnValue = "7";
        assertEquals(expectedReturnValue, actualReturnValue);
    }
}