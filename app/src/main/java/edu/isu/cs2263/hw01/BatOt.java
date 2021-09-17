package edu.isu.cs2263.hw01;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;


public class BatOt implements Output{
    FileWriter writer;
    File file;
    String newln = "\n";

    public void create(String make) throws IOException {
            try {
                file = new File(make);
                if (file.createNewFile()) {
                    System.out.println("File created: " + file.getName());
                } else {
                    System.out.println("File already exists.");
                }
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        writer = new FileWriter(file, true);
        }
        public void printOut(String write){
            try {
                writer.write(write);
                writer.write(newln);
                System.out.println("Wrote to file");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
    }
    public void close() throws IOException {
        writer.close();
    }
}
