package com.java.design.behavioral.strategy.pattern.display;

import com.java.design.behavioral.strategy.pattern.DisplayStrategy;

public class AmericanoDisplay implements DisplayStrategy {
    @Override
    public void display() {
        System.out.println("아메리카노 머신 입니다.");
    }
}
