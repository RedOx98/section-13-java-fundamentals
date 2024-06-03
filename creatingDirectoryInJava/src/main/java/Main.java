import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
//        /Users/olaidehammed/Documents/olahammed/
        File file = new File("/Users/olaidehammed/Documents/olahammed/folder/subfolder/yetanotherfolder");
        if(file.mkdirs()) {
            System.out.println("Folder created");
        } else {
            System.out.println("Folder already exists");
        }
//        /Users/olaidehammed/Documents
    }
}
