/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

/**
 *
 * @author phuon
 */
public class Main {
    public static void main(String[] args) {
        Data d = new Data();
        Thread1 t1 = new Thread1(d);
        Thread2 t2 = new Thread2(d);
        Thread3 t3 = new Thread3(d);
        t1.start();
        t2.start();
        t3.start();
        
    }
}
