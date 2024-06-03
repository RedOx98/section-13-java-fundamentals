import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        /Users/olaidehammed/Documents/olahammed/
        File file = new File("studyeasy/studyeasy.txt");
        if (file.delete()){
            System.out.println("File deleted!!! ");
        }else {
            System.out.println("File deletion has some error!");
        }
    }
}