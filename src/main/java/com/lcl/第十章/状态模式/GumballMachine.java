package com.lcl.第十章.状态模式;

import lombok.Data;

/**
 * 泡泡机类
 */
@Data
public class GumballMachine {
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;

    private State state;
    private int count = 0;

    public GumballMachine(int numbersGumball) {
        soldState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldOutState = new SoldOutState(this);

        this.count = numbersGumball;
        if (count > 0) {
            state = noQuarterState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count > 0) {
            count--;
        }
    }
}
