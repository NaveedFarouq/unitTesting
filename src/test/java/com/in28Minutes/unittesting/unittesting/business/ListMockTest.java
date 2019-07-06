package com.in28Minutes.unittesting.unittesting.business;

import org.junit.Test;
import org.mockito.ArgumentCaptor;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

public class ListMockTest {

    List mock = mock(List.class);

    @Test
    public void some_basic(){
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

    @Test
    public void verificationBasic(){
        String value1 = (String) mock.get(0);
        String value2 = (String) mock.get(2);
        verify(mock).get(0);
        verify(mock, atLeast(1));

    }

    @Test
    public void argumentCaptor(){
        mock.add("SomeString");

        ArgumentCaptor<String> argumentCaptor = ArgumentCaptor.forClass(String.class);
        verify(mock).add(argumentCaptor.capture());

        assertEquals("SomeString", argumentCaptor.getValue());
    }

    @Test
    public void multipleArgumentCapturing(){
        mock.add("SomeString");
        mock.add("SomeString2");

        ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);

        verify(mock, times(2)).add(captor.capture());

        List<String> allValue = captor.getAllValues();

        assertEquals("SomeString", allValue.get(0));
        assertEquals("SomeString2", allValue.get(1));
    }
}
