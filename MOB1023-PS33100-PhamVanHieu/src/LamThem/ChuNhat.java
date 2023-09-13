/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LamThem;

/**
 *
 * @author numpa
 */
public class ChuNhat {

    //Thuộc tính
    private final double rong;
    private final double dai;

    //Hàm tạo
    public ChuNhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    //Phương thức tính chu vi
    public double getChuVi() {
        return (dai + rong) * 2;
    }

    //Phương thức tính diện tích
    public double getDienTich() {
        return dai * rong;
    }

    //Phương thức xuất thông tin
    public void xuat() {
        System.out.println("Chiều dài: " + dai);
        System.out.println("Chiều rộng: " + rong);
        System.out.println("Diện tích: " + getDienTich());
        System.out.println("Chu vi: " + getChuVi());
    }

    

}
