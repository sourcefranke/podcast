package com.github.sourcefranke.podcast.ep001_fizzbuzz;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class StreamFizzBuzzImplTest extends AbstractFizzBuzzTest {

    IFizzBuzz fb = new StreamFizzBuzzImpl();

    @ParameterizedTest
    @MethodSource
    void fizzBuzz(int i, String expected) {
        testFizzBuzz(fb, i, expected);
    }
}
