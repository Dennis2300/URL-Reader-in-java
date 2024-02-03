package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class readUrlMain {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello world!");

        //Creates new instance of URL, which represents the URL of the oracle website
        URL oracle = new URL("https://www.oracle.com");
        //Creates a new BufferedReader, which reads text from a character-input stream
        BufferedReader in = new BufferedReader(
                //Creates a new InputStreamReader, which is a bridge from byte streams to character streams
                new InputStreamReader(oracle.openStream())
        );
        //Creates a new String, which is used to store the input line
        String inputLine;
        //For each line in the HTML that is NOT null, print the line
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
    }
}