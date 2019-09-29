package com.in28Minutes.unittesting.unittesting.Controller;

import com.in28Minutes.unittesting.unittesting.Model.Item;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyItemController {

    @GetMapping("/dummy-item")
    public Item dummyItem(){
        return new Item(1, "Ball", 10, 100);
    }
}
