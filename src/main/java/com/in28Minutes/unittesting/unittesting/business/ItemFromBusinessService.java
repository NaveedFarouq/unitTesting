package com.in28Minutes.unittesting.unittesting.business;

import com.in28Minutes.unittesting.unittesting.Model.Item;
import org.springframework.stereotype.Component;

@Component
public class ItemFromBusinessService {

    public Item retrieveHardcodedItem(){
        return new Item(1, "Ball", 10, 100);
    }
}
