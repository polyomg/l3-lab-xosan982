package com.poly.lab5.service;

import com.poly.lab5.entity.Item;

import java.util.Collection;

//@Service don't be applied for interface, that only be appiled for implementation class
public interface L5_ShoppingCartService {
    Item add(Integer id);
    void remove(Integer id);
    Item update(Integer id, int qty);
    void clear();
    Collection<Item> getItems();
    int getCount();
    double getAmount();
}
