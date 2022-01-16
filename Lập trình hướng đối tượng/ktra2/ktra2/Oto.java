/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktra2;

/**
 *
 * @author ADMIN
 */
public class Oto extends PTGT implements TinhGia{
    //động cơ, số chỗ
    private String dongco;
    private int socho;

    public Oto() {
    }

    public Oto(String ma, String hang, int nam, double gia,
            String dongco, int socho, 
            String mau) {
        super(ma, hang, nam, gia, mau);
        this.dongco = dongco;
        this.socho = socho;
    }

    public String getDongco() {
        return dongco;
    }

    public void setDongco(String dongco) {
        this.dongco = dongco;
    }

    public int getSocho() {
        return socho;
    }

    public void setSocho(int socho) {
        this.socho = socho;
    }
    
    
    
    @Override
    public double layGia() {
        double t=super.getGia();
        if((2021-super.getNam())>=2){
            return (t*0.85);
        }else
            return t;
    }
    public String toString(){
        return getMa()+"\t"+getHang()+"\t"+getNam()+"\t"+layGia()+"\t"+
                getMau()+"\t"+socho;
    }
}
