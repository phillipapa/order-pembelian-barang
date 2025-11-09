package com.phillipapa.inventory.controller;

import com.phillipapa.inventory.service.StockService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/inventory")
@RequiredArgsConstructor
public class InventoryController {
    private final StockService service;

    @GetMapping("/{productId}")
    public Integer stock(@PathVariable Long productId) {
        return service.getStock(productId);
    }
}
