/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LamThem;

/**
 *
 * @author numpa
 */
// Lớp SinhVienIT kế thừa từ lớp SinhVienPoly
public class SinhVienIT extends SinhVienPoly {
    // Thuộc tính điểm java, html, css

    private final double diemJava;
    private final double diemHtml;
    private final double diemCss;

    // Phương thức khởi tạo
    public SinhVienIT(String hoTen, String nganh, double diemJava, double diemHtml, double diemCss) {
        super(hoTen, nganh); // Gọi phương thức khởi tạo của lớp cha
        this.diemJava = diemJava;
        this.diemHtml = diemHtml;
        this.diemCss = diemCss;
    }

    // Ghi đè phương thức getDiem() để tính điểm cho sinh viên IT
    @Override
    public double getDiem() {
        return (2 * diemJava + diemHtml + diemCss) / 4;
    }
}
