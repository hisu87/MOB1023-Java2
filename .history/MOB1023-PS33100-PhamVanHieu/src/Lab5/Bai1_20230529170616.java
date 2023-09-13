/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.management.ObjectName;

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
    
    public static Object readObject(String path){
        try(
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
        ){
            Object obj = ois.readObject();
            return obj;
        } catch (Exception e) {
            // TODO: handle exception
            throw new RuntimeException(e);
            throw
        }

    }
}
