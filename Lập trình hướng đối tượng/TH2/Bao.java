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
public class Bao extends TaiLieu{
    private String ngayPhatHanh;

    public Bao() {
        
    }

    public Bao(String ma, String nxb, int soBan,String ngayPhatHanh ) {
        super(ma, nxb, soBan);
        this.ngayPhatHanh = ngayPhatHanh;
    }
    
    public String toString(){
        return getMa()+"\t"+getNxb()+"\t"+getSoBan()+"\t"+ngayPhatHanh;
    }

    public String getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(String ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }
}
