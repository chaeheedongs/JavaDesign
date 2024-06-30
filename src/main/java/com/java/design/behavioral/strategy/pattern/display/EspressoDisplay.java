package com.java.design.behavioral.strategy.pattern.display;

import com.java.design.behavioral.strategy.pattern.DisplayStrategy;

public class EspressoDisplay implements DisplayStrategy {
    @Override
    public void display() {
        System.out.println("에스프레소 머신 입니다.");
    }
}
