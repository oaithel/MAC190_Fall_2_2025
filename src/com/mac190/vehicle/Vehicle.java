package com.mac190.vehicle;

import java.util.Objects;

/*
Design an abstract class Vehicle that has the following:
VIN number,
make (the brand)
fuelType

Methods, you want any derived class to implement the following methods
void turnRight(double degrees);
void turnLeft(double degrees);
void brake(); //puts the car into a stop mode.
boolean speedUp(double speed);
boolean moveBackwards();
boolean moveForward();

 */
abstract class Vehicle {
    private String make, VIN, fuelType;
    protected State carState;//only derived classes can access, and the class itself
    protected double speed;
    public Vehicle(){
        make = "NA";
        VIN = "N/A";
        fuelType = "N/A";
        carState = State.STOP;
        speed = 0;
    }
    public Vehicle(String m, String v, String f){
        make = m;
        VIN = v;
        fuelType = f;
        carState = State.STOP;
        speed = 0;
    }
    public Vehicle(Vehicle v){
        make = v.make;
        VIN = v.VIN;
        fuelType = v.fuelType;
        carState = State.STOP;
        speed = 0;
    }

    public double getSpeed(){
        return speed;
    }
    public State getCarState() {
        return carState;
    }
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getVIN() {
        return VIN;
    }
    public void setVIN(String VIN) {
        this.VIN = VIN;
    }
    public String getFuelType() {
        return fuelType;
    }
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", VIN='" + VIN + '\'' +
                ", fuelType='" + fuelType + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle vehicle)) return false;
        return Objects.equals(make, vehicle.make) && Objects.equals(VIN, vehicle.VIN) && Objects.equals(fuelType, vehicle.fuelType);
    }
    abstract void turnRight(double degrees);
    abstract void turnLeft(double degrees);
    abstract void brake(); //puts the car into a stop mode.
    abstract boolean speedUp(double speed);
    abstract boolean moveBackwards();
    abstract boolean moveForward();
}
