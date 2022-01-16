/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author dinhh
 */
public class Lop implements Serializable{
    private int ma ;
    private String tenlop ;
    private int sosinhvien ;
    private static  int sma= 1000 ;

    public Lop() {
    }

    public Lop(int ma, String tenlop, int sosinhvien) {
        this.ma = ma;
        this.tenlop = tenlop;
        this.sosinhvien = sosinhvien;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTenlop() {
        return tenlop;
    }

    public void setTenlop(String tenlop) {
        this.tenlop = tenlop;
    }

    public int getSosinhvien() {
        return sosinhvien;
    }

    public void setSosinhvien(int sosinhvien) {
        this.sosinhvien = sosinhvien;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        Lop.sma = sma;
    }
     public Object[] toObjects() {
         return new Object[] {
             ma,tenlop,sosinhvien
         };
     }
}
