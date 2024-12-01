package dev.price_management_api.zara_product_price_management.models;

import java.util.Objects;

public class Brand {
    private Long id;
    private String name;

    // Constructor
    public Brand(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters and Setters methods
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // equals and hashCode methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Brand brand = (Brand) o;
        return Objects.equals(id, brand.id) &&
                Objects.equals(name, brand.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
