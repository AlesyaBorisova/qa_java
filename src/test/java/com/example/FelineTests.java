package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTests {

    @Test
    public void shouldReturnMeatFood() throws Exception {
        Feline feline = new Feline();
        List<String> food = feline.eatMeat();

        assertEquals(List.of("Животные", "Птицы", "Рыба"), food);
    }


    @Test
    public void shouldReturnFamily() {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }


    @Test
    public void shouldReturnDefaultKittensCount() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
    }
}

