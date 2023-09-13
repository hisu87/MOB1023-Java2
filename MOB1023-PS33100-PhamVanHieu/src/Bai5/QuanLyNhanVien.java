/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai5;

/**
 *
 * @author numpa
 */
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyNhanVien {
    ArrayList<NhanVien> listNhanVien = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void nhapDanhSachNhanVien() {
        System.out.print("Nhập số lượng nhân viên: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin nhân viên thứ " + (i + 1) + ":");
            NhanVien nv = new NhanVien();
            nv.Nhap();
            listNhanVien.add(nv);
        }
    }

    public void xuatDanhSachNhanVien() {
        System.out.println("Danh sách nhân viên:");
        for (int i = 0; i < listNhanVien.size(); i++) {
            System.out.println("Thông tin nhân viên thứ " + (i + 1) + ":");
            listNhanVien.get(i).Xuat();
        }
    }

    public void xuatDanhSachNhanVienCoThuong() {
        System.out.println("Danh sách nhân viên có thưởng:");
        for (int i = 0; i < listNhanVien.size(); i++) {
            if (listNhanVien.get(i).getThuong() > 0) {
                System.out.println("Thông tin nhân viên thứ " + (i + 1) + ":");
                listNhanVien.get(i).Xuat();
                System.out.println("Lương thưởng: "+ listNhanVien.get(i).getThuong());
            }
        }
    }

    public void xuatNhanVienCoLuongCaoNhat() {
        int maxLuong = -1;
        int index = -1;
        for (int i = 0; i < listNhanVien.size(); i++) {
            if (listNhanVien.get(i).tinhLuong() > maxLuong) {
                maxLuong = (int) listNhanVien.get(i).tinhLuong();
                index = i;
            }
        }
        System.out.println("Thông tin nhân viên có lương cao nhất:");
        listNhanVien.get(index).Xuat();
    }

    public static void main(String[] args) {
        QuanLyNhanVien qlnv = new QuanLyNhanVien();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nMENU");
            System.out.println("1. Nhập danh sách nhân viên");
            System.out.println("2. Xuất danh sách nhân viên");
            System.out.println("3. Xuất danh sách nhân viên có thưởng");
            System.out.println("4. Xuất nhân viên có lương cao nhất");
            System.out.println("5. Thoát chương trình");
            System.out.print("Lựa chọn của bạn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> qlnv.nhapDanhSachNhanVien();
                case 2 -> qlnv.xuatDanhSachNhanVien();
                case 3 -> qlnv.xuatDanhSachNhanVienCoThuong();
                case 4 -> qlnv.xuatNhanVienCoLuongCaoNhat();
                case 5 -> {
                }
                default -> System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 5);
    }
}
