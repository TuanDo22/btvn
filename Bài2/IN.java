/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bài2;

/**
 *
 * @author TDZ
 */
import java.util.Scanner;
public class IN {
    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap thong so ");
        System.out.println("nhap so canh");
        double n = scanner.nextDouble();
        System.out.println("nhap do dai canh");
        double a = scanner.nextDouble();
        System.out.println("nhap do dai duong cao ");
        double h = scanner.nextDouble();
        Lồi l = new Lồi(n,a,h);
        System.out.println(l.C());
        System.out.println(l.S());
        System.out.println("nhap canh hinh vuong");
        double v = scanner.nextDouble();
        Vuông vuong = new Vuông(v);
        System.out.println(vuong.C());
        System.err.println(vuong.S());
        
        

                

        
    }
    
    
}
