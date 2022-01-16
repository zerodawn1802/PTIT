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
public class PhongHoc implements Serializable{
    private  int maphong ;
    private String tenphong , kieuphong ;
    private int soghe ;
    private static int smaphong = 10000;

    public PhongHoc() {
    }

    public PhongHoc(int maphong, String tenphong, String kieuphong, int soghe) {
        this.maphong = maphong;
        this.tenphong = tenphong;
        this.kieuphong = kieuphong;
        this.soghe = soghe;
    }

    public int getMaphong() {
        return maphong;
    }

    public void setMaphong(int maphong) {
        this.maphong = maphong;
    }

    public String getTenphong() {
        return tenphong;
    }

    public void setTenphong(String tenphong) {
        this.tenphong = tenphong;
    }

    public String getKieuphong() {
        return kieuphong;
    }

    public void setKieuphong(String kieuphong) {
        this.kieuphong = kieuphong;
    }

    public int getSoghe() {
        return soghe;
    }

    public void setSoghe(int soghe) {
        this.soghe = soghe;
    }

    public static int getSmaphong() {
        return smaphong;
    }

    public static void setSmaphong(int smaphong) {
        PhongHoc.smaphong = smaphong;
    }
     public Object[] toObjects() {
         return new Object[] {
             maphong,tenphong,soghe,kieuphong
         };
     }
}
