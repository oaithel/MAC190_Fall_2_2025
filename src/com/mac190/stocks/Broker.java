package com.mac190.stocks;

import java.util.ArrayList;

/*
 * Design an abstract class Broker that has the following:
 // A list of securities.See Security class
 * abstract method buy that accepts all the required parameters
 * abstract class sell that requires as well all parameters.
 */
abstract class Broker {
    //A list of securities
    private ArrayList<Security> holdings;

    public Broker() {
        //create the holding list
        holdings = new ArrayList<Security>();
    }

    public ArrayList<Security> getHoldings() {
        return holdings;
    }

    public String toString() {
        return holdings.toString();
    }

    abstract void buy(String t, String type, int s, float p);
    abstract double sell(String t, String type, int s, float p);
}