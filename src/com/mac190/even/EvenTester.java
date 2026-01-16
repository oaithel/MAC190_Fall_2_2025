package com.mac190.even;
/*
Test your Even class here. Create at least two Even objects and invoke
all methods appropriately.
 */
public class EvenTester {
    public static void main(String[] args) {
        //create an Even object
        Even E1 = new Even();
        E1.setEven(5);
        System.out.println("E1: " + E1.getEven());
        E1.print();
        System.out.println("E1: " + E1.toString());
        //When an object is added to a String, java call the toString
        //of the class automatically
        System.out.println("E1: " + E1);
        Even E2 = new Even();
        E2.setEven(6);
        System.out.println("E2: " + E2);
        if(E1 == E2){
            //== is comaring the references, will be true only if the two references
            //refer to the same object, which is not the case most of the time.
            //never use == when comparing objects in java. Use .equals instead.
            System.out.println("E1 is same as E2");
        }else{
            System.out.println("E1 is NOT same as E2");
        }
        if(E1.equals(E2)){
            //E1 would be this in equals and E2 is e.
            System.out.println("E1 is same as E2");
        }else{
            System.out.println("E1 is NOT same as E2");
        }
        //using the add method.
        Even E3 = E1.add(E2);
        System.out.println("E3: " + E3);
        //Add E3 to E1 and display it?

        //In one instruction do the following E3 = E1 + (E1 + E2)
    }
}
