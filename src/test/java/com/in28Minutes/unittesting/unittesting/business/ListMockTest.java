package com.in28Minutes.unittesting.unittesting.business;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListMockTest {

    List mock = mock(List.class);

    @Test
    public void some_basic(){
        List mock = mock(List.class);
        when(mock.size()).thenReturn(5);
        assertEquals(5, mock.size());
    }

    @Test
    public void return_different_Value(){
        List mock = mock(List.class);
        when(mock.size()).thenReturn(5).thenReturn(10);
        assertEquals(5, mock.size());
        assertEquals(10, mock.size());
    }

    @Test
    public void return_parameter(){

        when(mock.get(0)).thenReturn("in28Minutes");
        assertEquals("in28Minutes", mock.get(0));
        assertEquals(null, mock.get(1));

    }

    @Test
    public void return_withGeneric_parameter(){
        when(mock.get(anyInt())).thenReturn("in28Minutes");
        assertEquals("in28Minutes", mock.get(0));
        assertEquals("in28Minutes", mock.get(1));

    }
}
