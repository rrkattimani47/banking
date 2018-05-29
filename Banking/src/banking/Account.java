/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;
import java.util.Scanner;

public class Account {
    int accountNumber;
    double balance, amount;
    
    public void openAccount(){
        System.out.println("Enter Account number:");
        Scanner s=new Scanner(System.in);
        accountNumber=s.nextInt();
        balance=1000;
        System.out.println("Minimum balance is"+balance);
            
    }
    public void deposit(){
        System.out.println("Enter amount to be deposited:");
        Scanner s=new Scanner(System.in);
        amount=s.nextInt();
        balance=balance+amount; 
    }
    
    
    public void withdrawal(){
        System.out.println("Enter the amount to be withdawaed");
        Scanner s= new Scanner(System.in);
        amount=s.nextInt();
        
        if(balance>balance-1000){
            System.out.println("Insufficient Balance");
        }
        else
            balance=balance-amount;
        
    }
    

public void balanceEnquiry(){
            System.out.println("Account number:"+accountNumber);
            System.out.println("Balance:"+balance);
}

}
    


    
  
    
    
    
    

