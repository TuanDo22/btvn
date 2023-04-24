/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bài3;

/**
 *
 * @author TDZ
 */
import java.util.Scanner;
public class ATM {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int maxUser;
        // ham gioi han
        do{
            System.out.println("nhap max");
            maxUser = scanner.nextInt(); scanner.nextLine();
        }while(maxUser > 10);
        
        Account[] user = new Account[maxUser];
        
        for(int i = 0; i < maxUser ; i ++){
        System.out.println("Nhap thong tin dang nhap");
        System.out.println("Nhập username");
        String userName = scanner.nextLine();
        System.out.println("Nhap password");
        String passWord = scanner.nextLine();
        System.out.println("Nhap amount");
        Double Amount = scanner.nextDouble(); scanner.nextLine();
        Account account = new Account(userName , passWord , Amount);
        user[i] = account ;
        };
        // ham check
        boolean check = true ;
        // ham su dung tai khoan
        Account save = null;
        
        while(check){
            System.out.println("Ten Dang Nhap");
            String userName = scanner.nextLine();
            System.out.println("Mat Khau"); 
            String passWord = scanner.nextLine();
            // check tai khoan
            for(Account i: user){
                if(i.getUsername().equals(userName) && i.getPassword().equals(passWord)){
               
                    check = false ;
                    save = i ;
                    break ;
                    
                    
                }
                if(!check){
                    System.out.println("khong ton tai tai khoan");
                }
                System.out.println("Dang nhap thanh cong");
            }
            
            boolean choice = true ; 
            while(choice){
                System.out.println("1.Rut tien");
                System.out.println("2.Xem so du");
                System.out.println("3.Thoat");
                int a = scanner.nextInt(); scanner.nextLine();
                // cac lua chon 
            switch(a){
            
                case 1:
                    System.out.println("Nhap so tien can rur");
                    double withdrawAmount = scanner.nextDouble();scanner.nextLine();
                  
                    if(withdrawAmount > save.getAmount()){
                        
                        System.out.println("so tien trong tai khoan k du");                     
                    }
                    else{
                        save.withdraw(withdrawAmount);
                        System.out.println(" rut tien thanh cong ");
                }
                    break;
                case 2:
                     System.out.println("so tien con lai la" + save.getAmount() );
                     break;
                case 3:
                    choice = false ;
                    System.out.println("ket thuc chuong trinh");
                    break ;
                default:
                    System.out.println(" chi lua chon tu 1->3 ");
                    break ;
            }
            
        }
         }
            }
    }

