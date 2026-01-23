package com.mac190.midtermreview;

import java.util.Objects;

public class Rectangle {
    private double length, width;
    //default constructor
    public Rectangle(){
        length = width = 0;
    }
    public Rectangle(double l){
        this.setWidth(l);
        this.setLength(l);
    }
    public Rectangle(double l, double w){
        this.setWidth(w);
        this.setLength(l);
    }
    //copy constructor
    public Rectangle(Rectangle R){
        this.setWidth(R.getWidth());
        this.setLength(R.getLength());
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = Math.abs(length);
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = Math.abs(width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(length, rectangle.length) == 0 && Double.compare(width, rectangle.width) == 0;
    }
    //IF I was asked to implement the equals method with Rectangle object as input
    //then this the way
    public boolean equals(Rectangle o) {
        if (this == o) return true; //every object equals itself
        if (o == null ) return false;
        return Double.compare(length, o.length) == 0 && Double.compare(width, o.width) == 0;
    }
    public Rectangle add(Rectangle R){
        //we have three rectangles in total: this and R as inputs
        //used to create a third Rectangle to be returned.
        return new Rectangle(this.length+R.length, this.width+R.width);
    }
    public static Rectangle add(Rectangle S, Rectangle R){
        //we have three rectangle objects in total: S and R as inputs
        //used to create a third Rectangle to be returned.
        return new Rectangle(S.length+R.length, S.width+R.width);
    }
    public double perim(){
        return 2*(length+width);
    }
    public double area(){
        return length*width;
    }
}
