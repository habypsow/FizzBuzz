package main.java;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int number) {
        List<String> result = new ArrayList<>();

        for (int i = 1; i <= number; i++) {
            boolean divisibleByThree = (i % 3 == 0);
            if (divisibleByThree) {
                result.add("fizz");
            } else {
                result.add(Integer.toString(i));
            }
        }


       // result.add(str);
        return result;
    }
}
