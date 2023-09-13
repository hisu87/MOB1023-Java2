/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6.bai3;

public class TestThread {

    public static void main(String[] args) {
        OddThread ot = new OddThread();
        EvenThread et = new EvenThread();
        Thread t1 = new Thread(et);
        Thread t2 = new Thread(ot);
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException ex) {}
        t1.start();
    }
}
