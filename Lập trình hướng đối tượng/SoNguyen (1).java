/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baith1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SoNguyen {
    private long n;
    private long[] a = new long[93];
    
    public void Nhap(){
        System.out.print("Nhap vao so nguyen duong n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextLong();
    }
    
    public boolean isPrime(long n){
        if (n<2)   
            return true;
        for (int i=2;i<=Math.sqrt(n); i++){
            if (n%i==0)
                return false;
        }
        return true;
    }
    
    public void Fibo(){
        a[1] = 1; a[2]= 2;
        for (int i = 3; i<=92; i++)
            a[i] = a[i-1] + a[i-2];
    }
    
    public void CacSoFiboLaSNT(){
        Fibo();
        System.out.print("So Fibo < n: ");
        for (int i=1; i<=92;i++){
            if (a[i]>=n){
                 System.out.println("");
                 return;
            }
            if (isPrime(a[i]) == true) System.out.print(a[i]+ " ");
        }
    }
    
    public void SoThuanNghich(){
        long m = n;
        long res = 0;
        while (n!=0){
            res =res*10+ n%10;
            n/=10;
        }
        if (res == m) System.out.println("N la so thuan nghich");
        else System.out.println("N khong phai la so thuan nghich");
    }
}
