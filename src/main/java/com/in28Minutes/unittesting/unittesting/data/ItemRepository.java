package com.in28Minutes.unittesting.unittesting.data;

import com.in28Minutes.unittesting.unittesting.Model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {


}
