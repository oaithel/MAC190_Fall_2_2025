package com.mac190.inheritance;

import com.mac190.circle.Point;

import java.util.Objects;

/*
Because ICircle extends Point, therefore it inherits X, Y, setters and getters
distance, add for point etc, no need to redefine them
 */
public class ICircle extends Point{
 //No need of the center, ICircle is a Point itself
    private double radius;
    //default constructor
    public ICircle(){
        super(); //tis calls the default constructor of Point
        //super if called must be the first call in the constructor before any other
        //instruction
        radius = 0;
    }
    public ICircle(double r){
        super();
        radius = r;
    }

    public ICircle(double a, double b, double c){
        super(a, b);
        radius = c;
    }
    public ICircle(Point p, double c){
        super(p);
        radius = c;
    }
    public Point getCenter() {
        return this;
    }
    public void setCenter(Point center) {
        this.setXY(center.getX(), center.getY());
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public String toString() {
        return "{" + super.toString() + ", " +radius + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ICircle iCircle)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(radius, iCircle.radius) == 0;
    }
    public ICircle add(ICircle C){
        return new ICircle(super.add(C.getCenter()), (this.radius + C.radius)/2.0);
    }
    public static ICircle add(ICircle t, ICircle C){
        return new ICircle(t.getCenter().add(C.getCenter()), (t.radius + C.radius)/2.0);
    }
}