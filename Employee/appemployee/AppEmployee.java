
package appemployer;

import entities.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class AppEmployer {

    public static void main(String[] args) {
       
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        List< Employee> list = new ArrayList<>();
        
        System.out.println("How many employees wwill be registered?");
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++){
            System.out.println("Emplyoee #"+(i+1)+ " :");
            sc.nextLine();
            System.out.print("ID:");
            Integer id = sc.nextInt();
            System.out.print("name:");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Salary:");
            Double salary = sc.nextDouble();
            
            Employee emp = new Employee(id, name, salary);
            list.add(emp);
        }
       
        System.out.println("---------------------------");
        System.out.println("Enter the emplyoee id that will have salary increase: ");
        int idSalary = sc.nextInt();
        Employee emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
        if (emp == null){
           System.out.println("This id does not exist!");
        }else{
            System.out.println("Enter the percent: ");
            double percent = sc.nextDouble();
            emp.incrementSalary(percent);
        }
        System.out.println("---------------------------");
        System.out.println("List of employees: ");
      
        for( Employee e : list){
            System.out.println(e);
        }
        System.out.println("---------------------------");
        sc.close();
    }
    
}
