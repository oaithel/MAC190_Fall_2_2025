package com.mac190.midtermreview;

import java.util.Objects;

public class Triangle {
    private double base, height;

    //default constructor
    public Triangle(){
        base = height = 0;
    }
    public Triangle(double l){
        this.setBase(l);
        this.setHeight(l);
    }
    public Triangle(double b, double h){
        this.setBase(b);
        this.setHeight(h);
    }
    public Triangle(Triangle T){
        this(T.getBase(), T.getHeight());//this calls the previous constructor
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = Math.abs(height);
    }
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = Math.abs(base);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", height=" + height +
                '}';
    }
    public boolean equals(Triangle tri) {
        if (this == tri) return true;
        if (tri == null) return false;
        return Double.compare(base, tri.base) == 0 && Double.compare(height, tri.height) == 0;
    }
    public double area(){
        return 0.5*height*base;
    }
    public Triangle add(Triangle T){
        return new Triangle(this.base+T.base, (this.height+T.height)/2.0);
    }
    public static Triangle add(Triangle S, Triangle T){
        return new Triangle(S.base+T.base, (S.height+T.height)/2.0);
    }
}
