/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.vn.thread;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

/**
 *
 * @author numpa
 */
public class ClockThread implements Runnable {
    JLabel clockLabel;

    public ClockThread(JLabel clockLabel) {
        this.clockLabel = clockLabel;
    }
    /**
    * Đặt đồng hồ vào giờ hiện tại và ngủ cho đến khi bị gián đoạn. Đây là một chuỗi không có cuộc gọi trở lại
    */
    @Override
    public void run() {
        // Phương pháp này được sử dụng để hiển thị nhãn đồng hồ.
        while (true) {
            Date now = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss aa");
            clockLabel.setText(dateFormat.format(now));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }
    }
}
