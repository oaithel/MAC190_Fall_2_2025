package com.mac190.introclasses;
/*
A class is a blueprint of objects, a description of objects in terms of data
and actions that can be performed on that data. For instance, you can describe a car as
A car is something that has a number of doors, a fuelType, VIN, number of seats,
color, power .....what actions can you perform on an object car
brake(), moveBack(), moveforward(), turnLeft(), trunRight() ....
These actions act on the data of the car, an called methods.
To define a class we use:
public class ClassName{
    AccessSpecifier  type  variableName;
    AccessSpecifier  type  variableName2;


    //methods
    public type methodName(params){

    }
}
AccessSpecifier can be
public: anyone can access, no restriction
private: only the class itself can access none else
protected: the class itself and the derived classes can access the member (within the package).

Example
public class Sum{
    int x, y;

    public void add(){
          System.out.println(x + " + " + y + " = " + (x+y));
    }
    public void subtract(){
          System.out.println(x + " - " + y + " = " + (x-y));
    }
     public void multiply(){
          System.out.println(x + " * " + y + " = " + (x*y));
    }
    public void divide(){
          System.out.println(x + " / " + y + " = " + (x/y));
    }
   }

   In order to create an object of a given class, we use
   ClassName objectName = new ClassName();
   //create an object Sum
   Sum calc = new Sum(); //S has two integer attributes (attributes are values of the member variables
   of an object)
   //to access the member variables (attributes of an object), objectName.variableName
   //assign 3 to x of calc
   calc.x = 3;
   calc.y = 5;
   //invoke method add on object calc
   calc.add();

 */
public class IntroClasses {
    public static void main(String[] args) {
        Sum calc = new Sum(); //S has two integer attributes (attributes are values of the member variablesof an object)
        //to access the member variables (attributes of an object), objectName.variableName
        //assign 3 to x of calc
        calc.x = 3;
        calc.y = 5;
        //invoke method add on object calc
        calc.add();
        calc.multiply();
        //create another Sum object with 2 and 4 for x and y
        Sum mine = new Sum();
        mine.x = 2;
        mine.y = 4;
        //invoke add and subtract on the new object.
        mine.add();
        mine.subtract();
        //assign the old object to the new object
        mine = calc;
        //invoke add on the new object, and on the old object
        mine.add();
        calc.add();
        //change x of new object to 7
        mine.x = 7;
        //invoke add on the new object, and on the old object
        mine.add();
        calc.add();
        //what do you think happened? How many objects do you have now?
        /*
        When we assign calc to mine, mine will reference the old object and
        the old object ends having two references and the new object with no
        reference and wll be destroyed by the Java garbage collector. therefore
        at the end we end up having only one object with two references.
         */
    }
}
