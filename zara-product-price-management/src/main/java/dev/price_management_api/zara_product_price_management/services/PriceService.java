package dev.price_management_api.zara_product_price_management.services;

import dev.price_management_api.zara_product_price_management.models.Price;
import dev.price_management_api.zara_product_price_management.ports.GetPriceQuery;
import dev.price_management_api.zara_product_price_management.ports.PriceRepository;
import java.time.LocalDateTime;
import java.util.Comparator;

public class PriceService implements GetPriceQuery {
    private final PriceRepository priceRepository;

    public PriceService(PriceRepository priceRepository) {
        this.priceRepository = priceRepository;
    }

    @Override
    public Price getPrice(LocalDateTime applicationDate, Long productId, Long brandId) {
        return priceRepository.findPricesByCriteria(productId, brandId, applicationDate)
                .stream()
                .max(Comparator.comparing(Price::getPriority))
                .orElseThrow(() -> new RuntimeException("Precio no encontrado"));
    }
}
