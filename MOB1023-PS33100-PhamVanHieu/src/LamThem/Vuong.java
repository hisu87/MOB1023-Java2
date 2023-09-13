/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LamThem;

/**
 *
 * @author numpa
 */
public class Vuong extends ChuNhat {

    //Hàm tạo
    public Vuong(double canh) {
        super(canh, canh); //Gọi hàm tạo của lớp cha với 2 tham số bằng nhau
    }

    //Ghi đè phương thức xuất thông tin
    @Override
    public void xuat() {
//        System.out.println("Cạnh: " + super.getDai()); //Gọi phương thức của lớp cha để lấy cạnh
        System.out.println("Diện tích: " + super.getDienTich()); //Gọi phương thức của lớp cha để tính diện tích
        System.out.println("Chu vi: " + super.getChuVi()); //Gọi phương thức của lớp cha để tính chu vi
    }
}
