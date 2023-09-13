/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5;

import java.io.FileReader;

import javax.xml.crypto.Data;

/**
 *
 * @author numpa
 */
public class Bai1 {
    public static byte[] readData(String filename) throws Exception {
        try {
            FileReader fr = new FileReader("data.txt");
            int n = fr.read();
            byte[] data = new byte[n];
            fr.close();
            return data;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void write (String path, byte[] data ){
        


    }

}
