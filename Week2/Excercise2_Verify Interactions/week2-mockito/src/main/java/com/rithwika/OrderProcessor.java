package com.rithwika;

public class OrderProcessor {
    private final OrderService orderService;

    public OrderProcessor(OrderService orderService) {
        this.orderService = orderService;
    }

    public void processOrder(String item, int quantity) {
        if (quantity > 0) {
            orderService.placeOrder(item, quantity);
        }
    }
}
