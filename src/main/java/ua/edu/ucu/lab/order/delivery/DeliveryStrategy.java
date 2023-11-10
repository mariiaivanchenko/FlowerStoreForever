package ua.edu.ucu.lab.order.delivery;

import java.util.List;

import ua.edu.ucu.lab.flower.Item;

public interface DeliveryStrategy {
    void delivery(List<Item> items);
}
