package dev.price_management_api.zara_product_price_management.usecases;

import dev.price_management_api.zara_product_price_management.models.Price;
import dev.price_management_api.zara_product_price_management.ports.GetPriceQuery;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class GetPriceUseCase {
    private final GetPriceQuery getPriceQuery;

    public GetPriceUseCase(GetPriceQuery getPriceQuery) {
        this.getPriceQuery = getPriceQuery;
    }

    public Price execute(LocalDateTime applicationDate, Long productId, Long brandId) {
        return getPriceQuery.getPrice(applicationDate, productId, brandId);
    }
}
