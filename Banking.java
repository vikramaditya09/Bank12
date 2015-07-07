/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

import java.util.Scanner;
import java.util.*;
import java.util.Collections;
import java.util.Comparator;

public class Banking {
     String name="NA";
   static int x=0;
    public static void main(String[] args) {
        ArrayList<Customer> list = new ArrayList<Customer>(5);
        ArrayList<Transaction> list1 = new ArrayList<Transaction>(5);
       
        int l,m,n;
        Scanner in = new Scanner(System.in); 
          Customer c=new Customer();
          Bank cd=new Bank();
          Banking b=new Banking();
          Transaction t1=null;
          Transaction t2=null;
         
   
          for(int i=0;i<3;i++)
          {
          System.out.println("type of account");
          System.out.println("1.Check In");
          System.out.println("2.Savings");
          System.out.println("3.Business");
           
          
           Customer s=new Customer(); 
           x=in.nextInt();
           s.set(x);
           list.add(s);
           
          }
     for(int i=0;i<3;i++){
     list.get(i).display1();
     }
    Collections.sort(list);
    for(Customer a: list)//printing the sorted list of names
         System.out.print(a.CustomerName + ", ");
    
    Collections.sort(list, new Customer());
      System.out.println(" ");
      for(Customer a: list)//printing the sorted list of ages
         System.out.print(a.CustomerName +"  : "+
		 a.AccountId + ", ");
      
      System.out.println("\n Search account on Account holders name");
      System.out.println("\n enter the name to search for:");
      b.name=in.nextLine();
      for(Customer p:list){
      if(p.CustomerName==b.name)
      {System.out.println("account in the name of account holder is"+p.getAccountType());
      }
      else
          System.out.println("Account not found");
      }
     for(int i=0;i<5;++i){ 
    System.out.println("\n type of transaction \n 1.credit \n 2.debit");
    x=in.nextInt();
    switch(x)
    { case 1:System.out.println("\n entered choice is credit");
             System.out.println("\n enter the transaction Id: \n");
             l=in.nextInt();
             System.out.println("\n enter the account Id:\n");
             m=in.nextInt();
             System.out.println("\n enter the transaction amount:\n");
             n=in.nextInt();
             t1=new CreditTransaction();
             t1.setTransaction(l, m, n);
             t1.displayTransaction(); 
             list1.add(t1);
             t1.editTransaction();
            
             break;
    case 2:  System.out.println("\n entered choice is debit");
             System.out.println("\n enter the transaction Id: \n");
             l=in.nextInt();
             System.out.println("\n enter the account Id:\n");
             m=in.nextInt();
             System.out.println("\n enter the transaction amount:\n");
             n=in.nextInt();
             t2=new DebitTransaction();
             t2.setTransaction(l, m, n);
             t2.displayTransaction();
             list1.add(t2);
             t2.editTransaction();
            
             break;
    }
     }  
     for(int i=0;i<5;++i)
     {
         list1.get(i).displayTransaction();
    
     }
    
     Collections.sort(list1, new CreditTransaction());
      System.out.println(" ");
      for(Transaction a: list1)//printing the sorted list of ages
         System.out.print(a.getAccountId() +"  : "+
		 a.getTransactionAmount() + ", ");
    }
    
}
