package com.skysoft.ecommerce.order_service.clients;

import com.skysoft.ecommerce.order_service.dto.OrderRequestDto;
import com.skysoft.ecommerce.order_service.fallback.InventoryServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "inventory-service", path = "/inventory",fallback = InventoryServiceFallback.class)
public interface InventoryOpenFeignClient {

    @PutMapping("/products/reduce-stocks")
    Double reduceStocks(@RequestBody OrderRequestDto orderRequestDto);


}
