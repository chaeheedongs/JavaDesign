package com.java.design.behavioral.strategy.service.impl;

import com.java.design.behavioral.strategy.service.CoffeeMachine;

public class AmericanoMachine implements CoffeeMachine {
    @Override
    public void display() {
        System.out.println("아메리카노 머신 입니다.");
    }

    @Override
    public void brewing() {
        System.out.println("아메리카노를 추출 합니다.");
    }
}
