/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5;

import java.io.FileOutputStream;
import java.io.FileReader;

/**
 *
 * @author numpa
 */
public class Bai1 {
    public static byte[] readData(String filename) throws Exception {
        try {
            FileReader fr = new FileReader("dataIn.txt");
            int n = fr.read();
            byte[] data = new byte[n];
            fr.close();
            return data;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void write (String path, byte[] data ){
       try {
        FileOutputStream fos = new FileOutputStream("dataIn.txt");
        fos.write(data);
        fos.close();
       } catch (Exception e) {
        // TODO: handle exception
        throw new RuntimeException(e);
       }
    }

}
