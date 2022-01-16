/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baith1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class DaySoThuc {
    private double[] a;
    private int n;
    
    public DaySoThuc(){
        this.n = n;
    }
    
    public void Nhap(){
        System.out.print("Nhap vao so phan tu n = ");
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.nextLine());
        a = new double[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextDouble();
        System.out.println("Day vua nhap la:");
        for (double value :a)
            System.out.print(value+ " ");
        System.out.println("");
    }
    
    public void Min(){
        double min = a[0];
        for (double value :a){
            if (value < min)
                min = value;
        }
        System.out.println("Min = "+ min);
    }
    
    public void Sapxep(){
         System.out.println("Day so thuc ban dau:"+Arrays.toString(a));
         for (int i = 0; i < a.length; i++) {
             for (int j = i+1; j < a.length; j++) {
                 if(a[i]<a[j]){
                     double t=a[i];
                     a[i]=a[j];
                     a[j]=t;
                 }
             }
         }
         System.out.println("Day so thuc da sap xep giam dan:"+Arrays.toString(a));
     }
}
