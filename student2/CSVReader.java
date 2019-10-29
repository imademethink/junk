//package com.mkyong.csv;

//import java.io.BufferedReader;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
import java.io.*;

public class CSVReader {

    public static void main(String[] args) {

        String csvFile = "D://ethans//abc.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] arr = line.split(cvsSplitBy);

                //System.out.println("Country [code= " + country[4] + " , name=" + country[5] + "]");
                System.out.println(arr[1]+" "+arr[2]+" "+arr[3]);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}