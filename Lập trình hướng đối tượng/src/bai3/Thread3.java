/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

/**
 *
 * @author phuon
 */
public class Thread3 extends Thread{
    
    private Data d;

    Thread3(Data d) {
        this.d = d;
    }
    
    public void run(){
        synchronized(d){
            try {
                while(d.isRunning()){
                    if(d.getIndex() != 1){
                        d.wait();
                    }
                    SinhVien sv = d.getList().lastElement();
                    double gpa = (sv.getToan() + sv.getLy() + sv.getHoa()) /3;
                    sv.setGpa(gpa);
                    String xepLoai;
                    if(gpa <5) xepLoai = "Yeu";
                    else if(gpa < 6.5) xepLoai = "Trung Binh";
                    else if(gpa < 8) xepLoai = "Kha";
                    else xepLoai = "Gioi";
                    sv.setXepLoai(xepLoai);
                    System.out.println(sv.getName() + "; Xep Loai: " + sv.getXepLoai());
                    d.setIndex(1);
                    d.notifyAll();
                    d.wait();
                    sleep(1000);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
