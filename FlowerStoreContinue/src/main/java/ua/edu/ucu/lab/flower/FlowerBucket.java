package ua.edu.ucu.lab.flower;

import java.util.List;
import java.util.ArrayList;

public class FlowerBucket extends Item {
    private List<FlowerPack> flowerPacks = new ArrayList<>();

    public void addFlowerPack(FlowerPack flp) {
        flowerPacks.add(flp);
    }
    
    public double getPrice() {
        double price = 0;
        for (FlowerPack flowerPack : flowerPacks) {
            price += flowerPack.getPrice();
        }
        return price;
    }
}
