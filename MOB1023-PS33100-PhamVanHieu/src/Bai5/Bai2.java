/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai5;

/**
 *
 * @author numpa
 */
public class Bai2 {
    public static void main(String[] args) {
        NhanVien nv = new NhanVien();
        nv.Nhap();
        nv.Xuat();
        System.out.println("Thuong cua nhan vien la: " + nv.getThuong());
    }
}
