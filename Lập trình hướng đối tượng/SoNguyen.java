/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiemtra;

import java.util.Scanner;
/**
 *
 * @author vbh19
 */
public class SoNguyen {
    private int n;
    private int m;
    Scanner sc = new Scanner(System.in);

    public SoNguyen() {
    }
    
    public SoNguyen(int n, int m) {
        this.n = n;
        this.m = m;
    }
    
    public int getN() {
        return n;
    }
    
    public void setN(int n) {
        this.n = n;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }
    
    public void nhap() {
        n = sc.nextInt();
        m = sc.nextInt();
    }

    public int tinhTong() {
        return ((1+n)*n)/2;
    }
    
    public int uocChungLonNhat() {
        int a = n;
        int b = m;
        while (a!=b) {
            if(a > b) a-= b;
            else b -= a;
        }
        return a;
    }
    public int boiChungNhoNhat(int ucln) {
        return n*m/ucln;
    }
    
    public Boolean soNguyenTo(int number) {
        for (int i = 2; i*i <= number; i++) {
            if (number%i == 0) return false;
        }
        return number >= 2;
    }
    
    public void soNguyenToTuMDenN() {
        int start = n > m ? m : n;
        int end =  n > m ? n : m;
        for (int i = start; i <= end; i++) {
            if(soNguyenTo(i)) System.out.print(i + " ");
        }
        System.out.println();
    }

}
