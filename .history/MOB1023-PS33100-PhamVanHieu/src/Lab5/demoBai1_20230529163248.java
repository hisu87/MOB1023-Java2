/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5;

/**
 *
 * @author numpa
 */
public class demoBai1 {
    public static void main(String[] args) {
        byte[] data = Bai1.readData("data.txt");
        Bai1.write("data.txt", data);
    }
}
