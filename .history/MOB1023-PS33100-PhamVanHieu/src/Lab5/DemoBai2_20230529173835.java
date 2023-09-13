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
        list.add(new Students("PS33121","Phan Quốc Khánh", 8.75, "CNTT"));
        list.add(new Students("PS33122","Nguyễn Văn Hùng", 8.75, "CNTT"));
        list.add(new Students("PS33123","Nguyễn Mạnh Hùng", 8.75, "CNTT"));
        list.add(new Students("PS33124","Tô Sam Sung", 8.75, "CNTT"));
        list.add(new Students("PS33125","Nguyễn Thanh Ngân", 8.75, "CNTT"));
        list.add(new Students("PS33126","Quynỳnh", 8.75, "CNTT"));
        Students st = new Students();
        try {
            // Bai1.writeObject(path, st);
            System.out.println("Ghi file thành công");
            st = (Students) Bai1.readObject(path);
            System.out.println("Name: " + st.getName());
            System.out.println("ID: " + st.getId());
            System.out.println("Mark: "  + st.getMark());
            System.out.println("Major: " + st.getMajor());
            System.out.println("Đọc file thành công");
        } catch (Exception e) {
            // TODO: handle exception
            e.getMessage();
        }
    }
}
