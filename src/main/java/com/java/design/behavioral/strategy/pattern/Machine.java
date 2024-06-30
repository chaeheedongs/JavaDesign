package com.java.design.behavioral.strategy.pattern;

public class Machine {

    private DisplayStrategy displayStrategy;
    private BrewingStrategy brewingStrategy;

    public Machine(DisplayStrategy displayStrategy, BrewingStrategy brewingStrategy) {
        this.displayStrategy = displayStrategy;
        this.brewingStrategy = brewingStrategy;
    }

    public void display() {
        displayStrategy.display();
    }

    public void brewing() {
        brewingStrategy.brewing();
    }

    public void changeMachine(DisplayStrategy displayStrategy, BrewingStrategy brewingStrategy) {
        System.out.println("### >> 커피 머신을 교체 합니다.");
        this.displayStrategy = displayStrategy;
        this.brewingStrategy = brewingStrategy;
    }
}
