package ua.edu.ucu.lab.order.payment;


public interface PaymentStrategy {
    boolean pay(double price);
}
