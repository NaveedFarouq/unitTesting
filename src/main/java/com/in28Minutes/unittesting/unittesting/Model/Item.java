package com.in28Minutes.unittesting.unittesting.Model;

public class Item {

    private int id;
    private String name;
    private int price;
    private int quatity;

    public Item(int id, String name, int price, int quatity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quatity = quatity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuatity() {
        return quatity;
    }

    public void setQuatity(int quatity) {
        this.quatity = quatity;
    }

    @Override
    public String toString() {
        return String.format("Item[%d, %s, %d, %d]", id, name, price, quatity);

    }
}