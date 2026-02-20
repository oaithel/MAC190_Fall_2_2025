package com.mac190.reviewfinal2;

import java.util.Objects;

public class Car extends Transport implements Combinable{
    private double tankSize, milesPerGallon;

    public Car(String b, String m, double ts, double mpg){
        super(b, m);
        setTankSize(ts);
        setMilesPerGallon(mpg);
    }

    public Car(String b, String m){
        super(b, m);
        setTankSize(0);
        setMilesPerGallon(0);
    }
    public Car(Car C){
        super(C.getBrand(), C.getModel());
        setTankSize(C.getTankSize());
        setMilesPerGallon(C.getMilesPerGallon());
    }
    public double getTankSize() {
        return tankSize;
    }
    public void setTankSize(double ankSize) {
        this.tankSize = ankSize;
    }
    public double getMilesPerGallon() {
        return milesPerGallon;
    }

    public void setMilesPerGallon(double milesPerGallon) {
        this.milesPerGallon = milesPerGallon;
    }

    @Override
    public Combinable combine(Combinable other) {
        if(!(other instanceof Car)){
            throw new IllegalArgumentException("Can only Combine cars");
        }
        String mod = this.getModel();
        if(!this.getModel().equals(((Car) other).getModel())){
            mod = "Hybrid";
        }
        String brand = this.getBrand();
        if(!this.getBrand().equals(((Car) other).getBrand())){
            brand = "Hybrid";
        }
        return new Car(brand, mod, this.getTankSize() + ((Car) other).getTankSize(), (this.getMilesPerGallon() + ((Car) other).getMilesPerGallon())/2.0);
    }

    @Override
    public String toString() {
        return "Car{" +
                "tankSize=" + tankSize +
                ", milesPerGallon=" + milesPerGallon +
                "} " + super.toString();
    }

    public boolean equals(Car o) {
        if (this == o) return true;
       if(o == null || !super.equals(o)) return false;
       return Double.compare(tankSize, o.tankSize) == 0 && Double.compare(milesPerGallon, o.milesPerGallon) == 0;
    }

    @Override
    double computeRange() {
        return tankSize * milesPerGallon;
    }
}
