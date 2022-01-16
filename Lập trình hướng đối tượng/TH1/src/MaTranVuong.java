/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baith1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author phuon
 */
public class MaTranVuong {
    private int n;
    private double[][] a;
    public MaTranVuong(){
        
    }
    public MaTranVuong(int n)
    {
        this.n = n;
        this.a = new double[n][n];
    }
    public void Nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        n = Integer.parseInt(sc.nextLine());
        a = new double[n][n];
        for (int i=0; i<n; i++)
        {
            System.out.print("Nhap hang "+(i+1)+" : ");
            for (int j=0; j<n; j++)
                a[i][j] = Double.parseDouble(sc.next());
        }        
    }
    
    public void CheckR() {
        int[] hang = new int[n];
        boolean check = true;
        for (int i = 0; i < n; i++) {
            hang[i] = 1;
            for (int j = 0; j < n; j++) {
                if(a[i][j]%2!=0 || a[i][j]<0) {
                    hang[i] = 0;
                    break;
                }
            }
            if(hang[i]==1) check = false;
        }
        if(check) {
            System.out.println("Khong co");
        }
        else {
            System.out.print("Cac hang chi co so duong chan: " );
            for (int i = 0; i < n; i++) {
                if(hang[i]==1) System.out.print((i+1)+" ");
            }
            System.out.println("");
        }
    }
}
