/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;
import java.util.Scanner;
/**
 *
 * @author rashmikattimani47
 */
public class Banking {
public static void main(String[] args) {
        int choice;
        Account b=new Account();
        while(true){
            System.out.println("Enter choice\n1.Create\n2.Deposit\n3.Withdraw\n4.Balance Enquiry\n5.Exit\n");
            Scanner s=new Scanner(System.in);
            choice=s.nextInt();
            switch(choice){
                case 1:b.openAccount();
                        break;
                case 2:b.deposit();
                        break;
                case 3:b.withdrawal();
                        break;
                case 4:b.balanceEnquiry();
                        break;
                default:System.exit(0);
      
            }           
                
            }
        }
    }
    
    
   
       
    
    

