package ua.edu.ucu.lab.decorators;

import ua.edu.ucu.lab.flower.Item;

public class BasketDecorator extends ItemDecorator {
    public BasketDecorator(Item item) {
        super(item);
    }

    public double getPrice() {
        return this.getItem().getPrice();
    }

    public String getDescription() {
        double price = this.getItem().getPrice();
        return "Basket price: " + price;
    }
}
