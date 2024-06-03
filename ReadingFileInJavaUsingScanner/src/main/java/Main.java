import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
//        /Users/olaidehammed/Documents/olahammed/
        try(Scanner sc = new Scanner(new File("studyeasy/studyeasy.txt"));) {
            String line;
            while (sc.hasNext()){
                line = sc.nextLine();
                System.out.println(line);
            }
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}