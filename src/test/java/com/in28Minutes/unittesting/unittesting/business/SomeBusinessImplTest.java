package com.in28Minutes.unittesting.unittesting.business;

import org.junit.Test;

import static org.junit.Assert.*;

public class SomeBusinessImplTest {

    SomeBusinessImpl someBusiness = new SomeBusinessImpl();

    @Test
    public void CalculateSumUsingDataService(){

        int actualResult = someBusiness.CalculateSum(new int[]{1,2,3});
        int expectedResult = 6;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calculateSumTestOneValue(){

        int actualResult = someBusiness.CalculateSum(new int[]{3});
        int expectedResult = 3;
        assertEquals(expectedResult, actualResult);
    }

}