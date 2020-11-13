package mod1;

import java.time.Clock;

public class NumberCalc {

    public static void main (String[] args){
        System.out.println("Program is starting");
        printName();
        int a=10;
        int b=20;
        addNumbers(a,b);
        int product= multiplyNumbers(a,b);
        System.out.println("The product of the numbers "+a+" and "+b+" is:"+product);

    }
    static void printName(){
        System.out.println("My name is Viviana");
    }
    static void   addNumbers(int a, int b){
      int sum= a+b;
      System.out.println("The sum of the numbers "+a+" and "+b+" is:"+sum);
    }
    static int multiplyNumbers(int a, int b){
        int product= a*b;
        return product;

    }
}
