
package entities;


public class Employee {
    public String name;
    public double grossSalary;
    public double tax;
    
    public double netSalary(){
      return grossSalary - tax;   
    }
    
    public void incrementSalary(double percent){
        grossSalary += grossSalary*(percent/100);
    }
    
     public String toString(){
       return name + ", salary: " + String.format("%.2f", grossSalary)+",taxa: "+  tax +" Salary: $ "+ String.format("%.2f", netSalary());
   }
}
