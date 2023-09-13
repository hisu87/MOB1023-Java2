/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thi;

import com.sun.source.doctree.ThrowsTree;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Asus
 */
public class XFile {
    public static Object readObject(String path){
        try {
            ObjectInputStream ois  = new ObjectInputStream(new FileInputStream(path));
            Object object = ois.readObject();
            ois.close();
            
            return object;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static Object writeObject(String path,Object object){
        try {
            ObjectOutputStream oos = new ObjectOutputStream( new FileOutputStream(path));
              oos.writeObject(object);
            oos.close();
            return object;
            
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        
    }
    
}
