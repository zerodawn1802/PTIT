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
public class Baith1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        SoNguyen n = new SoNguyen();
        while(true){
            System.out.println("1. Nhap vao 2 phan so");
            System.out.println("2. Tinh tong 2 phan so A+B");
            System.out.println("3. Tinh hieu 2 phan so A-B");
            System.out.println("4. Nhap vao 1 so nguyen dương n");
            System.out.println("5. Liet ke cac so Fibo nho hon n la so nguyen to");
            System.out.println("6. Kiem tra xem n co phai so thuan nghich khong");
            System.out.println("7. Nhap vao ma tran vuong A");
            System.out.println("8. Dua ra cac hang chi co cac so duong chan");
            System.out.println("9. Tinh ma tran nghich dao A");
            int c;
            Scanner sc = new Scanner(System.in);
            c = Integer.parseInt(sc.nextLine());
            switch(c){
                case 0:
                    System.out.println("Exit");
                    System.exit(0);
//                case 1:
//                    n.Nhap();
//                    break;
//                case 2: 
//                    n.CacSoFiboLaSNT();
//                    break;
//                case 3:
//                    n.SoThuanNghich();
//                    break;
                case 4:
                    n.Nhap();
                    break;
                case 5: 
                    n.CacSoFiboLaSNT();
                    break;
                case 6:
                    n.SoThuanNghich();
                       
//                case 7:
//                    x.nhapBieuThuc();
//                    break;
//                case 8:
//                    x.ketQua();
//                    break;
//                default:
//                    System.out.println("Chon menu tu 0->9:");
            }
        }
    }
    
}
