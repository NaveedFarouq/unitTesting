package com.in28Minutes.unittesting.unittesting.business;

import com.in28Minutes.unittesting.unittesting.data.SomeDataService;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

class SomeDataServiceStub implements SomeDataService{

    @Override
    public int[] retrieveData(){
    return new int[] {1,2,3};
    }
}
class SomeDataServiceEmptyStub implements SomeDataService{

    @Override
    public int[] retrieveData(){
        return new int[] {};
    }
}
class SomeDataServiceOneElementStub implements SomeDataService{

    @Override
    public int[] retrieveData(){
        return new int[] {3};
    }
}


public class SomeBusinessImplStubTest {

    @Test
    public void CalculateSumUsingDataService(){
        SomeBusinessImpl someBusiness = new SomeBusinessImpl();
        someBusiness.setSomeDataService(new SomeDataServiceStub());
        int actualResult = someBusiness.CalculateSum(new int[]{1,2,3});
        int expectedResult = 6;
        assertEquals(expectedResult, actualResult);
    }


    @Test
    public void CalculateSumUsingDataServiceEmpty(){
        SomeBusinessImpl someBusiness = new SomeBusinessImpl();
        someBusiness.setSomeDataService(new SomeDataServiceEmptyStub());
        int actualResult = someBusiness.CalculateSum(new int[]{});
        int expectedResult = 0;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void CalculateSumUsingDataServiceOneElement(){
        SomeBusinessImpl someBusiness = new SomeBusinessImpl();
        someBusiness.setSomeDataService(new SomeDataServiceOneElementStub());
        int actualResult = someBusiness.CalculateSum(new int[]{3});
        int expectedResult = 3;
        assertEquals(expectedResult, actualResult);
    }

}