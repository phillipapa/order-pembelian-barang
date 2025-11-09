package com.phillipapa.order.service;

import com.phillipapa.order.model.Order;
import com.phillipapa.order.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;
    private final KafkaTemplate<String, String> kafka;

    public Order create(Order order) {
        Order savedMessage = orderRepository.save(order);
        kafka.send("orders", "OrderCreated", savedMessage.getId().toString());
        return savedMessage;
    }
}
