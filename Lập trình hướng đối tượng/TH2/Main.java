/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tailieu;
import java.util.Scanner;
/**
 *
 * @author phuon
 */
public class Main {
    public static void main(String[] args) {
        QLTV qlTaiLieu=new QLTV();
        while(true){
            System.out.println("------MENU-------");
            System.out.println("1. Nhap sach ");
            System.out.println("2. Nhap tap chi ");
            System.out.println("3. Nhap bao");
            
            System.out.println("4. In danh sach tai lieu");
            System.out.println("5. Sua tai lieu");
            System.out.println("6. Xoa tai lieu");
            
            System.out.println("7. Tim theo ma");
            System.out.println("8. Tim theo NXB");
            System.out.println("9. Tim theo tac gia");
            
            System.out.println("10. Tim theo khoang ngay phat hanh");
            System.out.println("11. Sap xep theo NXB");
            System.out.println("12. Sap xep theo ngay phat hanh");
            System.out.println("13. Dem theo so ban");
            System.out.println("14. Dem theo so ban tung loai");
            System.out.println("15. Tong theo Tac gia");
            
            System.out.println("0. Thoat");
            System.out.println("-----------------");
            System.out.print("Ban chon: ");
            int chon;
            Scanner in=new Scanner(System.in);
            chon=in.nextInt();
            switch(chon){
                case 0:System.out.println("Thanks for using!");
                       System.exit(0);//safe exit
                case 1:qlTaiLieu.nhapSach();
                       break;
                case 2:qlTaiLieu.nhapTapChi();
                       break;
                case 3:qlTaiLieu.nhapBao();
                       break;
                case 4:qlTaiLieu.inTaiLieu();
                       break; 
                case 5:qlTaiLieu.sua();
                       break; 
                case 6:qlTaiLieu.xoa();
                       break;
                case 7:qlTaiLieu.tkTheoMa();
                       break;
                case 8:qlTaiLieu.tkTheoNxb();
                       break;
                case 9:qlTaiLieu.tkTheoTacGia();
                       break;
                case 10:qlTaiLieu.tkTheoNgayPhatHanh();
                       break;
                case 11:qlTaiLieu.sapxepTheoNxb();
                        qlTaiLieu.inTaiLieu();
                        break;
                case 12:qlTaiLieu.sapxepTheoNgayPhatHanh();
                        break;
                case 13:qlTaiLieu.demTongSoPhatHanh();
                        break;
                case 14:qlTaiLieu.demTongSoPhatHanhTungLoai();
                        break;
                case 15:qlTaiLieu.demTongSachCuaTacGia();
                        break;
            }
        }
    }
}
