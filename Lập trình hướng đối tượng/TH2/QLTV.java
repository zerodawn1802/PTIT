/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tailieu;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
/**
 *
 * @author phuon
 */
public class QLTV implements ChucNang{
    List<TaiLieu> list;
    Scanner sc = new Scanner(System.in);

    public QLTV() {
        list = new ArrayList<>();
        list.add(new Sach("A9001","Nhi Dong", 100, "Tshiba", "Yeu thuong", 182));
        list.add(new Sach("A9002","Nhi Dong", 50, "Maru", "Tu trai tim", 233));
        list.add(new Sach("A9003","Ha Noi", 60, "Maru", "Bau troi", 415));
        list.add(new Sach("A9004","Ha Noi", 70, "Maru", "Tinh yeu", 182));
        list.add(new Sach("A9005","Giao Duc", 80, "Tshiba", "Su nghiep", 233));
        list.add(new Sach("A9006","Nhi Dong", 90, "Maru", "Hanh phuc", 415));
        list.add(new TapChi("C9001","Thoi dai",10, 3, 8));
        list.add(new TapChi("C8001","Giao duc", 20,9,12));
        list.add(new Bao("B9101","Ha Noi", 1111, "20/10/2009"));
        list.add(new Bao("B5101","Thoi dai", 111, "20/10/2008"));
    }
    
    private TaiLieu tontai(String ma){
        for(TaiLieu i:list)
            if(i.getMa().equalsIgnoreCase(ma))
                return i;
        return null;
    }
    
    public TaiLieu nhap(){
        TaiLieu t=null;
        String ma,nxb;
        int soBan;
        String reg="^[A-Z]\\d{4}";
        while(true){
            System.out.print("Nhap ma tai lieu:");
            ma=sc.nextLine().toUpperCase();
            if(ma.matches(reg) && (tontai(ma)==null))
                break;
            System.err.println("Trung ma. Nhap lai!!!");
        }
        System.out.print("Nhap Nha xuat ban:");
        nxb=sc.nextLine();
        System.out.print("Nhap so ban phat hanh:");
        soBan=Integer.parseInt(sc.nextLine());
        t=new TaiLieu(ma, nxb, soBan);
        return t;
    }
    
    @Override
    public void nhapSach() {
        TaiLieu t = nhap();
        System.out.print("Nhap ten tac gia: ");
        String tacGia = sc.nextLine();
        System.out.print("Nhap ten sach: ");
        String tenSach = sc.nextLine();
        System.out.print("Nhap so trang: ");
        int soTrang = Integer.parseInt(sc.nextLine());
        list.add(new Sach(t.getMa(),t.getNxb(),t.getSoBan(),tacGia,tenSach,soTrang));
    }

    @Override
    public void nhapTapChi() {
        TaiLieu t = nhap();
        System.out.print("Nhap so phat hanh: ");
        int soPhatHanh = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap thang phat hanh: ");
        int thang = Integer.parseInt(sc.nextLine());
        list.add(new TapChi(t.getMa(),t.getNxb(),t.getSoBan(),soPhatHanh,thang));    
    }

    @Override
    public void nhapBao() {
        TaiLieu t = nhap();
        String reg = "^[0-3]?[0-9]/[0-3]?[0-9]/(?:[0-9]{2})?[0-9]{2}$";
        String ngayPhatHanh;
        while(true){
            System.out.print("Nhap ngay phat hanh: ");
            ngayPhatHanh = sc.nextLine();
            if(ngayPhatHanh.matches(reg)) break;
            System.err.println("Ngay thang nam khong hop le, vui long nhap lai!");
        }
        list.add(new Bao(t.getMa(),t.getNxb(),t.getSoBan(),ngayPhatHanh));
    }

    @Override
    public void inTaiLieu() {
        int sach =0;
        int tapchi = 0;
        int bao = 0;
        System.out.println("------Danh sach sach---------");
        for(TaiLieu i:list){
            if(i instanceof Sach){
                System.out.println(i);
                sach++;
            }
                
        }
        System.out.println("------Danh sach tap chi---------");
        for(TaiLieu i:list){
            if(i instanceof TapChi){
                System.out.println(i);
                tapchi++;
            }
        }
        System.out.println("------Danh sach bao---------");
        for(TaiLieu i:list){
            if(i instanceof Bao){
                System.out.println(i);
                bao++;
            }
        }
        
        System.out.println("Danh sach tat ca tai lieu la: ");
        for(TaiLieu i:list){
            System.out.println(i.toString());
        }
        System.out.println("-----------------------------");
        System.out.println("So luong cac loai tai lieu:");
        System.out.println("Sach: " + sach);
        System.out.println("Tap chi: " + tapchi);
        System.out.println("Bao: " + bao);
    }

    @Override
    public void sua() {
        System.out.print("Nhap ma can sua:");
        String ma=sc.nextLine();
        TaiLieu t=tontai(ma);
        if(t==null){
            System.out.println("Ma khong ton tai!!!");
        }else{
            int pos=list.indexOf(t);
            //nhap cac thu can sua
            System.out.print("Nhap nha xuat ban moi:");
            String nxb=sc.nextLine();
            System.out.print("Nhap so ban moi:");
            int soBan=Integer.parseInt(sc.nextLine());
            
            TaiLieu p=list.get(pos);
            p.setNxb(nxb);
            p.setSoBan(soBan);
            System.out.println("Sua thanh cong!!!");
        }
    }

