package FileHandling;
import java.util.*;
import java.io.*;

public class FileReading {
    public static void main(String[] args) {

        File myFile = new File("FinalExamPrep.txt");
        try {
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}