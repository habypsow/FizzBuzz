

import main.java.FizzBuzz;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


public class FizzBuzzTest {
    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() throws Exception {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void printOneWhenInputIsOne() {
        List<String> expectedOutput = Arrays.asList("1");
        List<String> methodOutput = fizzBuzz.fizzBuzz(1);
        assertEquals(expectedOutput, methodOutput);
    }
}
