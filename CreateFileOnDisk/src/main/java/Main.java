import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
//        /Users/olaidehammed/Documents/olahammed/
        File file = new File("studyeasy.txt");
//        /Users/olaidehammed/Documents
        file.createNewFile();
        System.out.println("File created ");
    }
}
