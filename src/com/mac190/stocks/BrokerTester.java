package com.mac190.stocks;

import java.util.Locale;
import java.util.Scanner;

public class BrokerTester {
    public static void main(String[] args) {
        Broker stockbroker = new Robinhood();
        Broker currencybroker = new Oanda();
        Scanner sc = new Scanner(System.in);
        String choice = "";
        do {
            System.out.println("What would you like to buy?");
            System.out.println("Currency or Stock?");
            choice = sc.next().toLowerCase(Locale.ROOT);
            if (choice.contains("stock")) {
                System.out.println("What's the ticker of your stock: ");
                String ticker = sc.next();
                System.out.println("How many shares would you like: ");
                int shares = sc.nextInt();
                System.out.println("How much are you paying: ");
                float price  = sc.nextFloat();
                stockbroker.buy(ticker,"STK",shares,price);
            }
            if (choice.contains("currency")) {
                System.out.println("What currency would you like to buy: ");
                String ticker = sc.next();
                System.out.println("How many shares would you like: ");
                int shares = sc.nextInt();
                System.out.println("How much are you paying: ");
                float price  = sc.nextFloat();
                currencybroker.buy(ticker,"CUR",shares,price);
            }
            System.out.println("Stock Holdings: " + stockbroker.getHoldings().toString() + "\nCurrency Holdings: "+ currencybroker.getHoldings().toString());
        } while (!choice.contains("quit"));
    }
}