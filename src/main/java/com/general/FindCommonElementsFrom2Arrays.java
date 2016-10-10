package com.general;

/**
 * Created by rakeshg on 8/18/16.
 */
public class FindCommonElementsFrom2Arrays {

    public static void main(String[] args) {
        Integer[] arr1 = {1, 3, 5, 7, 2, 5};
        Integer[] arr2 = {4, 8, 2, 99, 33, 7};

        findCommonElements(arr1,arr2);
    }

    /**
     * This is the logic to find common elements from 2 arrays. We used nested for loops to achieve this
     *
     * @param intArr1
     * @param intArr2
     */
    // TODO: Code refactor should be done on nested for loops.
    public static void findCommonElements(Integer[] intArr1, Integer[] intArr2) {
        System.out.println("The common Elements from array1 and array2 are: ");
        for (int i = 0; i < intArr1.length; i++) {
            for (int j = 0; j < intArr2.length; j++) {
                if (intArr1[i] == intArr2[j]) {
                    System.out.println(intArr2[j]);
                }
            }
        }

    }
}
