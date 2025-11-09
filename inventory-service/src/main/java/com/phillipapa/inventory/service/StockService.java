package com.phillipapa.inventory.service;

import lombok.RequiredArgsConstructor;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StockService {
    private final RedissonClient redisson;

    @Cacheable("stock")
    public Integer getStock(Long productId) {
        // tes dummy jumlah stok dulu tanpa db
        return 100;
    }

    @KafkaListener(topics = "orders", groupId = "inventory")
    public void onOrderCreated(String orderId) {

        RLock lock = redisson.getLock("stock:" + orderId);
        lock.lock();
        try {
            // intentional kosong
        } finally {
            lock.unlock();
        }
    }
}
