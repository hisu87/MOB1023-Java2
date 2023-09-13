/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Bai1 {
    public static void write(String fileName, byte[] data) {
        try (FileOutputStream fos = new FileOutputStream("dataOut.txt")) {
            fos.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static byte[] read(String fileName) {
        byte[] data = null;
        try (FileInputStream fis = new FileInputStream("dataIn.txt")) {
            data = fis.readAllBytes();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
    
    public static Object readObject(String path) throws FileNotFoundException, IOException, ClassNotFoundException{
        try(
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
        ){
            Object obj = ois.readObject();
            return obj;
        }
    }

    public static void writeObject(String path, Object data) throws FileNotFoundException, IOException{
        try(
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
        ){
            oos.writeObject(data);
        }
    }
    
}
