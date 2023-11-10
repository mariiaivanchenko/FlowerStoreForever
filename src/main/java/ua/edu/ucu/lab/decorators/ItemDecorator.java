package ua.edu.ucu.lab.decorators;

import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.lab.flower.Item;

@Setter
@Getter
public abstract class ItemDecorator {
    private Item item;

    public ItemDecorator(Item element) {
        this.item = element;
    }

    public String getDescription() {
        double price = item.getPrice();
        return "Price: " + price;
    }
}
