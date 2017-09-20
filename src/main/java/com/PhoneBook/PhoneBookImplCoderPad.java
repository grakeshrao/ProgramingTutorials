
package com.PhoneBook;

import java.io.*;
import java.util.*;

/************************
This is coding exercide asked at NetApp. Below is the solution. But this cant be run
************************/

public class PhoneBookImplCoderPad
{
    public static void main (String[] args) throws java.lang.Exception
    {
        //new PhoneBook().findAll();
        //new PhoneBook().findByLastName("Reddy");
        // new PhoneBook().findByName("First Name", "Reddy");
        new PhoneBookImplCoderPad().findFirstNPhoneNumbers(4);

    }


    public List<PhoneBookEntry> findAll() {

        List<PhoneBookEntry> phEntryList = new ArrayList<PhoneBookEntry>();


        PhoneBookReader phReader = new PhoneBookReader();

        try  {

            while(phReader.hasNext()) {
                phEntryList.add(phReader.readNext());

            }

        } catch(IOException e) {
            System.out.println("The exception is" + e);

        }

//          for (PhoneBookEntry ph: phEntryList) {

//            System.out.println(ph);
//         }




        // System.out.println(phEntryList.get(0).getName().getLastName().split(" ")[0]);

        return phEntryList;
    }

    public List<PhoneBookEntry> findByLastName(String lastName) {

        List<PhoneBookEntry> phEntryList = new PhoneBookImplCoderPad().findAll();

        List<PhoneBookEntry> findByLastNameList = new ArrayList<PhoneBookEntry>();

        for (PhoneBookEntry ph: phEntryList) {

            if (ph.getName().getLastName().split("(")[0].equals(lastName)) {

                findByLastNameList.add(ph);

            }
        }


        System.out.println("******************************************************");

        for (PhoneBookEntry ph1: findByLastNameList) {

            System.out.println(ph1);
        }


        return findByLastNameList;

    }

    public PhoneBookEntry findByName(String firstName, String lastName) {

        List<PhoneBookEntry> phEntryList = new PhoneBookImplCoderPad().findAll();

        for (PhoneBookEntry ph: phEntryList) {

            if (ph.getName().getLastName().split("\\(")[0].trim().equalsIgnoreCase(lastName) && ph.getName().getFirstName().split("\\(")[0].trim().equalsIgnoreCase(firstName)) {

                System.out.println(ph);
                return ph;

            }
        }



        return null;
    }

    public List<PhoneBookEntry> findFirstNPhoneNumbers(int n) {

        List<PhoneBookEntry> phEntryList = new PhoneBookImplCoderPad().findAll();
        int counter = 0;

        for (PhoneBookEntry ph: phEntryList.subList(0,n)) {

            System.out.println(ph);
            counter++;
        }

        System.out.println(counter);

        return phEntryList.subList(0,n);

    }

}
