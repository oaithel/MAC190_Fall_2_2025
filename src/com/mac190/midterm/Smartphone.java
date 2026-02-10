package com.mac190.midterm;

import java.util.Objects;

public class Smartphone implements Addable{
    private Device baseDevice;
    private int storage;
    //default constructor
    public Smartphone(){
        baseDevice = new Device();
        storage = 0;
    }
    public Smartphone(Device D, int s){
        baseDevice = new Device(D);
        storage = s;
    }
    public Smartphone(String b, int s){
        baseDevice = new Device(b);
        storage = s;
    }
    public Smartphone(Smartphone S){
        baseDevice = new Device(S.baseDevice);
        storage = S.storage;
    }
    public Device getBaseDevice() {
        return baseDevice;
    }
    public void setBaseDevice(Device baseDevice) {
        this.baseDevice = baseDevice;
    }
    public int getStorage() {
        return storage;
    }
    public void setStorage(int storage) {
        this.storage = storage;
    }
    public String getBrand() {
        return baseDevice.getBrand();
    }
    public void setBrand(String brand) {
        this.baseDevice.setBrand(brand);
    }
    public double getBatteryLife() {
        return baseDevice.getBatteryLife();
    }
    public void setBatteryLife(double batteryLife) {
        this.baseDevice.setBatteryLife(batteryLife);
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "baseDevice=" + baseDevice +
                ", storage=" + storage +
                '}';
    }

    public boolean equals(Smartphone S) {
        if(this == S) return true;
        if (S == null) return false;
        return storage == S.storage && baseDevice.equals(S.baseDevice);
    }
    public Smartphone add(Smartphone S){
        Device newDevice = this.getBaseDevice().add(S.getBaseDevice());
        int st = (this.getStorage() + S.getStorage())/2;
        return new Smartphone(newDevice, st);
    }
    public static Smartphone add(Smartphone T, Smartphone S){
        Device newDevice = T.getBaseDevice().add(S.getBaseDevice());
        int st = (T.getStorage() + S.getStorage())/2;
        return new Smartphone(newDevice, st);
    }

    @Override
    public Addable add(Addable o) {
        Smartphone S = (Smartphone) o;
        return this.add(S);
    }
}
