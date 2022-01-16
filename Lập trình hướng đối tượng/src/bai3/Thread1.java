/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author phuon
 */
public class Thread1 extends Thread{
    private Data d; 
    BufferedReader br;
    private String fileName = "src/bai3/sinhvien.txt";
    
    Thread1(Data d) {
        this.d = d;
        try {
            br = new BufferedReader(new FileReader(fileName));
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    
    public void run(){
        synchronized(d){
            try {
                while(d.isRunning()){
                    if(d.getIndex() != 1){
                        d.wait();
                    }
                    String line = br.readLine();
                    if(line == null){
                        d.setRunning(false);
                        d.notifyAll();
                        break;
                    }
                    String[] lines = line.trim().split(";");
                    String name = lines[0];
                    String[] diem = lines[1].trim().split(" +");
                    double toan = Double.parseDouble(diem[0]);
                    double ly = Double.parseDouble(diem[1]);
                    double hoa = Double.parseDouble(diem[2]);
                    d.setSinhVien(new SinhVien(name, toan, ly, hoa));
                    d.setIndex(2);
                    d.notifyAll();
                    d.wait();
                }
                br.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } 
    }
}
