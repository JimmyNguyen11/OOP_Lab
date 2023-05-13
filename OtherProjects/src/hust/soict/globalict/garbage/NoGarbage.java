package hust.soict.globalict.garbage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;

public class NoGarbage {

   public static void main(String[] args) throws Exception {

       // Read a binary file to a String using the + operator
       String binaryData = "";
       try {
           BufferedReader reader = new BufferedReader(new FileReader("file.bin"));
           String line;
           while ((line = reader.readLine()) != null) {
               binaryData += line;
           }
           reader.close();
       } catch (IOException e) {
           e.printStackTrace();
       }
       System.out.println("Read binary data using + operator: " + binaryData.length() + " bytes");

       // Read a text file to a String using the + operator
       String textData = "";
       try {
           BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
           String line;
           while ((line = reader.readLine()) != null) {
               textData += line;
           }
           reader.close();
       } catch (IOException e) {
           e.printStackTrace();
       }
       System.out.println("Read text data using + operator: " + textData.length() + " bytes");

       // Read a text file to a String using StringBuilder
       StringBuilder builder = new StringBuilder();
       try {
           BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
           String line;
           while ((line = reader.readLine()) != null) {
               builder.append(line);
           }
           reader.close();
       } catch (IOException e) {
           e.printStackTrace();
       }
       String textDataStringBuilder = builder.toString();
       System.out.println("Read text data using StringBuilder: " + textDataStringBuilder.length() + " bytes");

       // Sleep for 10 seconds to observe memory usage
       Thread.sleep(10000);

   }
}
