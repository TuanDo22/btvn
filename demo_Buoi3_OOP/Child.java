/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo_Buoi3_OOP;

/**
 *
 * @author TDZ
 */
public class Child extends Parent{

    @Override
    public void display() {
        System.out.println("Ba con");
    }
    
    public static void main(String[] args){
        Parent p = new Child();
        p.display();
    }
}
