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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PhanSo ps1 = null, ps2 = new PhanSo();
        XuLySoNguyen n = new XuLySoNguyen();
        MaTranVuong x = new MaTranVuong();
        //BieuThuc y = new BieuThuc();
        while(true){
            System.out.println("1. Nhap vao 2 phan so");
            System.out.println("2. Tong cua 2 phan so");
            System.out.println("3. Hieu cua 2 phan so");
            System.out.println("4. Nhap vao 1 so nguyen duong n");
            System.out.println("5. Day cac so Fibonacci nho hon n la so nguyen to");
            System.out.println("6. Kiem tra n co phai so thuan nghich khong");
            System.out.println("7. Nhap vao 1 ma tran vuong A");
            System.out.println("8. Cac hang chi co cac so duong chan");
            System.out.println("9. Ma tran nghich dao cua A");
            System.out.println("0. Exit");
            int c;
            Scanner sc = new Scanner(System.in);
            c = Integer.parseInt(sc.nextLine());
            switch(c){
                case 0:
                    System.out.println("Exit");
                    System.exit(0);
                case 1:
                    ps1.Nhap();
                    ps2.Nhap();
                    break;
                case 2: 
                    ps1.Tong2PhanSo(ps2);
                    break;
                case 3:
                    ps1.Hieu2PhanSo(ps2);
                    break;
                case 4:
                    n.Nhap();
                    break;
                case 5: 
                    n.CacSoFiboLaSNT();
                    break;
                case 6:
                    n.SoThuanNghich();
                    break;
                case 7:
                    x.Nhap();
                    break;
                case 8:
                    x.CheckR();
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Chon menu tu 0->9:");
            }
        }
    }
    
}
