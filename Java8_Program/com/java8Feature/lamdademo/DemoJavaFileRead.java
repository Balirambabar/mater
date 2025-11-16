package com.java8Feature.lamdademo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DemoJavaFileRead {
    public static void main(String[] args) {
        String filePath="D:\\FullStackDeveloper\\AshokIT\\Java8\\Notes_Java8.txt";
        try
        {
BufferedReader bufferedReader=new BufferedReader(new FileReader(filePath));
 String line;
          while((line = bufferedReader.readLine()) != null)
          {
           System.out.println(line);
          }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
