/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LamThem;

/**
 *
 * @author numpa
 */
// Tạo lớp DbManager chứa phương thức main()
class DbManager {

    public static void main(String[] args) {
        // Tạo 2 đối tượng từ 2 lớp Product và Order
        DbAction db1 = new Product();
        DbAction db2 = new Order();

        // Gọi phương thức insert() của mỗi đối tượng
        db1.insert();
        db2.insert();
    }
}
