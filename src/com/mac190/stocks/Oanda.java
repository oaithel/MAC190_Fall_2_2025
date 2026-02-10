package com.mac190.stocks;
/*
 * Design a class Oanda to be a Broker. Implement the methods buy and sell so that
 * only currencies can be bought and add $2.5 as fees.
 * If not currency should display an error message.
 *
 */

public class Oanda extends Broker implements iBroker {

    //Exactly same code as in RobinHood exception is the type and the fees.
    @Override
    public void buy(String t, String type, int s, float p) {

    }

    @Override
    public double sell(String t, String type, int s, float p) {
        return 0;
    }
}