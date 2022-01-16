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
public class Main {
    public static void main(String[] args) {
        ColorThread t1 = new ColorThread();
        ChiaHet7 t2 = new ChiaHet7(t1);
        
        t1.start();
        t2.start();
    }
}
