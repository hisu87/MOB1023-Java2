/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5;

import java.io.FileReader;

/**
 *
 * @author numpa
 */
public class Bai1 {
    public static byte[] readData(String filename) throws Exception{
        FileReader f = new FileReader(filename);
        byte[] data = new byte[f.read()];
        f.close();
        return data;
    }
}