    @Override
    public void xoa() {
        System.out.print("Nhap ma can xoa:");
        String ma=sc.nextLine();
        TaiLieu t=tontai(ma);
        if(t==null){
            System.out.println("Ma khong ton tai!!!");
        }else{
            list.remove(t);
            System.out.println("Xoa thanh cong!!!");
        }
    }

    @Override
    public void tkTheoMa() {
        System.out.print("Nhap ma can tim:");
        String ma=sc.nextLine();
        TaiLieu t=tontai(ma);
        if(t==null){
            System.out.println("Ma khong ton tai!!!");
        }else{
            System.out.println("Tim thanh cong: ");
            System.out.println(t);
        }
    }

    @Override
    public void tkTheoNxb() {
        System.out.print("Nhap nha xuat ban can tim:");
        String nxb = sc.nextLine();
        boolean co = false;
        for(TaiLieu i:list){
            if(i.getNxb().equals(nxb)){
                System.out.println(i);
                co = true;
            }
        }
        if(co==false){
            System.out.println("Khong co nha xuat ban can tim");
        }
    }

    @Override
    public void tkTheoTacGia() {
        System.out.print("Nhap tac gia can tim:");
        String tg = sc.nextLine();
        boolean co = false;
        for(TaiLieu i:list){
            if(i instanceof Sach){
                if(((Sach) i).getTacGia().trim().equals(tg.trim())){
                    System.out.println(i);
                }
            }
        }
        if(co==false){
            System.out.println("Khong co tac gia can tim");
        }
    }

    @Override
    public void tkTheoTenSach() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void tkTheoNgayPhatHanh() {
        System.out.print("Nhap ngay bat dau(dd/mm/yyyy): ");
        String tu = sc.nextLine();
        System.out.print("Nhap ngay ket thuc(dd/mm/yyyy): ");
        String den = sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date start=null;
        Date end=null;
        try {
            start = sdf.parse(tu);
            end = sdf.parse(den);
        } catch (ParseException ex) {
            Logger.getLogger(QLTV.class.getName()).log(Level.SEVERE, null, ex);
        }
        boolean co = false;
        for(TaiLieu i:list){
            if(i instanceof Bao){
                try {
                    Date date = sdf.parse(((Bao) i).getNgayPhatHanh());
                    if(date.after(start) && date.before(end)){
                        co = true;
                        System.out.println(i);
                    }
                } catch (ParseException ex) {
                    Logger.getLogger(QLTV.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        if(co == false){
            System.out.println("Khong co tai lieu nao trong khoang thoi gian do");
        }
    }

    @Override
    public void tkTheoThangPhatHanh() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void tkTheoSoTrang() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void tkTheoSoBan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sapxepTheoNxb() {
        list.sort(new Comparator<TaiLieu>() {
            @Override
            public int compare(TaiLieu o1, TaiLieu o2) {
                    return o1.getNxb().compareToIgnoreCase(o2.getNxb());
            }
        });
    }

    @Override
    public void sapxepTheoSoban() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sapxepTheoTacGia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sapxepTheoTenSach() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sapxepTheoSoTrang() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sapxepTheoNgayPhatHanh() {
        List<Bao>tmp = new ArrayList<>();
        for(TaiLieu i:list){
            if(i instanceof Bao){
                tmp.add((Bao)i);
            }
        }
        tmp.sort(new Comparator<Bao>() {
            @Override
            public int compare(Bao o1, Bao o2) {
                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                try {
                    //System.out.println("here");
                    return (sdf.parse(o1.getNgayPhatHanh()).compareTo(sdf.parse(o2.getNgayPhatHanh())));
                } catch (ParseException ex) {
                    Logger.getLogger(QLTV.class.getName()).log(Level.SEVERE, null, ex);
                }
                return 0;
            }
        });
        for(Bao i:tmp){
            System.out.println(i.toString());
        }
    }

    @Override
    public void demTongSoPhatHanh() {
        System.out.print("Tong so ban da phat hanh la: ");
        int sum = 0;
        for(TaiLieu i:list){
            sum+=i.getSoBan();
        }
        System.out.println(sum);
        //System.out.println(count);
    }
    public void demTongSoPhatHanhTungLoai() {
        List<Sach> listSach = new ArrayList<>();
        List<TapChi> listTapChi = new ArrayList<>();
        List<Bao> listBao = new ArrayList<>();
        for(TaiLieu i:list){
            if(i instanceof Sach){
                listSach.add((Sach) i);
            }
        }
        for(TaiLieu i:list){
            if(i instanceof TapChi){
                listTapChi.add((TapChi) i);
            }
        }
        for(TaiLieu i:list){
            if(i instanceof Bao){
                listBao.add((Bao) i);
            }
        }
        System.out.print("So ban da phat hanh cua sach la: ");
        int sum1 = 0;
        for(Sach i:listSach){
            sum1+=i.getSoBan();
        }
        System.out.println(sum1);
        
        System.out.print("So ban da phat hanh cua tap chi la: ");
        int sum2 = 0;
        for(TapChi i:listTapChi){
            sum2+=i.getSoBan();
        }
        System.out.println(sum2);
        System.out.print("So ban da phat hanh cua bao la: ");
        int sum3 = 0;
        for(Bao i:listBao){
            sum3+=i.getSoBan();
        }
        System.out.println(sum3);
    }
    public void demTongSachCuaTacGia() {
        List<Sach>listSach = new ArrayList<>();
        for(TaiLieu i:list){
            if(i instanceof Sach){
                listSach.add((Sach) i);
            }
        }
        Map<String,Long> count=listSach.stream().collect(
                Collectors.groupingBy(Sach::getTacGia,
                Collectors.counting()));
        System.out.println(count);
    }
}
