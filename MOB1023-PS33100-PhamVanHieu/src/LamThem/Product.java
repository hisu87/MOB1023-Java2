/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LamThem;

/**
 *
 * @author numpa
 */
// Tạo 2 lớp Product và Order thực thi theo interface DbAction
class Product implements DbAction {
    // Viết mã cho các phương thức insert(), update(), delete() và select() cho lớp Product

    @Override
    public void insert() {
        System.out.println("Insert product");
    }

    @Override
    public void update() {
        System.out.println("Update product");
    }

    @Override
    public void delete() {
        System.out.println("Delete product");
    }

    @Override
    public void select() {
        System.out.println("Select product");
    }
}
