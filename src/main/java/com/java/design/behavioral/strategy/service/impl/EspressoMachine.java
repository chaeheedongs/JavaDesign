package com.java.design.behavioral.strategy.service.impl;

import com.java.design.behavioral.strategy.service.CoffeeMachine;

public class EspressoMachine implements CoffeeMachine {
    @Override
    public void display() {
        System.out.println("에스프레소 머신 입니다.");
    }

    @Override
    public void brewing() {
        System.out.println("에스프레소를 추출 합니다.");
    }
}
