package com.general;

/**
 * Created by rakeshg on 7/6/16.
 */
public class RemoveAnyCharFromString {

    public String removeAnyCharFromString(String str, char ch) {
        String newStr = null;

          for (int i=0; i< str.length()-1; i++) {
              if (str.charAt(i) == ch) {
                  newStr = str.substring(0,i) + str.substring(i+1);
              }
          }
        System.out.println(newStr);
        return newStr;
    }

    public static void main(String[] args) {
        // Remove a char from String
        RemoveAnyCharFromString charFromString = new RemoveAnyCharFromString();
        charFromString.removeAnyCharFromString("Rakesh", 'a');
    }
}
