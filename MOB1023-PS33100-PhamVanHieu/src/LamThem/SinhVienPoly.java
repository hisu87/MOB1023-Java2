/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LamThem;

/**
 *
 * @author numpa
 */
// Lớp trừu tượng SinhVienPoly
public abstract class SinhVienPoly {
    // Thuộc tính họ tên và ngành

    private final String hoTen;
    private final String nganh;

    // Phương thức khởi tạo
    public SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    // Phương thức trừu tượng getDiem()
    public abstract double getDiem();

    // Phương thức getHocLuc() để xếp loại học lực
    public String getHocLuc() {
        double diem = getDiem();
        if (diem < 5) {
            return "Yếu";
        } else if (diem < 6.5) {
            return "Trung bình";
        } else if (diem < 7.5) {
            return "Khá";
        } else if (diem < 9) {
            return "Giỏi";
        } else {
            return "Xuất sắc";
        }
    }

    // Phương thức xuat() để xuất thông tin ra màn hình
    public void xuat() {
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Ngành: " + nganh);
        System.out.println("Điểm: " + getDiem());
        System.out.println("Học lực: " + getHocLuc());
    }
}
