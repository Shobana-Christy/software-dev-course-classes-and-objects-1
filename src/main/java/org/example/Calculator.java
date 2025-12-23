package org.example;

public class Calculator {
    // Add a static function called add that takes two int parameters and
    // returns their sum (as an int)

    public static int add(int numOne, int numTwo){
        int sum = numOne + numTwo;
        return sum;
    }

    // Add a static function called subtract that takes two int parameters and
    // returns their difference (as an int)
    public static int subtract(int numOne,int numTwo){
        int difference = numOne - numTwo;
        return difference;
    }

    // Add a static function called multiply that takes two int parameters and
    // returns their product (as an int)
    public static int multiply(int numOne,int numTwo){
        int product = numOne * numTwo;
        return product;
    }

    // Add a static function called divide that takes two int parameters and
    // returns their quotient (as an int)
    public static int divide(int numOne,int numTwo){
        int quotient = numOne / numTwo;
        return quotient;
    }
}
