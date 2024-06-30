package com.java.design.behavioral.strategy.pattern.brewing;

import com.java.design.behavioral.strategy.pattern.BrewingStrategy;

public class LatteBrewing implements BrewingStrategy {
    @Override
    public void brewing() {
        System.out.println("라뗴를 추출합니다.");
    }
}
