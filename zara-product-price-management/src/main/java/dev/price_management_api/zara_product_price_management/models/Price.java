package dev.price_management_api.zara_product_price_management.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

public class Price {
    private Long id;
    private Long brandId;
    private Long productId;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Integer priority;
    private BigDecimal price;
    private String currency;

    // Constructor
    public Price(Long id, Long brandId, Long productId, LocalDateTime startDate, LocalDateTime endDate, Integer priority, BigDecimal price, String currency) {
        this.id = id;
        this.brandId = brandId;
        this.productId = productId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.priority = priority;
        this.price = price;
        this.currency = currency;
    }

    // Getters and Setters methods
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    // equals and hashCode methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Price price1 = (Price) o;
        return Objects.equals(id, price1.id) &&
                Objects.equals(brandId, price1.brandId) &&
                Objects.equals(productId, price1.productId) &&
                Objects.equals(startDate, price1.startDate) &&
                Objects.equals(endDate, price1.endDate) &&
                Objects.equals(priority, price1.priority) &&
                Objects.equals(price, price1.price) &&
                Objects.equals(currency, price1.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brandId, productId, startDate, endDate, priority, price, currency);
    }
}
