package com.skysoft.ecommerce.order_service.fallback;

import com.skysoft.ecommerce.order_service.clients.InventoryOpenFeignClient;
import com.skysoft.ecommerce.order_service.dto.OrderRequestDto;
import org.springframework.stereotype.Component;

@Component
public class InventoryServiceFallback implements InventoryOpenFeignClient {
    @Override
    public Double reduceStocks(OrderRequestDto orderRequestDto) {
        // Log the error or handle as needed
        throw new RuntimeException("Inventory service is unavailable or unable to fulfill order");
    }
}