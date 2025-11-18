package com.lcl.第十一章.代理模式;

import java.io.Serializable;
import java.rmi.RemoteException;

public interface State extends Serializable {
    void insertQuarter();

    void ejectQuarter();

    void turnCrank() throws RemoteException;

    void dispense() throws RemoteException;
}

