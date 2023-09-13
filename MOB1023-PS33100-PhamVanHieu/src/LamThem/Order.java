/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LamThem;

/**
 *
 * @author numpa
 */
class Order implements DbAction {
  // Viết mã cho các phương thức insert(), update(), delete() và select() cho lớp Order
  @Override
  public void insert() {
    System.out.println("Insert order");
  }

  @Override
  public void update() {
    System.out.println("Update order");
  }

  @Override
  public void delete() {
    System.out.println("Delete order");
  }

  @Override
  public void select() {
    System.out.println("Select order");
  }
}
