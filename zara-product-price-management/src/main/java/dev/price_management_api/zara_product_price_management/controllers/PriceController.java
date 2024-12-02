package dev.price_management_api.zara_product_price_management.controllers;

import dev.price_management_api.zara_product_price_management.models.Price;
import dev.price_management_api.zara_product_price_management.usecases.GetPriceUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/prices")
public class PriceController {
    private final GetPriceUseCase getPriceUseCase;

    public PriceController(GetPriceUseCase getPriceUseCase) {
        this.getPriceUseCase = getPriceUseCase;
    }

    @GetMapping
    public ResponseEntity<Price> getPrice(
            @RequestParam LocalDateTime applicationDate,
            @RequestParam Long productId,
            @RequestParam Long brandId) {
        Price price = getPriceUseCase.execute(applicationDate, productId, brandId);
        return ResponseEntity.ok(price);
    }
}
