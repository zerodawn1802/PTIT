/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Thread2 extends Thread {

    Data data;

    Thread2(Data data) {
        this.data = data;
    }

    @Override
    public void run() {

        synchronized (data) {
            data.notifyAll();
            while (true) {
                while (data.isStop == false && data.getHang() != 2) {
                    try {
                        data.wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(bai3.Thread1.class.getName())
                                .log(Level.SEVERE, null, ex);
                    }
                }
                data.setPoint(data.getPoint() + 10);
                System.out.println("Tui da ban");
                data.setHang(1);
                data.notifyAll();

            }
        }

    }

}
