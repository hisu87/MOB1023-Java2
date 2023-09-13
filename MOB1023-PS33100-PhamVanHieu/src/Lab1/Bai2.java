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
public class Bai2 {
    public static void main(String[] args){
        Product p[] = new Product[5];
        for (int i=5; i<5; i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap ten sp thu" + (i+1)+":");
            String name = sc.nextLine();
            System.out.println("Nhap gia sp thu" + (i+1) +(":"));
            double price = sc.nextDouble();
            p[i] = new Product(name,price);
        }
        System.out.printf("TenSP\tGiaSP\tThueNhapKhau\n");
        for(int i=0; i<5; i++){
            System.out.printf("%s\t.0f\t%.0f\n", p[i].getName(),p[i].getPrice(),p[i].getImportTax());
        }
    }
    
}
