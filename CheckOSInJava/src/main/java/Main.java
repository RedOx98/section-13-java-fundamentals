import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
//        /Users/olaidehammed/Documents/olahammed/
        String OS = System.getProperty("os.name").toLowerCase();
//        System.out.println(OS);

        if(OS.indexOf("win") >= 0){
            System.out.println("Windows");
        } else if (OS.indexOf("mac") >= 0) {
            System.out.println("Apple System");
        } else if (OS.indexOf("nix") >= 0 || OS.indexOf("nux") >= 0 || OS.indexOf("aix") >= 0) {
            System.out.println("Apple System");
        } else {
            System.out.println("Unknown OS");
        }
    }
}
