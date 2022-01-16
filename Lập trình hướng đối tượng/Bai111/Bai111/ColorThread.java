/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai111;

/**
 *
 * @author manhd
 */
public class ColorThread extends Thread {
    @Override
    public void run() {
        int i = 0;
        while(true) {
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
            switch (i) {
                case 0:
                    System.out.println("\033[31m" + "do");
                    break;
                case 1:
                    System.out.println("\033[33m" + "vang");
                    break;
                default:
                    System.out.println("\033[32m" + "xanh");
                    break;
            }
            i++;
            if(i == 3) i = 0;
        }
    }
}
