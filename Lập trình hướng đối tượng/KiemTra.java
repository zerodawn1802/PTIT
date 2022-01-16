
package kiemtra;

import java.util.Scanner;

public class KiemTra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SoNguyen sn = new SoNguyen();
        DaySoNguyen dsn = new DaySoNguyen();
        MaTranVuong mtv = new MaTranVuong();
        while (true) {
            System.out.println("----------------------------------------------");
            System.out.println("MENU:");
            System.out.println("1. Nhập vào 2 số nguyên dương m và n");
            System.out.println("2. Đưa ra ước chung lớn nhất và bội chung nhỏ nhất");
            System.out.println("3. Đưa ra các số nguyên tố từ m đến n");
            System.out.println("4. Nhập vào 1 dãy số nguyên");
            System.out.println("5. Đưa ra giá trị lớn nhất, nhỏ nhất");
            System.out.println("6. Đưa ra số lần xuất hiện của mỗi phần tử");
            System.out.println("7. Nhập vào 1 ma trận vuông");
            System.out.println("8. Viết ra ma trận chuyển vị");
            System.out.println("9. Đưa ra hàng hoặc cột có tổng giá trị các số lớn nhất");
            System.out.println("0. Thoát");
            System.out.println("----------------------------------------------");
            System.out.print("Nhập lựa chọn: ");
            int choice = Integer.parseInt(sc.nextLine());
            System.out.println();
            switch(choice) {
                case 1:
                    System.out.print("Nhập số nguyên m và n: ");
                    sn.nhap();
                    break;
                case 2:
                    int ucln = sn.uocChungLonNhat();
                    int bcnn = sn.boiChungNhoNhat(ucln);
                    System.out.println("Ước chung lớn nhất là: " + ucln);
                    System.out.println("Bội chung nhỏ nhất là là: " + bcnn);
                    break;
                case 3:
                    System.out.print("Số nguyên tố từ m đến n: ");
                    sn.soNguyenToTuMDenN();
                    break;
                case 4:
                    System.out.println("Số một dãy số nguyên: ");
                    dsn.nhap();
                    break;
                case 5:
                    int min = dsn.giaTriNhoNhat();
                    int max = dsn.giaTriLonNhat();
                    System.out.println("Giá trị lớn nhất và nhỏ nhất: " + max + " " + min);
                    break;
                case 6:
                    System.out.println("Số lần xuất hiện: ");
                    dsn.soLanXuatHien();
                    break;
                case 7:
                    System.out.println("Số một ma trận vuông: ");
                    mtv.nhap();
                    break;
                case 8:

                    break;
                case 9:
                    System.out.println("tổng giá trị các số lớn nhất : "+ mtv.tongCotHoacHangLonNhat());
                    break;
                case 0:
                    System.out.println("Bye!!!!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("only to choose (0->4)");
            }
        }
    }
    
}
