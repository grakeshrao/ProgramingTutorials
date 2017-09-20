package com.PhoneBook;

import java.io.Closeable;
import java.io.IOException;
import java.util.Random;

import static java.lang.String.format;

/**
 * Created by rakeshg on 8/19/17.
 */
public class PhoneBookReader implements Closeable {
        int count = 0;

        public static PhoneBookReader getInstance() {
            return new PhoneBookReader();
        }

        public boolean hasNext() {
            return count++ < 100;
        }

        public PhoneBookEntry readNext() throws IOException {
            int phoneNumber = 1234567890;
            return new PhoneBookEntry(format("First Name (%d)", phoneNumber),
                    format(phoneNumber%2 == 0 ? "Patel (%d)" : "Reddy (%d)"  , phoneNumber), phoneNumber);
        }

        @Override
        public void close() throws IOException {

        }
}
