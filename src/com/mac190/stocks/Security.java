package com.mac190.stocks;

public class Security {
    private String ticker; //"AAPL"
    private String type; //"STK" or "CUR"
    private int shares;
    private float price;

    public Security(String ticker, String type, int nShares, float price){
        this.ticker = ticker;
        this.type = type;
        shares = nShares;
        this.price = price;
    }

    public String getTicker() {
        return ticker;
    }

    public String getType() {
        return type;
    }

    public int getShares() {
        return shares;
    }

    public float getPrice() {
        return price;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setShares(int shares) {
        this.shares = shares;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    public String toString(){
        return "ticker: " + ticker + " type: " + this.type + " num shares: " + this.shares + " price: " + this.price;
    }
}