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
public class ChiaHet7 extends Thread {
    private ColorThread t;
    private int chiahet;
    
    public ChiaHet7(ColorThread t) {
        this.t = t;
    }
    @Override
    public void run() {
        chiahet = 0;
        while(true) {
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
            System.out.println(chiahet);
            chiahet += 7;
            if(chiahet == 77) {
                t.stop();
                break;
            }
        }
    }
}
