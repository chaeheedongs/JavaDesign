package com.java.design.behavioral.strategy.pattern.brewing;

import com.java.design.behavioral.strategy.pattern.BrewingStrategy;

public class EspressoBrewing implements BrewingStrategy {
    @Override
    public void brewing() {
        System.out.println("에스프레소를 추출 합니다.");
    }
}
