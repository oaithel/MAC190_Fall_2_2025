package com.mac190.minmax;

import java.util.Objects;

/*
Design and implement a class MinMax that has the follwing properties:
1- Two integer member variables min and max where min should always be smaller or equal to max.
2- A default construtor that sets both to 0
3- A constructor that accepts one integer and sets both to that value
4- A constructor that accepts two integers and sets min the the smallest and max to the largest
5-getters
6- setters. Be carefull if you try to set min to a value larger than max, then min should be set to max and max
to the new value. Example. min = 2, max = 5 and you try to set min to 8, then min will be 5 and max 8
Same for max: if you try to set max to a value that is smaller than min, then max is set to min and min to the new value
7- Overrride toString and equals
8 - method MinMax add(int a) that returns a MinMax object where both min and max are added a
9- method MinMax add(MinMax m) that returns a MinMax object where min is added the min of m
and max ia added the max of m
10- method MinMax multiply(int a) that returns a MinMax object where max and in are multiplied by a.
Careful multiplying by negative number may change who is large and small.
- In a Tester class Test your class and use every method defined in MinMax, with appropriate
values of your choice so that everyone has something different.
 */
public class MinMax {
    private int min, max;

    //default constructor
    public MinMax(){
        this.min = this.max = 0;
    }
    public MinMax(int a){
       this.setMinMax(a);
    }
    public MinMax(int a, int b){
        this.setMinMax(a, b);
    }
    //Copy constructor, copies an object into the new one
    public MinMax(MinMax m){
        this.setMinMax(m.min, m.max);
    }
    //getters
    public int getMin(){
        return min;
    }
    public int getMax(){
        return max;
    }
    //setters
    public void setMinMax(int a){
        this.min = this.max = a;
    }
    //overloading setMinMax
    public void setMinMax(int a, int b){
        if(a < b){
            min = a;
            max = b;
        }else{
            min = b;
            max = a;
        }
    }
    public void setMin(int a){
        if(a > max){
            min = max;
            max = a;
        }else{
            min = a;
        }
    }
    public void setMax(int a){
        if(a < min){
            max = min;
            min = a;
        }else{
            max = a;
        }
    }
    @Override
    public String toString() {
        return "(" + min +", " + max + ")";
    }

    public boolean equals(MinMax m){
        return (this.min == m.min && this.max == m.max);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) return false;
        MinMax minMax = (MinMax) o;//casting
        return (min == minMax.min && max == minMax.max);
    }
    //This add method is a member if the class, it can be invoked only on an object
    //thus this.
    public MinMax add(int a){
        MinMax m = new MinMax(this.min + a, this.max + a);
        return m;
    }
    //We can implement the method above as a static method that belongs to the
    //class and not to an object. Therefore the method should be called
    //on the class not the object, as there is no this in this case
    public static MinMax add(MinMax obj, int a){
        MinMax m = new MinMax(obj.min + a, obj.max + a);
        return m;
    }
    //member method to add two MinMax objects
    public MinMax add(MinMax obj){
        MinMax m = new MinMax(this.min + obj.min, this.max + obj.max);
        return m;
    }
    //implement the above method as a static method
    public static MinMax add(MinMax m1, MinMax obj){
        MinMax res = new MinMax(m1.min + obj.min, m1.max + obj.max);
        return res;
    }

    public MinMax multiply(int a){
        MinMax m = new MinMax(this.min*a, this.max*a);
        return m;
    }

}
