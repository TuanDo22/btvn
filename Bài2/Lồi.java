/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bài2;

/**
 *
 * @author TDZ
 */
public class Lồi implements Tính {
    //n là số cạnh
    private double n ;
    //a là độ dài cạnh
    private double a;
    //độ dài đường cao
    private double h;

    public Lồi(double n, double a, double h) {
        this.n = n;
        this.a = a;
        this.h = h;
    }
    

    
    

    @Override
    public double C() {
        return n*a;
        
        }

    @Override
    public double S() {
        return ((1*a*n*h)/2);
    }

    
    
}
