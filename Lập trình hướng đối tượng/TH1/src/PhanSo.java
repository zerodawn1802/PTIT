/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baith1;

import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class PhanSo {
    private int tu, mau;
    public PhanSo(){
    }
    public PhanSo(int tu, int mau){
        this.tu = tu;
        this.mau = mau;
    }
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        tu = sc.nextInt();
        mau = sc.nextInt();
    }
    public int getTU() {
        return tu;
    }

    public int getMAU() {
        return mau;
    }
    private int gcd() {
        int a = tu;
        int b = mau;
        while(b > 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public void rutgon() {
        int t = gcd();
        tu =  tu / t;
        mau = mau / t;
    }

    public void Tong2PhanSo (PhanSo ps1) {
        int x = tu * ps1.getMAU() + mau * ps1.getTU();
        int y = mau * ps1.getMAU();
        PhanSo res = new PhanSo(x , y);
        res.rutgon();
        System.out.println(res.tu + "/" + res.mau);
    }

    public void Hieu2PhanSo (PhanSo ps2) {
        int x = tu * ps2.getMAU() - mau * ps2.getTU();
        int y = mau * ps2.getMAU();
        int tmp;
        if(x < 0) tmp = -x;
        else tmp = x;
        PhanSo res = new PhanSo(tmp , y);
        res.rutgon();
        if(x < 0) System.out.println("-" + res.tu + "/" + res.mau);
        else System.out.println(res.tu + "/" + res.mau);
    }
}
