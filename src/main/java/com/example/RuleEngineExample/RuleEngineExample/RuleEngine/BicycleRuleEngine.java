package com.example.RuleEngineExample.RuleEngineExample.RuleEngine;

import com.example.RuleEngineExample.RuleEngineExample.Entity.Bicycle;

import java.util.ArrayList;
import java.util.List;

public class BicycleRuleEngine {

    List<RuleI<Bicycle, Bicycle>> ruleIList;

    public BicycleRuleEngine() {
        ruleIList = new ArrayList<>();
    }

    public Bicycle rule(Bicycle bicycle) {
        return ruleIList.stream()
                .filter(ruleI -> ruleI.matches(bicycle))
                .map(ruleI -> ruleI.process(bicycle))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No Matching rule found"));
    }

    public BicycleRuleEngine registerBicycleRuleEngine(RuleI<Bicycle, Bicycle> ruleI) {
        ruleIList.add(ruleI);
        return this;
    }
}
