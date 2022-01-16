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
        DaySoThuc st = new DaySoThuc();
        Xau s = new Xau();
        BieuThuc x = new BieuThuc();
        //BieuThuc y = new BieuThuc();
        while(true){
            System.out.println("1. Nhap day so thuc");
            System.out.println("2. Viet ra phan tu nho nhat cua so");
            System.out.println("3. Sap xep va dua ra day so giam dan");
            System.out.println("4. Nhap vao 1 doan van ban");
            System.out.println("5. Dua ra so cau");
            System.out.println("6. Chuan hoa va viet ra");
            System.out.println("7. Nhap vao 1 da thuc");
            System.out.println("8. Tinh Pn(x) + Qm(x)");
            System.out.println("9. Tinh P^n(x)/Q^m(x) va da thuc du");
            int c;
            Scanner sc = new Scanner(System.in);
            c = Integer.parseInt(sc.nextLine());
            switch(c){
                case 0:
                    System.out.println("Exit");
                    System.exit(0);
                case 1:
                    st.Nhap();
                    break;
                case 2: 
                    st.Min();
                    break;
                case 3:
                    st.Sapxep();
                    break;
                case 4: 
                    s.NhapXau();
                    break;
                case 5:
                    s.DuaRaSoCau();
                    break;
                case 6:
                    s.ChuanHoa();
                    break;
                case 7:
                    x.nhapBieuThuc();
                    break;
                case 8:
                    x.ketQua();
                    break;
                default:
                    System.out.println("Chon menu tu 0->9:");
            }
        }
    }
    
}
