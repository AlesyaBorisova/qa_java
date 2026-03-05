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
    private Predator predatorMock;


    @Test
    public void getKittensWithMockTest() throws Exception {
        when(predatorMock.getKittens()).thenReturn(5);

        Lion lion = new Lion("Самец", predatorMock);

        assertEquals(5, lion.getKittens());
        verify(predatorMock).getKittens();
    }

    @Test
    public void getFoodWithMockTest() throws Exception {

        List<String> mockFood = List.of("Животные", "Птицы");
        when(predatorMock.eatMeat()).thenReturn(mockFood);

        Lion lion = new Lion("Самец", predatorMock);

        List<String> result = lion.getFood();

        assertEquals(mockFood, result);


        verify(predatorMock).eatMeat();

    }


    @Test(expected = Exception.class)

    public void shouldThrowExceptionForInvalidSex() throws Exception {
        new Lion("Неизвестно", predatorMock);
    }


}
