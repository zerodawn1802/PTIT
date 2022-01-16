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
public class BieuThuc {
    int[] heSo;//Heso[0] + HeSo[1]*x +HeSo[2]*x^2 +...+HeSo[n]*x^n
    int n;//Bậc của biểu thức
    public BieuThuc(){ 
    }
    public BieuThuc(int n){
        heSo = new int[n+1];
        this.n=n;
    }
    public void nhapBieuThuc(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap bac cua da thuc: ");
        n=Integer.parseInt(sc.nextLine());
        System.out.println("Nhap cac He So cua da thuc");
        heSo = new int[n+1];
        for (int i=0;i<=n;i++){
            System.out.print("HeSo["+i+"] = ");
            heSo[i] = Integer.parseInt(sc.nextLine());
        }
        for (int i=n;i>=0;i--){
            System.out.print(heSo[i]+"*x^"+i);
            if (i!=0) System.out.print(" + ");
        }
        System.out.println("");
    }
    
    public void show(){
        for (int i=n;i>=0;i--){
            System.out.print(heSo[i]+"*x^"+i);
            if (i!=0) System.out.print(" + ");
        }
        System.out.println("");
    }
    
    BieuThuc getDaoHam(){ 
        BieuThuc x= new BieuThuc(Math.max(n-1, 0));
        for (int i=1;i<=this.n;i++){
            x.heSo[i-1]=(this.heSo[i]*i);
        }
        return x;
    }
    BieuThuc add(BieuThuc b){
        BieuThuc kq = new BieuThuc(Math.max(n, b.n));
        for (int i=0;i<=kq.n;i++){
            if (i<=this.n && i<=b.n){
                kq.heSo[i]=this.heSo[i]+b.heSo[i];
            }else if (i<=this.n){
                kq.heSo[i]=this.heSo[i];
            } else{
                kq.heSo[i]=b.heSo[i];
            }
        }
        return kq;
    }
    
    public void ketQua(){
        BieuThuc x = new BieuThuc();
        x.nhapBieuThuc();
        System.out.println("Nhap vao da thuc cong: ");
        BieuThuc y = new BieuThuc();
        y.nhapBieuThuc();
        
        System.out.println("Ket qua cua da thuc cong: ");
        x.add(y).show();
    }
}
