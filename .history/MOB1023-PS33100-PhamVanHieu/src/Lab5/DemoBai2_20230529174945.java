/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author numpa
 */
public class DemoBai2 {
    public static void main(String[] args) {
        String path = "Students.dat";
        List <Students> list = new ArrayList<>();
        Students st = new Students();
        list.add(new Students("PS33121","Phan Quốc Khánh", 8.75, "CNTT"));
        list.add(new Students("PS33122","Nguyễn Văn Hùng", 8.75, "CNTT"));
        list.add(new Students("PS33123","Nguyễn Mạnh Hùng", 8.75, "CNTT"));
        list.add(new Students("PS33124","Tô Sam Sung", 8.75, "CNTT"));
        list.add(new Students("PS33125","Nguyễn Thanh Ngân", 8.75, "CNTT"));
        list.add(new Students("PS33126","Quynỳnh", 8.75, "CNTT"));
        
        try {
             Bai1.writeObject(path, st);
            System.out.println("Ghi file thành công");
            st = (Students) Bai1.readObject(path);
            for (Students st : list) {
                System.out.println(st);
            }}
            catch (Exception e) {
            // TODO: handle exception
            e.getMessage();
        }
    }
}
