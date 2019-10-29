//public class Propertyread {

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

    public class PropertiesFileHandling {
        public static void main(String[] args) {

            try {
                Properties prop = new Properties();
                InputStream input = new FileInputStream("D:/ethans/test.properties");

                // load a properties file
                prop.load(input);

                // get the property value and print it out
                System.out.println(prop.getProperty("a.b.c"));
                String abc = prop.getProperty("x.y.z");
                System.out.println(abc);
                System.out.println(prop.getProperty("p.q.r"));

            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }
    }
