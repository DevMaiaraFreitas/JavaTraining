
package appbank;

import appbank.entities.Person;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Maiara Cristina de Freitas
 */
public class AppBank {

    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Person person;
        
        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        
        System.out.print("Is there an initial deposit (y/n)? ");
        char n = sc.next().charAt(0);
        if (n == 'y'){
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            person = new Person(number, holder, initialDeposit);
        }else{
            person = new Person(number, holder);
        }
        
        System.out.println("------------------------------");
        System.out.println("Account data: ");
        System.out.println(person);
        System.out.println("------------------------------");
        System.out.print("Enter a deposit value: ");
        double deposit = sc.nextDouble();
        person.deposit(deposit);
        System.out.println("------------------------------");
        System.out.print("Update account data: ");
        System.out.println(person);
        System.out.println("------------------------------");
        System.out.print("Is there an withdraw value (y/n)? ");
        n = sc.next().charAt(0);
        if (n == 'y'){
            System.out.print("Enter withdraw value: ");
            deposit = sc.nextDouble();
            person.withdraw(deposit);
            if(person.getBalance() < 0){
                System.out.println("you do not have money in this account, please make a deposit");
            }else{
                System.out.println(person);
            }
        }else{
           System.out.println(person);
        }
        
        sc.close();
        
    }
    
}
