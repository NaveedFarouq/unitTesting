package com.in28Minutes.unittesting.unittesting.business;

import com.in28Minutes.unittesting.unittesting.data.SomeDataService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.mock;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessImplStubTest {

    @InjectMocks
    SomeBusinessImpl someBusiness;
    @Mock
    SomeDataService someDataServiceMock;


    @Test
    public void CalculateSumUsingDataService(){

        when(someDataServiceMock.retrieveData()).thenReturn(new int[]{1,2,3});
        assertEquals(6, someBusiness.CalculateSumUsingDataService());
    }


    @Test
    public void CalculateSumUsingDataServiceEmpty(){
        when(someDataServiceMock.retrieveData()).thenReturn(new int[]{});
        assertEquals(0, someBusiness.CalculateSumUsingDataService());
    }

    @Test
    public void CalculateSumUsingDataServiceOneElement() {
        when(someDataServiceMock.retrieveData()).thenReturn(new int[]{3});
        assertEquals(3, someBusiness.CalculateSumUsingDataService());
    }

}