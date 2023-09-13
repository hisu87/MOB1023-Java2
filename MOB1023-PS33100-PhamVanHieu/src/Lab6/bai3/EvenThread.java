/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6.bai3;

public class EvenThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.print(" " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                }
            }

        }
    }

}
