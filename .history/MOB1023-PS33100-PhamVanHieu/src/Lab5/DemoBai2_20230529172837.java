/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5;

/**
 *
 * @author numpa
 */
public class DemoBai2 {
    public static void main(String[] args) {
        String path = "Students.dat";
        Students st = new Students("PS33100", "Nam", 10, "CNTT");
        try {
            Bai1.writeObject(path, st);
            System.out.println("Ghi file thanh cong");
            st = (Students) Bai1.readObject(path);
        } catch (Exception e) {
            // TODO: handle exception
            e.getMessage();
        }
    }
}
