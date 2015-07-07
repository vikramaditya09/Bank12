/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking; 
import java.util.LinkedList;
import java.util.List;
import java.lang.String;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
/**
 *
 * @author vikramaditya.tanwar
 */

public class Customer implements Comparator<Customer>,Comparable<Customer> {
    String AccountType;
    String CustomerName;
    String Address;
    int AccountId;

    public Customer() {
    }

    public Customer(String AccountType,String CustomerName, String Address, int AccountId) {
        this.AccountType = AccountType;
        this.CustomerName = CustomerName;
        this.Address = Address;
        this.AccountId = AccountId;
    }
  
      
      
  
    public String getAccountType() {
        return AccountType;
    }

    public void setAccountType(String AccountType) {
        this.AccountType = AccountType;
    }
 
    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public int getAccountId() {
        return AccountId;
    }

    public void setAccountId(int AccountId) {
        this.AccountId = AccountId;
    }
   
   
    void set(int t){
         Scanner in = new Scanner(System.in); 
         ;
         switch(t)
         {
             case 1:setAccountType(AccountType="Checkin");
                    setCustomerName(CustomerName=in.nextLine());
                    setAddress(Address=in.nextLine());
                    setAccountId(AccountId=in.nextInt()*21);
                    break;
             case 2:setAccountType(AccountType="Savings");
                    setCustomerName(CustomerName=in.nextLine());
                    setAddress(Address=in.nextLine());
                    setAccountId(AccountId=in.nextInt()*23);
                    break;
             case 3:setAccountType(AccountType="Business");
                    setCustomerName(CustomerName=in.nextLine());
                    setAddress(Address=in.nextLine());
                    setAccountId(AccountId=in.nextInt()*25);
                    break;
                 
         }
    }
    
    void display1(){
     

     System.out.print("Details entered for the new customer \n");
     System.out.print(" \n Account Type: " + getAccountType());
     System.out.print(" \n customer name: " + getCustomerName());
     System.out.print(" \n customer address: " + getAddress());
     System.out.print(" \n customer Account Id " + getAccountId());
     
     
     
     
    }
  
    @Override
    public int compare(Customer c,Customer c2){
        return c.AccountId-c2.AccountId;
    }

    @Override
    public int compareTo(Customer c) {
        return(this.CustomerName).compareTo(c.CustomerName); //To change body of generated methods, choose Tools | Templates.
    }
  
   
}
    
   
