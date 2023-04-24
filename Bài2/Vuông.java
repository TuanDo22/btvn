/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bài2;

/**
 *
 * @author TDZ
 */
public class Vuông implements Tính{
    // chieu dai
    private double v ;

    public Vuông(double v) {
        this.v = v;
    }
    
 

    @Override
    public double C() {
        return 4*v;
        }

    @Override
    public double S() {
        return v*v;
    }
    
    
}
