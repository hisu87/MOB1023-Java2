/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LamThem;

import java.util.Scanner;

/**
 *
 * @author numpa
 */
public class Main {

    public static void main(String[] args) {
        //Nhập 2 hình chữ nhật và 1 hình vuông từ bàn phím
         Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều dài và chiều rộng của hình chữ nhật 1:");
        double dai1 = sc.nextDouble();
        double rong1 = sc.nextDouble();
        System.out.println("Nhập chiều dài và chiều rộng của hình chữ nhật 2:");
        double dai2 = sc.nextDouble();
        double rong2 = sc.nextDouble();
        System.out.println("Nhập cạnh của hình vuông:");
        double canh = sc.nextDouble();

        //Tạo các đối tượng hình chữ nhật và hình vuông từ các giá trị nhập vào
        ChuNhat cn1 = new ChuNhat(dai1, rong1);
        ChuNhat cn2 = new ChuNhat(dai2, rong2);
        Vuong vu = new Vuong(canh);

        //Xuất thông tin các đối tượng ra màn hình
        System.out.println("Thông tin hình chữ nhật 1:");
        cn1.xuat();
        System.out.println("Thông tin hình chữ nhật 2:");
        cn2.xuat();
        System.out.println("Thông tin hình vuông:");
        vu.xuat();
    }
}
