package ua.edu.ucu.lab.order;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import ua.edu.ucu.lab.flower.Item;
import ua.edu.ucu.lab.order.delivery.DHLStrategy;
import ua.edu.ucu.lab.order.delivery.Delivery;
import ua.edu.ucu.lab.order.delivery.DeliveryType;
import ua.edu.ucu.lab.order.delivery.PostStrategy;
import ua.edu.ucu.lab.order.payment.CardStrategy;
import ua.edu.ucu.lab.order.payment.PayPalStrategy;
import ua.edu.ucu.lab.order.payment.PaymentType;
import ua.edu.ucu.lab.order.payment.Payment;

@Getter
public class Order {
    private List<Item> items = new ArrayList<>();
    private PaymentType payment;
    private DeliveryType delivery;

    public void setPaymentStrategy(PaymentType paym) {
        this.payment = paym;
    }

    public void setDeliveryStrategy(DeliveryType deliv) {
        this.delivery = deliv;
    }

    public double calculateTotalPrice() {
        double result = 0;
        for (Item elem : items) {
            result += elem.getPrice();
        }
        return result;
    }

    public void processOrder() {
        Payment paym = new Payment(null);
        if (payment == PaymentType.CARD) {
            paym.setStrategy(new CardStrategy());
        }
        if (payment == PaymentType.PAYPAL) {
            paym.setStrategy(new PayPalStrategy());
        }

        Delivery del = new Delivery(null);
        if (delivery == DeliveryType.POST) {
            del.setStrategy(new PostStrategy());
        }
        if (delivery == DeliveryType.DHL) {
            del.setStrategy(new DHLStrategy());
        }

        if (paym.pay(calculateTotalPrice())) {
            System.out.println("Payment is successful!");
            del.delivery(items);
            System.out.println("Order proccessed!");
        } else {
            System.out.println("Payment is unsuccessful! Try again.");
        }
        
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeltem(Item item) {
        if (items.contains(item)) {
            items.remove(item);
        }
    }
}
