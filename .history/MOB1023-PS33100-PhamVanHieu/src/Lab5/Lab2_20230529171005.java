/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author numpa
 */
public class Lab2 {
    public static Object readObject(String path) throws FileNotFoundException, IOException, ClassNotFoundException{
        try(
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
        ){
            Object obj = ois.readObject();
            return obj;
        }
    }
    
    public sta

}
