package com.in28Minutes.unittesting.unittesting.business;

import com.in28Minutes.unittesting.unittesting.Model.Item;
import com.in28Minutes.unittesting.unittesting.data.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ItemFromBusinessService {

    @Autowired
    private ItemRepository itemRepository;

    public Item retrieveHardcodedItem(){
        return new Item(1, "Ball", 10, 100);
    }

    public List<Item> retrieveAllItems(){
        List<Item> items = itemRepository.findAll();

        for(Item item:items){
            item.setValue(item.getPrice() * item.getQuatity());
        }
        return items;
    }
}
