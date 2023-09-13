/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai5;

import java.util.Scanner;

/**
 *
 * @author numpa
 */
public class Bai1 {

    public static void xuat(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static boolean ktUocSo(int a, int m) {
        if (m % a == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Mang vua nhap la:");
        xuat(arr);
        System.out.print("\nNhap so can kiem tra: ");
        int a = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (ktUocSo(a, arr[i])) {
                System.out.print(arr[i] + " ");
            }
        }
    }

}
