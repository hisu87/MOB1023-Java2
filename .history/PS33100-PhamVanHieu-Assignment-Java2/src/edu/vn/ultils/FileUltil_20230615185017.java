/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.vn.ultils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import edu.vn.models.Employee;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author numpa
 */
public class FileUltil {
    public static final String FILE_NAME = "employee.dat";
    /**
    * Viết nội dung của danh sách vào tệp.
    * 
    * @param ls - danh sách
    */
    public static void writeFile(List<Employee> ls) throws FileNotFoundException, IOException{
        FileOutputStream fos = new FileOutputStream(FILE_NAME);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(ls);
        oos.close();
    }
    /**
    * Đọc nội dung của tệp và trả lại nó như một danh sách. Phương pháp này được sử dụng để đọc dữ liệu từ
    * 
    * 
    * @return Danh sách nhân viên
    */
    public static List<Employee> readFile() throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream fis = new FileInputStream(FILE_NAME);
        ObjectInputStream ois = new ObjectInputStream(fis);
        List<Employee> ls = new ArrayList<>();
        ls = (ArrayList<Employee>) ois.readObject();
        for (Employee e : ls) {
            System.out.println(e);
        }
        ois.close();
        return ls;
    }
    
}