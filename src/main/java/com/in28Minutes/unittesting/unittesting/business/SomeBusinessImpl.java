package com.in28Minutes.unittesting.unittesting.business;

import com.in28Minutes.unittesting.unittesting.data.SomeDataService;

public class SomeBusinessImpl {

    private SomeDataService someDataService;

    public void setSomeDataService(SomeDataService someDataService) {
        this.someDataService = someDataService;
    }

    public int CalculateSum(int [] data){
        int sum = 0;
        for (int value:data){
            sum += value;
        }
        return sum;
    }

    public int CalculateSumUsingDataService(){
        int sum = 0;
        int[] data = someDataService.retrieveData();
        for (int value:data){
            sum += value;
        }
        return sum;
    }
}
