package com.rithwika;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class OrderProcessorTest {

    @Test
    void testOrderIsPlacedWhenQuantityPositive() {
        OrderService mockService = mock(OrderService.class);
        OrderProcessor processor = new OrderProcessor(mockService);

        processor.processOrder("Laptop", 2);

        verify(mockService).placeOrder("Laptop", 2);
    }

    @Test
    void testOrderNotPlacedWhenQuantityZero() {
        OrderService mockService = mock(OrderService.class);
        OrderProcessor processor = new OrderProcessor(mockService);

        processor.processOrder("Laptop", 0);

        verify(mockService, never()).placeOrder(anyString(), anyInt());
    }
}
