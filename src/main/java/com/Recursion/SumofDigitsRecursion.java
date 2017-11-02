package com.Recursion;

/**
 * Created by rakeshg on 9/7/17.
 */
public class SumofDigitsRecursion {

    public static void main(String[] args) {
        int sum = sumOfDigits(1256);
        System.out.println(sum);
    }

    private static int sumOfDigits(int num) {

        int digit = num % 10;

        int sum = 0;

        if (digit != 0) {

            sum = digit + sumOfDigits(num / 10);
        }

        return sum;

        }

}
