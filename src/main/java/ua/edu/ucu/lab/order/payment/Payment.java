package ua.edu.ucu.lab.order.payment;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Payment {
    private PaymentStrategy strategy;

    public boolean pay(double price) {
        return strategy.pay(price);
    }
}
