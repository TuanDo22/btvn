/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

/**
 *
 * @author TDZ
 */
import java.util.Scanner;
public class IN {
    public static void main(String[] args){
      
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap a");
        double a = scanner.nextDouble();
        System.out.println("nhap b");
        double b = scanner.nextDouble();
        Caculator p = new Caculator(a,b);
        System.out.println(p.tong());
        System.out.println(p.hieu());
        System.out.println(p.nhan());
        System.out.println(p.chia());
    }
    
}
