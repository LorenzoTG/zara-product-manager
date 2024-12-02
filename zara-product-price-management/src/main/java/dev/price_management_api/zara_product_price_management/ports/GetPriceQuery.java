package dev.price_management_api.zara_product_price_management.ports;

import dev.price_management_api.zara_product_price_management.models.Price;
import java.time.LocalDateTime;

public interface GetPriceQuery {
    Price getPrice(LocalDateTime applicationDate, Long productId, Long brandId);
}
