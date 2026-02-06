package com.mac190.cube;

import com.mac190.midtermreview.Rectangle;

import java.util.Objects;

//Modify Cube class to implement it using inheritance. Every Cube is a Rectangle.
// with height
public class ICube extends Rectangle{
    private double height;
    //default constructor
    public ICube(){
        super();
        height = 0;
    }
    public ICube(double l){
        super(l);
        height = Math.abs(l);
    }
    public ICube(double w, double l, double h){
        super(w, l);
        height = Math.abs(h);
    }
    public ICube(Rectangle R, double h){
        super(R);
        height = Math.abs(h);
    }
    public ICube(ICube C){
        super(C.getBase());
        height = Math.abs(C.getHeight());
    }

    public Rectangle getBase() {
        return this;
    }
    public void setBase(Rectangle base) {
        this.setLength(base.getLength());
        this.setWidth(base.getWidth());
    }
    public double getHeight() {
        return Math.abs(height);
    }
    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public String toString() {
        return "ICube{" +
                "base=" + super.toString() +
                ", height=" + height +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof ICube)) return false;
        ICube cube = (ICube) o;
        return Double.compare(height, cube.height) == 0 && this.getBase().equals(cube.getBase());
    }
    public ICube add(ICube C){
        return new ICube(super.add(C.getBase()), this.height + C.height);
        //Using the static method in Rectangle to add the two bases, like this
        // return new Cube(Rectangle.add(this.base, C.base), this.height + C.height);
    }
    public static ICube add(ICube T, ICube C){
        return new ICube(T.getBase().add(C.getBase()), T.height + C.height);
        //Using the static method in Rectangle to add the two bases, like this
        // return new Cube(Rectangle.add(T.base, C.base), T.height + C.height);
    }
    public double area(){
        return 2*(super.area()+this.height*this.getWidth() + this.height*this.getLength());
    }
    public double perim(){
        return 2*(super.perim()+(2*this.height+this.getLength())+ 2*(this.height+this.getWidth()));
    }
}