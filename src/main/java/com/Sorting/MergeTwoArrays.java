package com.Sorting;

/**
 * Created by rakeshg on 9/19/17.
 */
public class MergeTwoArrays {

    public int[] mergeTwoArrays(int[] array1, int[] array2) {

        int[] mergedArray = new int[array1.length + array2.length];

        int array1Index = 0;
        int array2Index = 0;
        int mergedArrayIndex = 0;


        while (mergedArrayIndex < mergedArray.length) {

            // These are the conditions to check if the input arrays exceed the length
            boolean isArray1Exceeded = array1Index >= array1.length;
            boolean isArray2Exceeded = array2Index >= array2.length;

            // This is lazy approach. When array1 is exhausted the execution jumps onto else(array2) as we are using short circuit approach.
            if ((!isArray1Exceeded) && (isArray2Exceeded || array1[array1Index] < array2[array2Index])) {
                mergedArray[mergedArrayIndex] = array1[array1Index];
                array1Index++;
            } else {
                mergedArray[mergedArrayIndex] = array2[array2Index];
                array2Index++;
            }

            mergedArrayIndex++;

        }

        return mergedArray;

    }

    public static void main(String[] args) {

        int[] arr1 = {1,3,6,8,9};
        int[] arr2 = {2};

        MergeTwoArrays mergedArray = new MergeTwoArrays();

        mergedArray.mergeTwoArrays(arr1, arr2);



    }
}
