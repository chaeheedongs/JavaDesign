package com.java.design.behavioral.strategy;

import com.java.design.behavioral.strategy.pattern.Machine;
import com.java.design.behavioral.strategy.pattern.brewing.AmericanoBrewing;
import com.java.design.behavioral.strategy.pattern.brewing.EspressoBrewing;
import com.java.design.behavioral.strategy.pattern.brewing.LatteBrewing;
import com.java.design.behavioral.strategy.pattern.display.AmericanoDisplay;
import com.java.design.behavioral.strategy.pattern.display.EspressoDisplay;
import com.java.design.behavioral.strategy.pattern.display.LatteDisplay;
import com.java.design.behavioral.strategy.service.CoffeeMachine;
import com.java.design.behavioral.strategy.service.impl.AmericanoMachine;
import com.java.design.behavioral.strategy.service.impl.EspressoMachine;
import com.java.design.behavioral.strategy.service.impl.LatteMachine;

public class CoffeeMachineStrategyMain {

    public static void main(String[] args) {

        noStrategyPattern();
        strategyPattern();
        changeStrategyPattern();
    }

    private static void noStrategyPattern() {
        System.out.println();
        System.out.println("### >> 전략패턴 적용 전 방식");
        System.out.println("----------------------------");

        CoffeeMachine espressoMachine = new EspressoMachine();
        espressoMachine.display();
        espressoMachine.brewing();
        System.out.println();

        CoffeeMachine americanoMachine = new AmericanoMachine();
        americanoMachine.display();
        americanoMachine.brewing();
        System.out.println();

        CoffeeMachine latteMachine = new LatteMachine();
        latteMachine.display();
        latteMachine.brewing();

        System.out.println("----------------------------");
        System.out.println();
    }

    private static void strategyPattern() {
        System.out.println();
        System.out.println("### >> 전략패턴 적용 후 방식");
        System.out.println("----------------------------");
        Machine espressoMachine = new Machine(new EspressoDisplay(), new EspressoBrewing());
        espressoMachine.display();
        espressoMachine.brewing();
        System.out.println();

        Machine americanoMachine = new Machine(new AmericanoDisplay(), new AmericanoBrewing());
        americanoMachine.display();
        americanoMachine.brewing();
        System.out.println();

        Machine latteMachine = new Machine(new LatteDisplay(), new LatteBrewing());
        latteMachine.display();
        latteMachine.brewing();
        System.out.println("----------------------------");
        System.out.println();
    }

    private static void changeStrategyPattern() {
        System.out.println();
        System.out.println("### >> 전략패턴 변경 방식");
        System.out.println("----------------------------");
        Machine machine = new Machine(new EspressoDisplay(), new EspressoBrewing());
        machine.display();
        machine.brewing();
        System.out.println();

        machine.changeMachine(new AmericanoDisplay(), new AmericanoBrewing());
        machine.display();
        machine.brewing();
        System.out.println();

        machine.changeMachine(new LatteDisplay(), new LatteBrewing());
        machine.display();
        machine.brewing();
        System.out.println("----------------------------");
        System.out.println();
    }
}
