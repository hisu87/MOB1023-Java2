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
        try {
            byte[] data = Bai1.readData("data.txt");
            for (int i = 0; i < data.length; i++) {
                System.out.println(data[i]);
            }
        } catch (Exception e) {
}
