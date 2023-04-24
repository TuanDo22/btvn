/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

/**
 *
 * @author TDZ
 */
public class Caculator {
    private double a;
    private double b;

    public Caculator(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public double tong(){
        return a+b;
    }
    public double hieu(){
        return a-b;
    }
    public double nhan(){
        return a*b;
    }
    public double chia(){
        if(b==0){
            System.out.println("khong the thuc hien phep tinh");
            
        }else{
            return a/b;
        }
        
    }
        
   
}
