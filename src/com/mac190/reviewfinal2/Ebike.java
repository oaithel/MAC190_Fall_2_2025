package com.mac190.reviewfinal2;

import java.util.Objects;

public class Ebike extends Transport implements Combinable{
    private double battery, efficiency;
    public Ebike(String b, String m, double bat, double ef)throws PowerException{
        super(b, m);
        this.setBattery(bat);
        efficiency = ef;
    }
    public Ebike(String b, String m){
        super(b, m);
        battery = 0;
        efficiency = 0;
    }
    public Ebike(Ebike E){
       this(E.getBrand(), E.getModel());
       try {
           this.setBattery(E.getBattery());
       }catch(PowerException e){
           System.out.println("This should never happen!!!");
       }
       this.setEfficiency(E.getEfficiency());
    }
    public double getBattery() {
        return battery;
    }
    public void setBattery(double battery) throws PowerException{
        if(battery < 0) {
            throw new PowerException("Battery cannot be negative");
        }
        this.battery = battery;
    }

    public double getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(double efficiency) {
        this.efficiency = efficiency;
    }

    @Override
    public String toString() {
        return "Ebike{" +
                "battery=" + battery +
                ", efficiency=" + efficiency +
                "} " + super.toString();
    }

    public boolean equals(Ebike o) {
        if (this == o) return true;
        if(o == null || !super.equals(o)) return false;
        return Double.compare(battery, o.battery) == 0 && Double.compare(efficiency, o.efficiency) == 0;
    }

    @Override
    public Combinable combine(Combinable other) {
        if(!(other instanceof Ebike)){
            throw new IllegalArgumentException("Can only combine Ebikes");
        }
        try {
            return new Ebike("Fusion", "Fusion", battery + ((Ebike) other).battery, (efficiency + ((Ebike) other).efficiency) / 2.0);
        } catch (PowerException e) {
            System.out.println("This should never happen");
            return null;
        }
    }

    @Override
    double computeRange() {
        return battery * efficiency;
    }
}
