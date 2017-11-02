package com.Recursion;

/**
 * Created by rakeshg on 9/7/17.
 */
public class FactorialRecursion {

    public static void main(String[] args) {

        System.out.println(factorialRecursion(20));

    }

    private static long factorialRecursion(int num) {
        long result = 0;

        if (num < 0) {
            return result;
        }

        result = num * factorialRecursion(num - 1);

        return result;

    }
}
