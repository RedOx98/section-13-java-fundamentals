import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
//        /Users/olaidehammed/Documents/olahammed/
        File file = new File("studyeasy/test.txt");
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))){
//            bw.write("Hello Olahammed!");
            bw.newLine();
            bw.write("Programmer:");
            bw.write("Olaide Hammed");
            bw.close();

            System.out.println("File operation was successful");
        }catch (IOException e){
            e.printStackTrace();
            System.out.println("Something went wrong!");
        }
    }
}
