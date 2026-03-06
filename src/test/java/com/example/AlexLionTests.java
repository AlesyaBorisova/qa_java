package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AlexLionTests {

    @Test
    public void shouldReturnKittensCount() throws Exception {
        AlexLion alexLion = new AlexLion();
        assertEquals(0, alexLion.getKittens());
    }

    @Test
    public void shouldReturnPlaceOfLiving() throws Exception {
        AlexLion alexLion = new AlexLion();
        assertEquals("New York ZOO", alexLion.getPlaceOfLiving());
    }

    @Test
    public void shouldReturnFriends() throws Exception {
        AlexLion alexLion = new AlexLion();
        List<String> friends = alexLion.getFriends();

        assertEquals(List.of("Мартин", "Глория", "Мелман"), friends);
    }

    @Test
    public void shouldHaveMane() throws Exception {
        AlexLion alexLion = new AlexLion();
        assertTrue(alexLion.doesHaveMane());
    }

    @Test
    public void shouldReturnFoodFromPredator() throws Exception {
        AlexLion alexLion = new AlexLion();
        List<String> food = alexLion.getFood();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), food);
    }
}