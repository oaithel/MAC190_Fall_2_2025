package com.mac190.secondorderclass;
/*
Implement the second order program as a class. SecondOrder class having
three double member variables and one method solve() that solves the equation
and displays the solutions. Change main, so that you create an object SecondOrder,
read inputs from the user to change the attributes of the object
invoke solve to solve the equation.
 */
public class SecondOrder {
    private double a, b, c;
    //getters
    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }
    //setters
    public void setA(double a){
        this.a = a;
    }
    public void setB(double a){
        this.b = a;
    }
    public void setC(double a){
        this.c = a;
    }

    public void solve(){
        if(a == 0) {
            if(b == 0){
                if(c == 0){
                    System.out.println("This is 0 = 0, infinite number of solutions");
                }else{
                    //c not 0
                    System.out.println("C = 0, no solution");
                }
            }else{
                //b is not 0
                System.out.println("This is a first order equation solution: "+ (-c/b));
            }
        }else {
            //a not 0
            //compute the discriminant
            double D = Math.pow(b, 2) - 4 * a * c;
            if (D == 0) {
                System.out.println("there is one double solution: " + (-b / (2 * a)));
            } else if (D > 0) {
                double X1 = (-b + Math.sqrt(D)) / (2 * a);
                double X2 = (-b - Math.sqrt(D)) / (2 * a);
                System.out.println("there are two solutions: \nX1 = " + X1 + "\nX2 = " + X2);
            } else {
                //D < 0
                System.out.println("there are no solutions");
            }
        }
    }
}
