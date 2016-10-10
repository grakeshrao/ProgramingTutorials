package com.general;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by rakeshg on 8/18/16.
 */
public class FindDuplicateWordsInString {

    public static void main(String[] args) {
       findDuplicateWord("rakeeshh");
    }

    /**
     * This logic uses Set and determine the duplicate characters
     * @param word
     */
    public static void findDuplicateWord(String word) {
        Set<Character> wordSet = new HashSet<Character>();
         int len = word.length();
        System.out.println("The duplicate characters in the String are: ");
        for (int i = 0; i <= len - 1; i++) {
            char ch = word.charAt(i);
            if (!wordSet.add(ch)) {
                System.out.println(ch);
            }
        }
    }
}
