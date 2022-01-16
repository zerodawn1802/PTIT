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
public class Sach extends TaiLieu{
    private String tacGia;
    private String tenSach;
    private int soTrang;

    public Sach() {
    }

    public Sach(String ma, String nxb, int soBan, String tacGia, String tenSach, int soTrang ) {
        super(ma, nxb, soBan);
        this.tacGia = tacGia;
        this.tenSach = tenSach;
        this.soTrang = soTrang;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public String toString(){
        return getMa()+"\t"+getNxb()+"\t"+getSoBan()+"\t"+tacGia+"\t"+
                tenSach+"\t"+soTrang;
    }
}
