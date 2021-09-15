package edu.isu.cs2263.hw01;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class BatIn implements Input {

    // Variables
    String[] exp = new String[20];
    File file;
    Scanner sc;
    Integer i = 0;
    String next;

    //Methods
    public void in(String in_file) throws FileNotFoundException {
        // pass the path to the file as a parameter
        file = new File(in_file);
        sc = new Scanner(file);
    }

      public String out(){
        if(sc.hasNextLine()){
            next = sc.nextLine();
        }
        else {
            System.out.println("no line");
            next = "0";
        }
          return next;
}
    public Boolean check(){
        if(sc.hasNextLine()){
            return true;
        }
        else {return false;}
    }
}