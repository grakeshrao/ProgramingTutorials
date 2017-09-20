package com.PhoneBook;

import java.io.*;
import java.util.List;

/**
 * Created by rakeshg on 8/19/17.
 */
public class PhoneBookImplmentation {

    public static void main(String[] args) {

       findAll();

       findByLastName("Rakesh");

    }


    public static List<PhoneBookEntry>  findAll() {

        File file = new File("input.txt");

        try (InputStream is = new FileInputStream(file)) {
            // do something with this input stream
            // ...
        }
        catch (Exception ex) {
            System.err.println("Missing file " + file.getAbsolutePath());
        }


        return null;
    }

    public static List<PhoneBookEntry> findByLastName(String lastName) {
        return null;
    }
}
