/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiemtra;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author vbh19
 */
public class DaySoNguyen {
    private int[] A = new int[100];
    private int n;
    Scanner sc = new Scanner(System.in);
    public DaySoNguyen() {
        
    }
    public void nhap() {
        System.out.println("Nhập n: ");
        n = sc.nextInt();
        System.out.print("Nhập các phần tử: ");
        for (int i = 0; i < n; i++) A[i] = sc.nextInt();
    }
    public int giaTriLonNhat() {
        int max = -999999;
        for (int i = 0; i < n; i++) {
            if (A[i] > max) max = A[i];
        }
        return max;
    }
    public int giaTriNhoNhat() {
        int min = 999999;
        for (int i = 0; i < n; i++) {
            if (A[i] < min) min = A[i];
        }
        return min;
    }
        public void soLanXuatHien() {
            int[] B = new int[100000];
            Arrays.fill(B, 0);
            for (int i = 0; i < n ; i++) B[A[i]]++;
            int min = giaTriNhoNhat();
            int max = giaTriLonNhat();
            for (int i = min; i <= max ; i++) {
                if(B[i] > 0) System.out.println("So "+i+" xuat hien "+B[i]+" lan");
            }
        }
}
