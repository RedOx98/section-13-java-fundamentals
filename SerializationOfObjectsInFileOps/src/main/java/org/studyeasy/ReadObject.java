package org.studyeasy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args){
        try(FileInputStream fis = new FileInputStream("studyeasy/vehincle.dat")) {
            try(ObjectInputStream obj = new ObjectInputStream(fis)) {
                Vehincle v1 = (Vehincle) obj.readObject();
                Vehincle v2 = (Vehincle) obj.readObject();
                System.out.println(v1);
                System.out.println(v2);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
