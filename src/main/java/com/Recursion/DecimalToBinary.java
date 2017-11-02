package com.Recursion;

/**
 * Created by rakeshg on 9/12/17.
 */
public class DecimalToBinary {
    public static void decToBin(int n) {
        if (n>0) {
            decToBin(n/2);
            System.out.printf("%d", n%2);
        }
    }

    public static void main(String[] args) {

        decToBin(4);

    }
}
