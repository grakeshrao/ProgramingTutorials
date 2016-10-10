package com.general;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by rakeshg on 7/28/16.
 */
public class PalindromeString {

    public static void main (String[] args) {
        String a = "abc";
        String b = "eee";

        StringBuilder ab = new StringBuilder(a);

        a = ab.reverse().toString();

        if (StringUtils.equalsIgnoreCase(a,b)) {
            System.out.println(1);
        } else {
            System.out.println(-1);
        }

    }
}
