package com.general;

/**
 * Created by rakeshg on 10/5/17.
 */
public class PalindromeEfficientMethod {

    public static void main(String[] args) {
        String str = "abbaa";
        boolean isPalindrome = true;

        int length = str.length();

        for (int i = 0; i<length/2; i++) {

           if(str.charAt(i) != str.charAt(length-1-i)) {
               isPalindrome = false;
           }

        }

        if (!isPalindrome) {

        System.out.println("The string is not Palindrome");
        } else {
            System.out.println("The string is Palindrome");
        }
    }
}
