/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo_Buoi3_OOP;

/**
 *
 * @author TDZ
 */
public class Button {
    public void onClickListener(OnClickListener onClickListener){
        onClickListener.onclick();
        
    }
    public static void main(String[] args ){
        Button button = new Button();
        button.onClickListener(new OnClickListener(){
            @Override
            public void onclick() {
                
            }   
        });
        Button button1 = new Button();
        button1.onClickListener(new OnClickListener(){
            @Override
            public void onclick() {
                        }
            
        });     
    }
    
    
}
