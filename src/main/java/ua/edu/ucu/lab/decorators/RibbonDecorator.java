package ua.edu.ucu.lab.decorators;

import ua.edu.ucu.lab.flower.Item;

public class RibbonDecorator extends ItemDecorator{
    public RibbonDecorator(Item item) {
        super(item);
    }

    public double getPrice() {
        return this.getItem().getPrice();
    }

    public String getDescription() {
        double price = this.getItem().getPrice();
        return "Ribbon price: " + price;
    }
}
