package com.example.RuleEngineExample.RuleEngineExample.RuleEngine;

public interface RuleI<I, O> {
    boolean matches(I input);
    O process(I input);
}
