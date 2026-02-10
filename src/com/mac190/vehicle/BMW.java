package com.mac190.vehicle;

import java.util.Objects;

/*
Design a class BMW, that is a Vehicle, in adition it has the following:
FuelType is gas
Make is "BMW"
Model (example "X6")
It has a Color and number of seats as well.

Implement the methods as follows:
turnLeft, just display turning left the degree amount
same for turn right
Brake implement it so that if the car is not in stop mode, put it in stop mode
moveForward implement it so that the car moves forward (initial speed 10m/h) only if it was in stopping state already
Same for moveBackwards
implement speedUp to increase the speed by the input.
and display the speed, limit the speed to 100miles/hour
speedUp only increases the speed if it is movingForward.

Test your class.

Modify the class so that it throws a checked exception if the speed is about to go above 100.
Modify the tester to catch the exception.

 */

public class BMW extends Vehicle implements iDrive{
    private String model, color;
    private int seats;

    public BMW(){
       super("BMW", "N/A", "Gas");
       model = "N/A";
       color = "N/A";
       seats = 0;
    }
    public BMW(String v, String m, String c, int s){
        super("BMW", v, "Gas");
        model = m;
        color = c;
        seats = s;
    }
    public BMW(BMW B){
        super(B);
        model = B.model;
        color = B.color;
        seats = B.seats;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getSeats() {
        return seats;
    }
    public void setSeats(int seats) {
        this.seats = seats;
    }
    @Override
    public String toString() {
        return "BMW{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", seats=" + seats +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BMW bmw)) return false;
        if (!super.equals(o)) return false;
        return seats == bmw.seats && Objects.equals(model, bmw.model) && Objects.equals(color, bmw.color);
    }

    @Override
    public void turnRight(double degrees) {
        System.out.println("Turning right " + degrees + " degrees");
    }
    @Override
    public void turnLeft(double degrees) {
        System.out.println("Turning left " + degrees + " degrees");
    }
    @Override
    public void brake() {
        if(carState != State.STOP){
            carState = State.STOP;
            this.speed = 0;
        }else{
            System.out.println("The car is already stopped!");
        }
    }
    @Override
    public boolean speedUp(double sp) {
        if(carState == State.MOVINGFORWAD){
            this.speed = Math.min(this.speed + sp, 100);
            System.out.println("We are moving at: " + this.speed + " m/h");
            return true;
        }else{
            System.out.println("Can't speed up");
            return false;
        }
    }

    @Override
    public boolean moveBackwards() {
        if(carState != State.STOP){
            if(carState == State.MOVINGBACKWARD){
                System.out.println("Already moving backwards");
                return true;
            }else {
                System.out.println("Cannot go baclwards");
                return false;
            }
        }else{
            System.out.println("Going backwards, be careful");
            carState = State.MOVINGBACKWARD;
            speed = 10;
            return true;
        }
    }

    //When no access specifier is specified, the method is public within
    //the package but private for others.
    @Override
    public boolean moveForward() {
        if(carState != State.STOP){
            if(carState == State.MOVINGFORWAD){
                System.out.println("We are already moving forward");
                return true;
            }else {
                System.out.println("Cannot move forward");
                return false;
            }
        }else{
            System.out.println("Moving forward");
            carState = State.MOVINGFORWAD;
            speed = 10;
            return true;
        }
    }

    @Override
    public State getState() {
        return getCarState();
    }
}
