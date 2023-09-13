/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LamThem;

/**
 *
 * @author numpa
 */
// Lớp SinhVienBiz kế thừa từ lớp SinhVienPoly
public class SinhVienBiz extends SinhVienPoly {
    // Thuộc tính điểm marketing, sales

    private final double diemMarketing;
    private final double diemSales;

    // Phương thức khởi tạo
    public SinhVienBiz(String hoTen, String nganh, double diemMarketing, double diemSales) {
        super(hoTen, nganh); // Gọi phương thức khởi tạo của lớp cha
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    // Ghi đè phương thức getDiem() để tính điểm cho sinh viên Biz
    @Override
    public double getDiem() {
        return (2 * diemMarketing + diemSales) / 3;
    }
}
