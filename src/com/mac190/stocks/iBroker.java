package com.mac190.stocks;

import java.util.ArrayList;

/*
 * Design and interface that has only two methods: buy and sell.
 */
public interface iBroker {
    ArrayList<Security> getHoldings();
    void buy(String t, String type, int s, float p);
    double sell(String t, String type, int s, float p);
}