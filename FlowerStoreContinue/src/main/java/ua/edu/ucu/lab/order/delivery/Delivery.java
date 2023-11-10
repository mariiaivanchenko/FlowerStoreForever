package ua.edu.ucu.lab.order.delivery;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.lab.flower.Item;

@Setter
@Getter
@AllArgsConstructor
public class Delivery {
    private DeliveryStrategy strategy;

    public void delivery(List<Item> items) {
        strategy.delivery(items);
    }
}