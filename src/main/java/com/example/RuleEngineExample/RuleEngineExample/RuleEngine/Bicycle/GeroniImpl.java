package com.example.RuleEngineExample.RuleEngineExample.RuleEngine.Bicycle;

import com.example.RuleEngineExample.RuleEngineExample.Entity.Bicycle;
import com.example.RuleEngineExample.RuleEngineExample.Enum.Brand;
import com.example.RuleEngineExample.RuleEngineExample.Enum.Category;
import com.example.RuleEngineExample.RuleEngineExample.RuleEngine.RuleI;

public class GeroniImpl implements RuleI<Bicycle, Bicycle> {
    @Override
    public boolean matches(Bicycle input) {
        return input.getBrand().equals(Brand.Geroni);
    }

    @Override
    public Bicycle process(Bicycle input) {
        input.setCategory(Category.Bicycle);
        input.setBrand(Brand.Geroni);
        return input;
    }
}
