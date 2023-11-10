package ua.edu.ucu.lab.decorators;

import ua.edu.ucu.lab.flower.Item;

public class PaperDecorator extends ItemDecorator{
    public PaperDecorator(Item item) {
        super(item);
    }

    public double getPrice() {
        return this.getItem().getPrice();
    }

    public String getDescription() {
        double price = this.getItem().getPrice();
        return "Paper price: " + price;
    }
}
