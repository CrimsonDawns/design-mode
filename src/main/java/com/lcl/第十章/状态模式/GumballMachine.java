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
    private int count;

    public GumballMachine(int numbersGumball) {
        soldState = new SoldState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldOutState = new SoldOutState(this);
        winnerState = new WinnerState(this);

        this.count = numbersGumball;
        if (count > 0) {
            state = noQuarterState;
        }
    }

    //投入25分硬币
    public void insertQuarter() {
        state.insertQuarter();
    }

    //退出25分硬币
    public void ejectQuarter() {
        state.ejectQuarter();
    }

    //转动把柄
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    //释放球
    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count > 0) {
            count = count - 1;
        }
    }

    public void refill(int number) {
        this.count = number;
        state = noQuarterState;
    }

    @Override
    public String toString() {
        return "GumballMachine{" +
                "count=" + count +
                '}';
    }
}
