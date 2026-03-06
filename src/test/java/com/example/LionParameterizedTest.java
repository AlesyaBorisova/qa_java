package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParameterizedTest {

        private final String sex;
        private final boolean expected;

        public LionParameterizedTest(String sex, boolean expected) {
            this.sex = sex;
            this.expected = expected;
        }

        @Parameterized.Parameters
        public static Object[][] data() {
            return new Object[][]{
                    {"Самец", true},
                    {"Самка", false}
            };
        }

        @Test
        public void shouldCheckManeDependingOnSex() throws Exception {

            Feline felineStub = new Feline() {
                @Override
                public List<String> eatMeat() throws Exception {
                    return null;
                }

                @Override
                public int getKittens() {
                    return 0;
                }
            };

            Lion lion = new Lion(sex, felineStub);
            assertEquals(expected, lion.doesHaveMane());
        }

    }
