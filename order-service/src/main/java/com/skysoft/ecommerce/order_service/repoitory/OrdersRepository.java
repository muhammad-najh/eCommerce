package com.skysoft.ecommerce.order_service.repoitory;

import com.skysoft.ecommerce.order_service.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Orders, Long> {
}
