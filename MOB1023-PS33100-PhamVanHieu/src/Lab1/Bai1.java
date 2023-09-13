/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab1;

import java.util.Scanner;

/**
 *
 * @author numpa
 */
public class Bai1 {

    public static void main(String[] args) {
//		Product p = new Product();
//		p.input();
//		p.output();

//                Non tax product
//                Bai3 p = new Bai3();
//                p.input();
//                p.output();
        while (true) {
            int choice;
            Scanner sc = new Scanner(System.in);
            ProductDao dao = new ProductDao();
            Product p;
            System.out.println("1. Insert Prodcut");
            System.out.println("2. Update Prodcut");
            System.out.println("3. Delete Prodcut");
            System.out.println("4. Select All Prodcut");
            System.out.println("Choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    p = new Product();
                    p.input();
                    dao.insert(p);
                    break;
                }
                case 2 -> {
                    p = new Product();
                    p.input();
                    dao.update(p);
                    break;
                }
                case 3 -> {
                    sc = new Scanner(System.in);
                    System.out.println("Name delete?:");
                    String nameDel = sc.nextLine();
                    dao.delete(nameDel);
                    break;
                }

                case 4 -> {
                    dao.select();
                    break;
                }
            }
        }

    }
}
