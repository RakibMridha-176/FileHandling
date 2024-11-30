import java.io.File;

public class CreateFile {
    public static void main(String[] args) {

        File myFile = new File("FinalExamPrep.txt");
        try {
            myFile.createNewFile();
            System.out.println("File created successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}