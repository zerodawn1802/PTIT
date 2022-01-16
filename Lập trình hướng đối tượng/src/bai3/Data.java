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
public class Data {
    private int index;
    private boolean running;
    private Vector<SinhVien> list;
    private SinhVien sinhVien;

    public Data() {
        index = 1;
        running = true;
        list = new Vector<>();
    }
    public int getIndex() {
        return index;
    }
    public void setIndex(int index) {
        this.index = index;
    }
    public boolean isRunning() {
        return running;
    }
    public void setRunning(boolean running) {
        this.running = running;
    }
    public Vector<SinhVien> getList() {
        return list;
    }
    public void setList(Vector<SinhVien> list) {
        this.list = list;
    }
    public SinhVien getSinhVien() {
        return sinhVien;
    }
    public void setSinhVien(SinhVien sinhVien) {
        this.sinhVien = sinhVien;
    }
}
