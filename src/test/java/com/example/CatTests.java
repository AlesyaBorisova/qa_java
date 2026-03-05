package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CatTests {

    @Mock
    private Predator predatorMock;

    @Test
    public void getFoodWithMockTest() throws Exception {

        List<String> mockFood = List.of("Животные", "Птицы");
        when(predatorMock.eatMeat()).thenReturn(mockFood);

        Cat cat = new Cat(predatorMock);

        List<String> result = cat.getFood();

        assertEquals(mockFood, result);
        verify(predatorMock).eatMeat();

    }

    @Test
    public void shouldReturnSound() {
        Cat cat = new Cat(predatorMock);
        assertEquals("Мяу", cat.getSound());
    }
}
