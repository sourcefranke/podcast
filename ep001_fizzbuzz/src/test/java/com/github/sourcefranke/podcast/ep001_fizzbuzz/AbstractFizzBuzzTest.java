package com.github.sourcefranke.podcast.ep001_fizzbuzz;

import org.junit.jupiter.params.provider.Arguments;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.of;

public abstract class AbstractFizzBuzzTest {

    static void testFizzBuzz(IFizzBuzz fb, int i, String expected) {
        assertThat(fb.fizzBuzz(i)).isEqualTo(expected);
    }

    public static Arguments[] fizzBuzz() {
        return new Arguments[] {
                of(1, "1"),
                of(2, "2"),
                of(3, "Fizz"),
                of(4, "4"),
                of(5, "Buzz"),
                of(6, "Fizz"),
                of(7, "7"),
                of(8, "8"),
                of(9, "Fizz"),
                of(10, "Buzz"),
                of(11, "11"),
                of(12, "Fizz"),
                of(13, "13"),
                of(14, "14"),
                of(15, "FizzBuzz"),
                of(16, "16"),
                of(17, "17"),
                of(18, "Fizz"),
                of(19, "19"),
                of(20, "Buzz"),
                of(21, "Fizz"),
                of(22, "22"),
                of(23, "23"),
                of(24, "Fizz"),
                of(25, "Buzz"),
                of(26, "26"),
                of(27, "Fizz"),
                of(28, "28"),
                of(29, "29"),
                of(30, "FizzBuzz"),
        };
    }
}
