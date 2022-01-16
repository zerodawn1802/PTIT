/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tailieu;

/**
 *
 * @author phuon
 */
public class TaiLieu {
    private String ma;
    private String nxb;
    private int soBan;
    
    public TaiLieu(){
        
    }
    
    public TaiLieu(String ma, String nxb, int soBan) {
        this.ma = ma;
        this.nxb = nxb;
        this.soBan = soBan;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getNxb() {
        return nxb;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }

    public int getSoBan() {
        return soBan;
    }

    public void setSoBan(int soBan) {
        this.soBan = soBan;
    }
    
}