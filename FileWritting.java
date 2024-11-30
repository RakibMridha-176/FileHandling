import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritting {
    public static void main(String[] args) {

        File myFile = new File("FinalExamPrep.txt");
        try {
            FileWriter fileWriter = new FileWriter("FinalExamPrep.txt");
            fileWriter.write("See you not for mind.\nHave a Relax!.\nKeep learning, Keep coding!");
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}