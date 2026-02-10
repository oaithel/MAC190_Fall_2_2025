package com.mac190.stocks;
/*
 * Design a class Robinhood to be a Broker. Implement the methods buy and sell so that
 * only stocks can be bought and add $1 fees for the entire purchase
 * If not stock should display an error message.
 *
 */
public class Robinhood extends Broker implements iBroker{
    @Override
    public void buy(String t, String type, int s, float p) {
        //if type is not "STK" or "stk", display "Can only buy Stocks" and return

        //check if the ticket t already exists in holdings, if it does
        //compute the new price as (oldPrice*oldNumberShares + (p*s+ fees))/(oldNumbershares + s)
        //update number shares and new price
        //if t does not exist already
        //create a new Security with t, type and s and the price as (p*s+fees)/s
        //add the security to the list of holdings.

    }

    @Override
    public double sell(String t, String type, int s, float p) {
        //if type is not "STK" throw and exception wrong type

        //check if t exists in the list of holdings, if it doesn't then display
        //"cannot sell what you don't have"
        //if it does exist, then
        //if s is larger than the number of shares in the list, then display a message
        //Trying to sell more than what you have. So closing position.
        //compute the proceedings as number of share in the list* p.
        //remove the security from the list and return the proceedings
        //if you are trying to sell less than you have, then
        //compute the proceedings as s*p.
        //subtract s from the number of share in the security in the list
        //return proceedings.

        return 0;
    }
}