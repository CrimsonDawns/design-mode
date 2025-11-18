package com.lcl.第十一章.代理模式;

import lombok.Data;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * 泡泡机类
 */
public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {

    public void setWinnerState(State winnerState) {
        this.winnerState = winnerState;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setCount(int count) {
        this.count = count;
    }

    String location;
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;

    private State state;
    private int count;

    public GumballMachine(String location, int numbersGumball) throws RemoteException {
        soldState = new SoldState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldOutState = new SoldOutState(this);
        winnerState = new WinnerState(this);
        this.location = location;

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
    public void turnCrank() throws RemoteException {
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

    @Override
    public String getLocation() throws RemoteException {
        return location;
    }

    @Override
    public int getCount() throws RemoteException {
        return count;
    }

    @Override
    public State getState() throws RemoteException {
        return state;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public void setSoldOutState(State soldOutState) {
        this.soldOutState = soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public void setNoQuarterState(State noQuarterState) {
        this.noQuarterState = noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public void setHasQuarterState(State hasQuarterState) {
        this.hasQuarterState = hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public void setSoldState(State soldState) {
        this.soldState = soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }
}
