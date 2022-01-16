/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;
import java.util.Vector;
/**
 *
 * @author phuon
 */
public class Thread2 extends Thread{
    
    private Data d;

    Thread2(Data d) {
        this.d = d;
    }
    
    public void run(){
        synchronized(d){
            try {
                while(d.isRunning()){
                    if(d.getIndex() != 2){
                        d.wait();
                        if(d.isRunning() == false) break;
                    }
                    Vector<SinhVien> list = d.getList();
                    SinhVien sv = d.getSinhVien();
                    list.add(sv);
                    d.setList(list);
                    d.setIndex(3);
                    d.notifyAll();
                    d.wait();
                }
            } catch (Exception e) {
                e.printStackTrace();
            } 
        }
    }
}
