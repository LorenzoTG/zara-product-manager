package dev.price_management_api.zara_product_price_management.ports;

import dev.price_management_api.zara_product_price_management.models.Price;
import java.time.LocalDateTime;
import java.util.List;

public interface PriceRepository {
    List<Price> findPricesByCriteria(Long productId, Long brandId, LocalDateTime applicationDate);
}
