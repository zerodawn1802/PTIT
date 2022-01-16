/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

/**
 *
 * @author phuon
 */
public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        int[] arr = new int[20000];
        Arrays.fill(arr , 1);
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader("src/Bai2/InPut.txt"));
            FileWriter fw = new FileWriter("src/Bai2/OutPut.txt");
            String line = null;
            while((line = br.readLine()) != null) {
                line = line.trim();
                line = line.replaceAll("  ", " ");
                line = line.toLowerCase();
                String result[] = line.split(" ");
                String tmp = "";
                tmp += result[result.length - 1];
                for(int i=0 ; i<result.length-1; i++) {
                     tmp += String.valueOf(result[i].charAt(0));
                }
                if(!list.contains(tmp)) list.add(tmp);
                else {
                    String res = tmp;
                    tmp += String.valueOf(arr[list.indexOf(res)]);
                    arr[list.indexOf(res)] ++;
                }
                    tmp += "@ptit.edu.vn";
                    fw.write(tmp + "\n");
            }
            fw.close();
        } catch(FileNotFoundException e) {
            System.out.println(e);
        } catch(IOException e) {
            System.out.println(e);
        }
    }
}