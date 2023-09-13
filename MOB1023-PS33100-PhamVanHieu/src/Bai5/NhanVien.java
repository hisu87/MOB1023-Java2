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
public class NhanVien {
    private String maNV;
    private String hoTenNV;
    private int tuoi;
    private double ngayCong;
    private double luongNgay;

    NhanVien() {
        
    }

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma nhan vien: ");
        maNV = sc.nextLine();
        System.out.print("Nhap ho ten nhan vien: ");
        hoTenNV = sc.nextLine();
        System.out.print("Nhap tuoi nhan vien: ");
        tuoi = sc.nextInt();
        System.out.print("Nhap so ngay cong: ");
        ngayCong = sc.nextDouble();
        System.out.print("Nhap luong ngay: ");
        luongNgay = sc.nextDouble();
    }

    public void Xuat() {
        System.out.println("Ma nhan vien: " + maNV);
        System.out.println("Ho ten nhan vien: " + hoTenNV);
        System.out.println("Tuoi nhan vien: " + tuoi);
        System.out.println("So ngay cong: " + ngayCong);
        System.out.println("Luong ngay: " + luongNgay);
    }

    public Double getThuong() {
        if (ngayCong >= 26) {
            return 1000000.0;
        } else if (ngayCong >= 24) {
            return 500000.0;
        } else {
            return 0.0;
        }
    }
    
    public double tinhLuong(){
        double luong = ngayCong * luongNgay;
        return luong;
    };

    public NhanVien(String maNV, String hoTenNV, int tuoi, double ngayCong, double luongNgay) {
        this.maNV = maNV;
        this.hoTenNV = hoTenNV;
        this.tuoi = tuoi;
        this.ngayCong = ngayCong;
        this.luongNgay = luongNgay;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTenNV() {
        return hoTenNV;
    }

    public void setHoTenNV(String hoTenNV) {
        this.hoTenNV = hoTenNV;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double getNgayCong() {
        return ngayCong;
    }

    public void setNgayCong(double ngayCong) {
        this.ngayCong = ngayCong;
    }

    public double getLuongNgay() {
        return luongNgay;
    }

    public void setLuongNgay(double luongNgay) {
        this.luongNgay = luongNgay;
    }
}

    

