package com.mac190.midterm;

import java.util.Objects;

public class Device implements Addable{
    private String brand;
    private double batteryLife;

    //default constructor
    public Device(){
        brand = "N/A";
        batteryLife = 0;
    }
    public Device(String b, double btry){
        brand = b;
        batteryLife = btry;
    }
    public Device(String b){
        brand = b;
        batteryLife = 10;
    }
    public Device(Device D){
        brand = D.brand;
        batteryLife = D.batteryLife;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public double getBatteryLife() {
        return batteryLife;
    }
    public void setBatteryLife(double batteryLife) {
        this.batteryLife = batteryLife;
    }
    public double batteryUsagePerHour(){
        return 100/batteryLife;
    }
    @Override
    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", batteryLife=" + batteryLife +
                '}';
    }
    public boolean equals(Device D) {
        if(this == D) return true;
        if (D == null) return false;
        return Double.compare(batteryLife, D.batteryLife) == 0 && brand.equals(D.brand);
    }
    public Device add(Device D){
        String newBrand = this.brand + "-" + D.brand;
        double newBatteryLife = (this.batteryLife + D.batteryLife)/2.0;
        return new Device(newBrand, newBatteryLife);
    }
    public static Device add(Device T, Device D){
        String newBrand = T.brand + "-" + D.brand;
        double newBatteryLife = (T.batteryLife + D.batteryLife)/2.0;
        return new Device(newBrand, newBatteryLife);
    }

    @Override
    public Addable add(Addable o) {
        Device D = (Device) o;
        return this.add(D);
    }
}
