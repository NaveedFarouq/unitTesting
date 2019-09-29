package com.in28Minutes.unittesting.unittesting.business;

import com.in28Minutes.unittesting.unittesting.Model.Item;
import com.in28Minutes.unittesting.unittesting.data.ItemRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ItemFromBusinessServiceTest {

    @InjectMocks
    private ItemFromBusinessService itemFromBusinessService;

    @Mock
    private ItemRepository itemRepository;

    @Before
    public void before(){

    }

    @Test
    public void retrieveAllItems(){

        when(itemRepository.findAll()).thenReturn(
                Arrays.asList(new Item(2, "Item2", 10, 10),
                            new Item(3, "Item3", 20, 10)));
        List<Item> items = itemFromBusinessService.retrieveAllItems();
        assertEquals(100, items.get(0).getValue());
        assertEquals(200, items.get(1).getValue());
    }

}