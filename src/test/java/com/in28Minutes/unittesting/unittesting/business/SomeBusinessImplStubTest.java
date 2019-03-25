package com.in28Minutes.unittesting.unittesting.business;

import com.in28Minutes.unittesting.unittesting.data.SomeDataService;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class SomeBusinessImplStubTest {

    SomeBusinessImpl someBusiness = new SomeBusinessImpl();
    SomeDataService someDataServiceMock = mock(SomeDataService.class);

    @Before
    public void beforeEachTest(){
        someBusiness.setSomeDataService(someDataServiceMock);
    }

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