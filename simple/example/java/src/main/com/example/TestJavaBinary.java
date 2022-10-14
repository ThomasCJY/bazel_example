package example.java.src.main.com.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;

public class TestJavaBinary {
    public static void main(String[] args) throws IOException {
        String propertyValue = System.getProperty("data.path");
        if (Paths.get(propertyValue).toFile().exists()){
            File file = Paths.get(propertyValue).toFile();
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String currentLine = reader.readLine();
            System.out.println("Data file exists! Content:" + currentLine);
        } else {
            throw new RuntimeException("No data file found under path - " + propertyValue);
        }
    }
}
