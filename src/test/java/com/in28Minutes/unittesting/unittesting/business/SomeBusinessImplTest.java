package com.in28Minutes.unittesting.unittesting.business;

import org.junit.Test;

import static org.junit.Assert.*;

public class SomeBusinessImplTest {

    @Test
    public void CalculateSumUsingDataService(){
        SomeBusinessImpl someBusiness = new SomeBusinessImpl();
        int actualResult = someBusiness.CalculateSum(new int[]{1,2,3});
        int expectedResult = 6;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calculateSumTestOneValue(){
        SomeBusinessImpl someBusiness = new SomeBusinessImpl();
        int actualResult = someBusiness.CalculateSum(new int[]{3});
        int expectedResult = 3;
        assertEquals(expectedResult, actualResult);
    }

}