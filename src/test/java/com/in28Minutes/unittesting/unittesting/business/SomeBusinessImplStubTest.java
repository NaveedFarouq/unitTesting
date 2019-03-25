package com.in28Minutes.unittesting.unittesting.business;

import com.in28Minutes.unittesting.unittesting.data.SomeDataService;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
//
//class SomeDataServiceStub implements SomeDataService{
//
//    @Override
//    public int[] retrieveData(){
//    return new int[] {1,2,3};
//    }
//}
//class SomeDataServiceEmptyStub implements SomeDataService{
//
//    @Override
//    public int[] retrieveData(){
//        return new int[] {};
//    }
//}
//class SomeDataServiceOneElementStub implements SomeDataService{
//
//    @Override
//    public int[] retrieveData(){
//        return new int[] {3};
//    }
//}


public class SomeBusinessImplStubTest {

    @Test
    public void CalculateSumUsingDataService(){
        SomeBusinessImpl someBusiness = new SomeBusinessImpl();
        SomeDataService someDataServiceMock = mock(SomeDataService.class);
        when(someDataServiceMock.retrieveData()).thenReturn(new int[]{1,2,3});

        someBusiness.setSomeDataService(someDataServiceMock);

        int actualResult = someBusiness.CalculateSumUsingDataService();
        int expectedResult = 6;
        assertEquals(expectedResult, actualResult);
    }


    @Test
    public void CalculateSumUsingDataServiceEmpty(){
        SomeBusinessImpl someBusiness = new SomeBusinessImpl();
        SomeDataService someDataServiceMock = mock(SomeDataService.class);
        when(someDataServiceMock.retrieveData()).thenReturn(new int[]{});
        someBusiness.setSomeDataService(someDataServiceMock );
        int actualResult = someBusiness.CalculateSumUsingDataService();
        int expectedResult = 0;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void CalculateSumUsingDataServiceOneElement() {
        SomeBusinessImpl someBusiness = new SomeBusinessImpl();
        SomeDataService someDataServiceMock = mock(SomeDataService.class);
        when(someDataServiceMock.retrieveData()).thenReturn(new int[]{3});
        someBusiness.setSomeDataService(someDataServiceMock);
        int actualResult = someBusiness.CalculateSumUsingDataService();
        int expectedResult = 3;
        assertEquals(expectedResult, actualResult);
    }

}