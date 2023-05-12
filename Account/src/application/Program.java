
package application;

import entities.Account;
import entities.SavingsAccount;
import entities.BusinessAccount;

/**
 *
 * Developed by Maiara Cristina de Freitas
 * 
 */
public class Program {

   
    public static void main(String[] args) {
        
        Account account = new Account(1001, "alex", 0.0);
        BusinessAccount busAccount = new BusinessAccount(1002,"maria", 0.0,500.0);
        
        //upcasting
        
        Account acc1 = busAccount;
        Account acc2 = new BusinessAccount(1003,"bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004,"anna", 0.0, 0.01);
        
        //downcating
        
        BusinessAccount acc4 = (BusinessAccount)acc2;
        acc4.loan(100.0);
        
    }
    
}
