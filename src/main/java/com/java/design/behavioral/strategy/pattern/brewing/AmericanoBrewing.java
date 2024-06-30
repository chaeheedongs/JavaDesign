package com.java.design.behavioral.strategy.pattern.brewing;

import com.java.design.behavioral.strategy.pattern.BrewingStrategy;

public class AmericanoBrewing implements BrewingStrategy {
    @Override
    public void brewing() {
        System.out.println("아메리카노를 추출 합니다.");
    }
}
