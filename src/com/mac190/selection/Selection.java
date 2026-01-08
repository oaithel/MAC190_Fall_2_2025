package com.mac190.selection;
/*
Often, you reach a point in your program flow, where a decision has to be made
on the path to follow. For that we use selection statements: if-else or switch.
if(condition){
    StatementsA;
}else{
    StatementsB;
}
StatementsA could contain other if-else statements or anything else.
If condition is true, then StatementsA is executed and StatementsB are skipped. If the
condition is false, then StatementsA are skipped and StatementsB are executed.
In general we use either boolean variables for the condition, or we use comparators
or logical operators: && || ! !< !> <= == != ....
A   B     A&&B   A||B
T   T       T     T
T   F       F     T
F   T       F     T
F   F       F     F

!T = F and !F = T

int var1 = 2; var2 = 4, var3 = 7;
Evaluate the following conditions:
1) var1 > 0 || var1 < 0      True
2) var1 < var2 && var2 > 0   T && T = True
3) var1 < var3 || var2 < 0 && var3 > 0 same as var1 < var3 || (var2 < 0 && var3 > 0)
                                                    T || (F && T) = T || F = T
4) var1 < var3 || (var2 < 0 && var3 > 0)  Same as above, result True
5) (var1 < var3 || var2 < 0) && var3 > 0  (T || F) && T = T
6) var1 < var3 || var2 < 0 && var3 < 0 same as var1 < var3 || (var2 < 0 && var3 < 0)
                                                    T || (F && F) = T || F = T
4) var1 < var3 || (var2 < 0 && var3 < 0)  Same as above, result True
5) (var1 < var3 || var2 < 0) && var3 < 0  (T || F) && F = T && F = F
 */
public class Selection {
    public static void main(String[] args) {
        //try all the previous examples in an if-else statement
        // and display which condition is true and which is false.
    }
}
