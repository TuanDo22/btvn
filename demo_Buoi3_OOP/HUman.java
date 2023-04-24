/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo_Buoi3_OOP;

/**
 *
 * @author TDZ
 */
public class HUman implements inter_face { 

    @Override
    public void eat() {
        System.out.println("An ");
    }

    @Override
    public void sleep() {
        System.out.println("ngu ");
        
    }

    @Override
    public void walk(){
            System.out.println("di bo ");
    }

    @Override
    public void talk(){
        System.out.println("noi ");
    };
    
}
