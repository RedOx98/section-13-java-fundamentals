package org.studyeasy;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        /Users/olaidehammed/Documents/olahammed/
        Vehincle bike = new Vehincle("Bike", 52814);
        Vehincle car = new Vehincle("Car", 95824);

        try(FileOutputStream fos = new FileOutputStream("Studyeasy/vehincle.dat")) {
            try(ObjectOutputStream obj = new ObjectOutputStream(fos)) {
                obj.writeObject(bike);
                obj.writeObject(car);
                System.out.println("File operation was successful");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}