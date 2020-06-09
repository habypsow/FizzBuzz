package main.java;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int number) {
        List<String> result = new ArrayList<>();
        String str = Integer.toString(number);
        result.add(str);
        return result;
    }
}
