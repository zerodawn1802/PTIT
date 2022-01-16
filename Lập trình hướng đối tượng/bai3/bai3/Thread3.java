/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Thread3 extends Thread {

    Data data;

    Thread3(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        synchronized (data) {
            data.notifyAll();
            while (true) {

                while (data.isStop == false && data.getHang() != 3) {
                    try {
                        data.wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(bai3.Thread1.class.getName())
                                .log(Level.SEVERE, null, ex);
                    }
                }
                data.setPoint(5 + data.getPoint());
                System.out.println("Giay duoc ban!");

                data.setHang(1);
                data.notifyAll();

            }
        }
    }
}
