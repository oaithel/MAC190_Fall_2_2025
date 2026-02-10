package com.mac190.midterm;
//Implement the class Smartphone using inheritance.
public class ISmartphone extends Device implements Addable{
    private int storage;
    //default constructor
    public ISmartphone(){
        super();
        storage = 0;
    }
    public ISmartphone(Device D, int s){
        super(D);
        storage = s;
    }
    public ISmartphone(String b, int s){
        super(b);
        storage = s;
    }
    public ISmartphone(ISmartphone S){
        super(S);
        storage = S.storage;
    }
    public Device getBaseDevice() {
        return this;
    }
    public void setBaseDevice(Device baseDevice) {
        this.setBrand(baseDevice.getBrand());
        this.setBatteryLife(baseDevice.getBatteryLife());
    }
    public int getStorage() {
        return storage;
    }
    public void setStorage(int storage) {
        this.storage = storage;
    }
   //No need to redefine setBrand, etBatteryLife and the getters
    //we inherit tem from Device

    @Override
    public String toString() {
        return "Smartphone{" +
                "baseDevice=" + super.toString() +
                ", storage=" + storage +
                '}';
    }

    public boolean equals(ISmartphone S) {
        if(this == S) return true;
        if (S == null) return false;
        return storage == S.storage && super.equals(S.getBaseDevice());
    }
    public ISmartphone add(ISmartphone S){
        Device newDevice = this.getBaseDevice().add(S.getBaseDevice());
        int st = (this.getStorage() + S.getStorage())/2;
        return new ISmartphone(newDevice, st);
    }
    public static ISmartphone add(ISmartphone T, ISmartphone S){
        Device newDevice = T.getBaseDevice().add(S.getBaseDevice());
        int st = (T.getStorage() + S.getStorage())/2;
        return new ISmartphone(newDevice, st);
    }

    @Override
    public Addable add(Addable o){
        ISmartphone S = (ISmartphone) o;
        return this.add(S);
    }
}
