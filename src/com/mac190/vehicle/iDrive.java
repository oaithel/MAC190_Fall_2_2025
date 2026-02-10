package com.mac190.vehicle;
/*
An interface is an abstract class where all methods have to be abstract
and no variables are allowed (except static ones).
All methods have to be public
An interface can be used on an object of a class, only if that class
implements the interface.
To make a class implement an interface, we use the word implements
You cannot make an object out of an interface, an interface can also be
inherited
All methods that allow you to drive a car. Make BMW and Tesla implement the interface.
 */
public interface iDrive {

    void turnRight(double degrees);
    void turnLeft(double degrees);
    void brake(); //puts the car into a stop mode.
    boolean speedUp(double speed);
    boolean moveBackwards();
    boolean moveForward();
    String getFuelType();
    double getSpeed();
    State getState();
}
