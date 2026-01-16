package com.mac190.Temperature;

public class Temperature {
    private double temperature;
    /*
    Almost always declare your member variables as private and only the class itself
    has direct access. But outise code should be able to read and write(modify) attributes
    of objects. For that we provide methods that allow the outside to read and change
    values of those variables. The method that allows to read a values of private
    member is called an accessor (usually called getter) and the method that allows
    to change the value is called a mutator (usually we call it setter).
    setters and getters have to be public obviously
    we define a getter as follows:
    public type getVariableName(){
           return variableName;
    }
    We define a setter as
    public void setVariableName(typeOfVariable input){
            variableName = input;
    }
     */
    //getter
    public double getTemperature(){
        return this.temperature;
    }
    //setter
    public void setTemperature(double temp){
        this.temperature = temp;
    }
    public void toCelcius(){
        double celcius = (temperature - 32)*(5.0/9.0);
        System.out.println(temperature + " in fahrenheit is " + celcius + " in celcius");
    }
    public void toFahrenheit(){
        double fah = (temperature*(9.0/5.0) + 32);
        System.out.println(temperature + " in celcius is " + fah + " in fahrenheit");
    }

}
