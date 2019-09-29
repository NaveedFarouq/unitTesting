package com.in28Minutes.unittesting.unittesting.Controller;

import com.in28Minutes.unittesting.unittesting.Model.Item;
import com.in28Minutes.unittesting.unittesting.business.ItemFromBusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyItemController {

    @Autowired
    private ItemFromBusinessService itemFromBusinessService;

    @GetMapping("/dummy-item")
    public Item dummyItem() {
        return new Item(1, "Ball", 10, 100);
    }

    @GetMapping("/item-from-business-service")
    public Item ItemFromBusinessService() {
        return itemFromBusinessService.retrieveHardcodedItem();
    }
}