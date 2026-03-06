package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class LionMockTests {

    @Mock
    private Feline felineMock;


    @Test
    public void getKittensWithMockTest() throws Exception {
        when(felineMock.getKittens()).thenReturn(5);

        Lion lion = new Lion("Самец", felineMock);

        assertEquals(5, lion.getKittens());
    }

    @Test
    public void getFoodWithMockTest() throws Exception {

        List<String> mockFood = List.of("Животные", "Птицы");
        when(felineMock.eatMeat()).thenReturn(mockFood);

        Lion lion = new Lion("Самец", felineMock);

        List<String> result = lion.getFood();

        assertEquals(mockFood, result);

    }


    @Test(expected = Exception.class)

    public void shouldThrowExceptionForInvalidSex() throws Exception {
        new Lion("Неизвестно", felineMock);
    }


}
