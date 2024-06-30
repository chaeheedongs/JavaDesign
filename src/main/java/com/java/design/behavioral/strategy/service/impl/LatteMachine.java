package com.java.design.behavioral.strategy.service.impl;

import com.java.design.behavioral.strategy.service.CoffeeMachine;

public class LatteMachine implements CoffeeMachine {
    @Override
    public void display() {
        System.out.println("라떼 머신 입니다.");
    }

    @Override
    public void brewing() {
        System.out.println("라떼를 추출 합니다.");
    }
}
