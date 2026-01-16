package com.mac190.even;
/*
Design a class Even that has the following properties:
- one integer member variable even that is even at all times.
- a getter
- a setter that sets even to an input if the input is even otherwise
it sets it to the next even number
- getter for even
- method print() that prints the value of even in the form "even = value"
- method boolean equals (Even e) returns true if the object e is same as this object
and false if not.
- method Even add(int a) that returns an object Even that is the sum of even
in this object and a
-
 */
public class Even {
    private int even;
    //A constructor is a method with same name as the class without type.
    //it is used to construct object with initial attributes.
    //it has to be public. and you can have as many constructors as you wish
    //as long as they have different parameters.
    //the constructor that has no parameter us called the default constructor.
    public Even(){
        even = 0;
    }
    public Even(int a){
        this.setEven(a);
    }
    //getter
    public int getEven(){
        return even;
    }
    //setter
    public void setEven(int e){
        if(e%2 == 0){
            this.even = e;
        }else{
            this.even = e+1;
        }
    }
    public void print(){
        System.out.println("even: " + even);
    }
    public String toString(){
        return "even: " + even;
    }
    public boolean equals(Even e){
        //How many objects are there here? There are two objects
        //this and e. Both have even attribute, compare them
        if(this.even == e.even){
            return true;
        }else{
            return false;
        }
    }
    //design a method that returns the sum of two Even objects
    //without changing either one.
    public Even add(Even e){
        //How many Even objects are there in total?
        //There will be three objects: e, this, and the returned object
        //A third object is created because e and this should not be modified.
        Even sum = new Even();
        sum.setEven(e.even + this.even);
        return sum;
    }
    //Overloading is having the same method with different parameters. It is allowed
    //as long as you don't differentiate solely based on the return value. Either the
    //type of input parameters are not same or the number of input parameters is not
    //the same.
    // public int add(Even e) is not allowed because the difference fro the previous
    //method is only the return type.
    public Even add(int a){
        //How many Even objects are there in total?
        //There will be three objects: e, this, and the returned object
        //A third object is created because e and this should not be modified.
        Even sum = new Even();
        sum.setEven(a + this.even);
        return sum;
    }

}
