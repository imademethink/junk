

import java.io.*;
import java.sql.SQLOutput;

public class ReadCSVEx1
{
    String filePath = "D:\\JavaSelenium\\SalesJan2009.csv";

    String line = "";


    public void readWriteFile()
    {
        try {

            FileReader readfile = new FileReader(filePath);
            BufferedReader br = new BufferedReader(readfile);

            FileWriter writeFile = new FileWriter("D:\\JavaSelenium\\SalesJan2011_test.txt");
            BufferedWriter bw = new BufferedWriter(writeFile);

            //line = br.readLine();
            while ((line = br.readLine()) != null) {


                String [] arr = line.split(",");
                for (String row : arr)
                {
                    bw.write(row);

                }


                //String[] arr = line.split(",");

                //System.out.println(arr[2]);

            }

            System.out.println("Success");
            readfile.close();
            writeFile.flush();
            writeFile.close();

        } catch (Exception e) {

        }
    }


    public static void main(String[] args) {

        ReadCSVEx1 obj1 = new ReadCSVEx1();
        obj1.readWriteFile();



    }
}
