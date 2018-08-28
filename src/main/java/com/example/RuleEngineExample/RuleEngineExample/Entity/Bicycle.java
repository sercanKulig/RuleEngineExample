package com.example.RuleEngineExample.RuleEngineExample.Entity;

import com.example.RuleEngineExample.RuleEngineExample.Enum.Brand;
import com.example.RuleEngineExample.RuleEngineExample.Enum.Category;
import com.example.RuleEngineExample.RuleEngineExample.Enum.Type;

public class Bicycle {
    private Category category;
    private Type type;
    private Brand brand;

    public Bicycle(Type type, Brand brand) {
        this.type = type;
        this.brand = brand;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "category=" + category +
                ", type=" + type +
                ", brand=" + brand +
                '}';
    }
}
