/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LamThem;

/**
 *
 * @author numpa
 */
public class B extends A {

    int z;

    public B(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public void print() {
        System.out.printf(
                "x =  % d, y =  % d, z =  % d ", x, y, z
        );
    }
}
