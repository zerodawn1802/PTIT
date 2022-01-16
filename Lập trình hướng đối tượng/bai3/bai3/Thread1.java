/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Thread1 extends Thread {

    Data data;

    public Thread1(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        SimpleDateFormat f = new SimpleDateFormat("hh:mm:ss");
        synchronized (data) {
            int dem = 0;
            while (true) {
                if (dem == 20) {
                    break;
                }
                Date d = new Date();
                dem++;
                while (data.isStop == false && data.getHang() != 1) {
                    try {
                        data.wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(bai3.Thread1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                if (d.getSeconds() % 2 != 0) {
                    data.setHang(3);
                    System.out.println("Xuat giay");
                } else {
                    data.setHang(2);
                    System.out.println("Xuat tui");
                }

                data.notifyAll();

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("Tong tien:" + data.point);
        }

    }
}
