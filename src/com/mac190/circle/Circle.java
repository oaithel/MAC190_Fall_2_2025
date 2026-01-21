package com.mac190.circle;

import java.util.Objects;

/*
Design a class Circle that has the following:
- A Point object center as a member variable
- a double member variable for radius
- setters getters
- default constructor, center to default point and redius to 0
- Constructor that accepts one double, sets center to default point and rediius to input
- Constructor that accepts three doubles, the first two for the center and the last
for radius.
- Constructor that accepts a Point and a double, the point for center and the double
for radius.
- toString to return the Circle in the form {(x, y), radius}
- equals to compare two Circle objects.
- Method Circle add(Circle c), returns a new Circle object with the midpoint betweeb
the two centers as the center and the average radii as the radius.
- implement the method add above as a static method
- Test both class extensively. Use all methods with appropriate parameters.
 */
public class Circle {
    private Point center;
    private double radius;

    //default constructor
    public Circle(){
        center = new Point();
        radius = 0;
    }
    public Circle(double r){
        center = new Point();
        radius = r;
    }

    public Circle(double a, double b, double c){
        center = new Point(a, b);
        radius = c;
    }
    public Circle(Point p, double c){
        center = new Point(p);
        radius = c;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setX(double a){
        center.setX(a);
    }
    public void setY(double a){
        center.setY(a);
    }
    public double getX(){
        return center.getX();
    }
    public double getY(){
        return center.getY();
    }

    @Override
    public String toString() {
        return "{" + center.toString() + ", " +radius + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(this.radius, circle.radius) == 0 && this.center.equals(circle.center);
    }
    public Circle add(Circle C){
        return new Circle(this.center.add(C.center), (this.radius + C.radius)/2.0);
    }
    public static Circle add(Circle t, Circle C){
        return new Circle(t.center.add(C.center), (t.radius + C.radius)/2.0);
    }
}
