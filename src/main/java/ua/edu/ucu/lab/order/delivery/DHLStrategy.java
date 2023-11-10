package ua.edu.ucu.lab.order.delivery;

import java.util.List;

import ua.edu.ucu.lab.flower.Item;

public class DHLStrategy implements DeliveryStrategy {
    @Override
    public void delivery(List<Item> items) {
        System.out.print("Items: " 
                         + items.toString() 
                         + "were delivered via DHL Service.");
    }
}
