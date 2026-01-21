package com.mac190.circle;

import java.util.Objects;

/*
Design and implement a class Point that has the following:
- Two double member variables, coordinates X and Y
- Setters/getters for each and setter for both (first for X, second forY)
- Constructors: default, one that takes in one param for both X and Y
and one constructor that accepts two parameter, first for X second for Y
- Copy constructor
- Override toString to return the point as a string in the form (x, y)
- Override equals to compare two Points
- Method double distance(Point p) returns the distance between this point and p
- method Point add(Point p) returns the midpoint between this and p
- implement the previous methods as static (both distance and add)
 */
public class Point {
    private double X, Y;

    //default constructor
    public Point(){
        X = Y = 0;
    }
    public Point(double a){
        this.setXY(a, a);
    }
    public Point(double a, double b){
        this.setXY(a, b);
    }
    //copy constructor
    public Point(Point p){
        this.setXY(p.X, p.Y);
    }
    //getters setters

    public double getX() {
        return X;
    }

    public void setX(double x) {
        X = x;
    }

    public double getY() {
        return Y;
    }

    public void setY(double y) {
        Y = y;
    }
    //setter for X and Y
    public void setXY(double a, double b){
        X = a;
        Y = b;
    }

    @Override
    public String toString() {
        return "(" +X +", " + Y +")";
    }
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(X, point.X) == 0 && Double.compare(Y, point.Y) == 0;
    }

    public Point add(Point p){
        //we have three points: this, p and the return point
        Point result = new Point((this.X + p.X)/2.0, (this.Y + p.Y)/2.0);
        return result;
    }
    //add as a static method
    public static Point add(Point t, Point p){
        //we have three points: this, p and the return point
        Point result = new Point((t.X + p.X)/2.0, (t.Y + p.Y)/2.0);
        return result;
    }
    public double distance (Point p){
        return Math.sqrt(Math.pow(this.X - p.X, 2) + Math.pow(this.Y - p.Y, 2));
    }
    public static double distance (Point t, Point p){
        return Math.sqrt(Math.pow(t.X - p.X, 2) + Math.pow(t.Y - p.Y, 2));
    }

}
