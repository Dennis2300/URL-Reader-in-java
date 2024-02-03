package org.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println("Hello world!");
        //Creates new instance of URL, which represents the URL of the oracle website
        URL oracle = new URL("https://www.oracle.com");
        //Creates a new BufferedReader, which reads text from a character-input stream
        BufferedReader in = new BufferedReader(
                //Creates a new InputStreamReader, which is a bridge from byte streams to character streams
                new InputStreamReader(oracle.openStream())
        );

        //Creates a new String, which is used to store the file path
        String filePath = "HTML of my URL.html";

        //Creates a new FileWriter, which is used to write characters to a file
        //Append is set to false, so the file will be overwritten and not continue to write to the end of the file
        FileWriter fileWriter = new FileWriter(filePath, false);

        //Creates a new BufferedWriter, which writes text to a character-output stream
        //BufferedWriter makes it more efficient to write to the file
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        //Creates a new String, which is used to store the input line
        String inputLine;

        //For each line in the HTML that is NOT null, write the line to the file
        while ((inputLine = in.readLine()) != null) {
            bufferedWriter.write(inputLine);
            bufferedWriter.newLine();
        }
        //Close the BufferedReader, BufferedWriter, and FileWriter
        in.close();
        bufferedWriter.close();
        fileWriter.close();

        //Print that the HTML of the URL has been saved to the file path
        System.out.println("HTML of the URL has been saved to " + filePath);
    }
}