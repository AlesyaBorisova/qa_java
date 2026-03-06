package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineParameterizedTest {


    private final int input;
    private final int expected;

    public FelineParameterizedTest(int input, int expected) {
        this.expected = expected;
        this.input = input;
    }

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][]{
                {0, 0},
                {2, 2},
                {5, 5}
        };
    }

    @Test
    public void shouldReturnCustomKittensCount() {
        Feline feline = new Feline();
        assertEquals(expected, feline.getKittens(input));
    }
}
