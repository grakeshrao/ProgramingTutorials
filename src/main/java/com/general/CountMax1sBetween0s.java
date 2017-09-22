package com.general;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by rakeshg on 9/21/17.
 */
public class CountMax1sBetween0s {

    public static int countMaxOccurrenceOfDigit(int[] arr, int target) {

        int tempCounter = 0;
        int maxCounter = 0;


        for (int i=0; i<arr.length; i++) {

            if (arr[i] == target) {
                tempCounter++;
            } else {
                tempCounter = 0;
            }

            if (tempCounter > maxCounter) {
                maxCounter = tempCounter;
            }

        }

        System.out.println("The maximum sequence of 1's is:"+ maxCounter);

        return maxCounter;

    }

    public static void main(String[] args) {
        int[] array = {1,0,0,0,1,1,1,1,0,1,1,1,1,1,1,1,0};
       countMaxOccurrenceOfDigit(array, 1);
    }
}
