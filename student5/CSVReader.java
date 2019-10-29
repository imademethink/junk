import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {

    public static void main(String[] args) {

        String csvFile = "D:\\JavaSelenium\\country.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        try {

            FileReader file = new FileReader(csvFile);
            br = new BufferedReader(file);
            //br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] title = line.split(cvsSplitBy);
                String[] name = line.split(cvsSplitBy);
                String[] age = line.split(cvsSplitBy);
                String[] salary = line.split(cvsSplitBy);
                String [] arr = line.split(",");

//                for (String row : arr)
//                {
//                    System.out.println(row);
//                }
                System.out.println(title[0] + "   " +  name[1] + "    " + age[2] + "    " + salary[3] + "  ");

                /*
                System.out.println("title = " + title[0]);
                System.out.println("name = " + name[1]);
                System.out.println("age = " + age[2]);
                System.out.println("salary = " + salary[3]);
                */
               // System.out.println("Country [code= " + country[4] + " , name=" + country[5] + "]");

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
