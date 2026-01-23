package com.mac190.midtermreview;

import java.util.Objects;

public class Cube {
    private Rectangle base;
    private double height;
    //default constructor
    public Cube(){
        base = new Rectangle();
        height = 0;
    }
    public Cube(double l){
        base = new Rectangle(l);
        height = Math.abs(l);
    }
    public Cube(double w, double l, double h){
        base = new Rectangle(w, l);
        height = Math.abs(h);
    }
    public Cube(Rectangle R, double h){
        base = new Rectangle(R);
        height = Math.abs(h);
    }
    public Cube(Cube C){
        base = new Rectangle(C.getBase());
        height = Math.abs(C.getHeight());
    }

    public Rectangle getBase() {
        return base;
    }
    public void setBase(Rectangle base) {
        this.base = base;
    }
    public double getHeight() {
        return Math.abs(height);
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getLenght(){
        return this.base.getLength();
    }
    public void setLength(double l){
        this.base.setLength(l);
    }
    public double getWidth(){
        return this.base.getWidth();
    }
    public void setWidth(double l){
        this.base.setWidth(l);
    }

    @Override
    public String toString() {
        return "Cube{" +
                "base=" + base.toString() +
                ", height=" + height +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cube cube = (Cube) o;
        return Double.compare(height, cube.height) == 0 && Objects.equals(base, cube.base);
    }
    public Cube add(Cube C){
        return new Cube(this.base.add(C.base), this.height + C.height);
        //Using the static method in Rectangle to add the two bases, like this
        // return new Cube(Rectangle.add(this.base, C.base), this.height + C.height);
    }
    public static Cube add(Cube T, Cube C){
        return new Cube(T.base.add(C.base), T.height + C.height);
        //Using the static method in Rectangle to add the two bases, like this
        // return new Cube(Rectangle.add(T.base, C.base), T.height + C.height);
    }
    public double area(){
        return 2*(this.base.area()+this.height*this.getWidth() + this.height*this.getLenght());
    }
    public double perim(){
        return 2*(this.base.perim()+(2*this.height+this.getLenght())+ 2*(this.height+this.getWidth()));
    }
}
