package com.java.design.behavioral.strategy.pattern.display;

import com.java.design.behavioral.strategy.pattern.DisplayStrategy;

public class LatteDisplay implements DisplayStrategy {
    @Override
    public void display() {
        System.out.println("라떼 머신 입니다.");
    }
}
