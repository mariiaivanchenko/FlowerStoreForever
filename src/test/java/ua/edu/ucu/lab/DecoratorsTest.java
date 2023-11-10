package ua.edu.ucu.lab;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.edu.ucu.lab.decorators.PaperDecorator;
import ua.edu.ucu.lab.decorators.BasketDecorator;
import ua.edu.ucu.lab.decorators.RibbonDecorator;
import ua.edu.ucu.lab.flower.Flower;
import ua.edu.ucu.lab.flower.FlowerBucket;
import ua.edu.ucu.lab.flower.FlowerPack;

public class DecoratorsTest {
    private static final int ITER = 3;
    private Flower fl = new Flower();
    private FlowerPack flPack = new FlowerPack(fl);
    private FlowerBucket bucket = new FlowerBucket();
    private PaperDecorator paper = new PaperDecorator(bucket);
    private BasketDecorator basket = new BasketDecorator(bucket);
    private RibbonDecorator ribbon = new RibbonDecorator(bucket);

    @BeforeEach
    public void init() {
        for (int i = 0; i < ITER; i++) {
            bucket.addFlowerPack(flPack);
        }
    }

    @Test
    public void testPaper() {
        String paperPrice = paper.getDescription();
        Assertions.assertTrue(paperPrice.contains("Paper price:"));
    }
    
    @Test
    public void testBasket() {
        String basketPrice = basket.getDescription();
        Assertions.assertTrue(basketPrice.contains("Basket price:"));
    }
    
    @Test
    public void testRibbon() {
        String ribbonPrice = ribbon.getDescription();
        Assertions.assertTrue(ribbonPrice.contains("Ribbon price:"));
    }
}
