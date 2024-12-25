package com.github.sourcefranke.podcast.ep001_fizzbuzz;

public class SimpleFizzBuzzImpl implements IFizzBuzz {

    @Override
    public String fizzBuzz(int i) {
        if (i % 3 == 0 && i % 5 == 0) {
            return "FizzBuzz";
        }
        if (i % 3 == 0) {
            return "Fizz";
        }
        if (i % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(i);
    }
}
