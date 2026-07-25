package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {

    private static Properties properties = new Properties();

    static {



        try {

            FileInputStream file = new FileInputStream("configuration.propeties");

            properties.load(file);

            file.close();




        } catch (IOException e) {

            System.out.println("The file you are looking for does not exist in Configuration.properties file");



        }
        }

        public static String getProperty(String keyword){

            return properties.getProperty(keyword);


        }

















}
