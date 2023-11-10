package ua.edu.ucu.lab.order.delivery;

import java.util.List;

import ua.edu.ucu.lab.flower.Item;

public class PostStrategy implements DeliveryStrategy {
    @Override
    public void delivery(List<Item> items) {
        System.out.print("Items: " 
                         + items 
                         + "were delivered via Post Service.");
    }
}
