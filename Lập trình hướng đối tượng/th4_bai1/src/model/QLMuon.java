/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author HUY PHAM
 */
public class QLMuon implements Serializable {
    private BanDoc banDoc;
    private Sach sach;
    private int soLuong;
    private String tinhTrang;

    public QLMuon() {
    }

    public QLMuon(BanDoc banDoc, Sach sach, int soLuong, String tinhTrang) {
        this.banDoc = banDoc;
        this.sach = sach;
        this.soLuong = soLuong;
        this.tinhTrang = tinhTrang;
    }

    public BanDoc getBanDoc() {
        return banDoc;
    }

    public void setBanDoc(BanDoc banDoc) {
        this.banDoc = banDoc;
    }

    public Sach getSach() {
        return sach;
    }

    public void setSach(Sach sach) {
        this.sach = sach;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
    public Object[] toObject(){
        return new Object[]{
            banDoc.getMa(),banDoc.getHoten(),sach.getMa(),sach.getTen(),soLuong,tinhTrang
        };
    }
}
