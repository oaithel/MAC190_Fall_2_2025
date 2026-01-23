package com.mac190.midtermreview;

import java.util.Objects;

public class Pyramid {
    private Triangle baseTriangle;
    private double pyramidHeight;
    //default constructor
    public Pyramid(){
        baseTriangle = new Triangle();
        pyramidHeight = 0;
    }
    public Pyramid(double l){
        baseTriangle = new Triangle(l);
        pyramidHeight = Math.abs(l);
    }
    public Pyramid(double a, double b, double c){
        baseTriangle = new Triangle(a, b);
        pyramidHeight = Math.abs(c);
    }
    public Pyramid(Triangle t, double l){
        baseTriangle = new Triangle(t); //copy the triangle t
        pyramidHeight = Math.abs(l);
    }
    public Pyramid(Pyramid p){
        baseTriangle = new Triangle(p.getBaseTriangle()); //copy the triangle t
        pyramidHeight = p.getPyramidHeight();
        //could have done this as well: this(p.getBaseTriangle(), p.getPyramidHight());
    }

    public Triangle getBaseTriangle() {
        return baseTriangle;
    }
    public void setBaseTriangle(Triangle baseTriangle) {
        this.baseTriangle = baseTriangle;
    }
    public double getPyramidHeight() {
        return pyramidHeight;
    }
    public void setPyramidHeight(double pyramidHeight) {
        this.pyramidHeight = Math.abs(pyramidHeight);
    }
    public double getBase(){
        return this.baseTriangle.getBase();
    }
    public void setBase(double b){
        this.baseTriangle.setBase(b);
    }
    public double getHeight(){
        return this.baseTriangle.getHeight();
    }
    public void setHeight(double h){
        this.baseTriangle.setHeight(h);
    }
    public double volume(){
        return (1.0/3.0)*this.getBaseTriangle().area()*this.getPyramidHeight();
    }

    @Override
    public String toString() {
        return "Pyramid{" +
                "baseTriangle=" + baseTriangle +
                ", pyramidHeight=" + pyramidHeight +
                '}';
    }
    public boolean equals(Pyramid o) {
        if (this == o) return true;
        if (o == null) return false;
        return Double.compare(pyramidHeight, o.pyramidHeight) == 0 && Objects.equals(baseTriangle, o.baseTriangle);
    }
    public Pyramid add(Pyramid p){
        return new Pyramid(this.getBaseTriangle().add(p.getBaseTriangle()), (this.pyramidHeight + p.pyramidHeight)/2.0);
    }
    public static Pyramid add(Pyramid s, Pyramid p){
        return new Pyramid(s.getBaseTriangle().add(p.getBaseTriangle()), (s.pyramidHeight + p.pyramidHeight)/2.0);
    }
}
