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
public class Xau {
    private String s;
    public Xau(){
        
    }
    
    public void NhapXau(){
        System.out.print("Nhap vao 1 xau: ");
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine().trim();
    }
    
    public void DuaRaSoCau(){
        String[] a = s.split("[\\.\\?\\!]");
        System.out.println("So cau trong xau la: " + a.length);         
    }
   public void ChuanHoa(){
        String s1 = s.replaceAll("( )+"," ");
        s1 = s1.toLowerCase();
        String res ="";
        String[] tmp = s1.split(" ");
        for(String i:tmp){
            int check=0;
            if (res.length()!=0)
            if (res.charAt(res.length()-1)=='.'||res.charAt(res.length()-1)=='?'||res.charAt(res.length()-1)=='!'){
                check=1;
            }
            
            res += i.toUpperCase().charAt(0);
            
            if(i.length()>1){
                res+=i.toLowerCase().substring(1);
                if (check==0){
                    res+=" ";
                }
            }
        }
        System.out.println("Xau sau khi chuan hoa la: ");
        System.out.println(res.trim());
    }
    
}
