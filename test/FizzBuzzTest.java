import main.java.FizzBuzz;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {
    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() throws Exception {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void printOutputWhenInputIsOne() {
        List<String> expectedOutput = Arrays.asList("1");
        List<String> methodOutput = fizzBuzz.fizzBuzz(1);
        assertEquals(expectedOutput, methodOutput);
    }

    @Test
    public void printOutputWhenInputIsThree() {
        List<String> expectedOutput = Arrays.asList("1", "2", "fizz");
        List<String> methodOutput = fizzBuzz.fizzBuzz(3);
        assertEquals(expectedOutput, methodOutput);
    }

    @Test
    public void printOutputWhenInputIsFive() {
        List<String> expectedOutput = Arrays.asList("1", "2", "fizz", "4", "buzz");
        List<String> methodOutput = fizzBuzz.fizzBuzz(5);
        assertEquals(expectedOutput, methodOutput);
    }

    @Test
    public void printOutputWhenInputIsFifteen() {
        List<String> expectedOutput = Arrays.asList("1", "2", "fizz", "4", "buzz", "fizz", "7", "8", "fizz", "buzz", "11", "fizz", "13", "14", "fizzbuzz");
        List<String> methodOutput = fizzBuzz.fizzBuzz(15);
        assertEquals(expectedOutput, methodOutput);
    }
}
