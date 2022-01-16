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
public class MaTranVuong {
    private int n;
    private int[][] A = new int[100][100];
    Scanner sc = new Scanner(System.in);
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    public void nhap() {
        System.out.println("Nhập n: ");
        n = sc.nextInt();
        System.out.println("Nhập ma trận: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) A[i][j] = sc.nextInt();
        }
    }
    public int tongCotHoacHangLonNhat() {
        int maxHang = -9999999;
        int maxCot = -9999999;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) sum+=A[i][j];
            if (sum > maxHang) maxHang = sum;
        }
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) sum+=A[j][i];
            if (sum > maxCot) maxCot = sum;
        }
        return maxHang > maxCot ? maxHang : maxCot;
    }
}
