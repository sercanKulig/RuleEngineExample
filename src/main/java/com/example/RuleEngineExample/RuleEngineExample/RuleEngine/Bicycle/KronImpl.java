package com.example.RuleEngineExample.RuleEngineExample.RuleEngine.Bicycle;

import com.example.RuleEngineExample.RuleEngineExample.Entity.Bicycle;
import com.example.RuleEngineExample.RuleEngineExample.Enum.Brand;
import com.example.RuleEngineExample.RuleEngineExample.Enum.Category;
import com.example.RuleEngineExample.RuleEngineExample.RuleEngine.RuleI;

public class KronImpl implements RuleI<Bicycle, Bicycle> {
    @Override
    public boolean matches(Bicycle input) {
        return input.getBrand().equals(Brand.Kron);
    }

    @Override
    public Bicycle process(Bicycle input) {
        input.setCategory(Category.Bicycle);
        input.setBrand(Brand.Kron);
        return input;
    }
}
