/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LamThem;

/**
 *
 * @author numpa
 */
public class A {

    protected int x, y;

    public A(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public A(int x) {
        this(x, x);
    }

    public void print() {
        System.out.printf(
                "x=%d, y=%d", x, y
        );
    }
}
