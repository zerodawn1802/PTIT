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
public class XeMay extends PTGT implements TinhGia{
    //công suất
    private double congsuat;

    public XeMay() {
    }

    public XeMay( String ma, String hang, int nam, double gia, 
            String mau,double congsuat) {
        super(ma, hang, nam, gia, mau);
        this.congsuat = congsuat;
    }

    public double getCongsuat() {
        return congsuat;
    }

    public void setCongsuat(double congsuat) {
        this.congsuat = congsuat;
    }
    
    
    
    @Override
    public double layGia() {
        double t=super.getGia();
        if((2021-super.getNam())>=2){
            return (t*0.95);
        }else
            return t;
    }
    public String toString(){
        return getMa()+"\t"+getHang()+"\t"+getNam()+"\t"+layGia()+"\t"+
                getMau()+"\t"+congsuat;
    }
}
