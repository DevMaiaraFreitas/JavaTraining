/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appestoque;

import entities.Employee;
import entities.Product;
import entities.Retangulo;
import entities.Student;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author camil
 */
public class AppEstoque {

    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        /* ATIVIDADE ALUNO
        Student aluno = new Student();
        
        System.out.println("Name:");
        aluno.nameAluno = sc.nextLine();
        System.out.println("Nota 1:");
        aluno.nota1 = sc.nextDouble();
        System.out.println("Nota 2:");
        aluno.nota2 = sc.nextDouble();
        System.out.println("Nota 3:");
        aluno.nota3 = sc.nextDouble();
        System.out.println("---------------------------");
        System.out.println("a soma das notas são: "+aluno.notafinal());
        System.out.println("---------------------------");
        if (aluno.notafinal()< 60){
            System.out.println("Reprovado");
            System.out.println("faltou :"+aluno.ponts()+ "pontos");
        }else{
            System.out.println("APROVADO!");
        }
        
        System.out.println("---------------------------");
        */
        
        
        /* ATIVIDADE EMPLOYEE
        
        
        Employee emp = new Employee();
        
        System.out.println("Name:");
        emp.name = sc.nextLine();
        System.out.println("Gross salary:");
        emp.grossSalary = sc.nextDouble();
        System.out.println("tax:");
        emp.tax = sc.nextDouble();
        
        System.out.println("---------------------------");
        System.out.println("Employee: "+emp);
        System.out.println("---------------------------");
        System.out.println("which percentage to increase salary? ");
        double percent = sc.nextDouble();
        emp.incrementSalary(percent);
        System.out.println("---------------------------");
        System.out.println("Update data:" +emp);
        */
        
        /*ATIVIDADE RETANGULO
        
        Retangulo retangulo = new Retangulo();
        
        System.out.println("Enter rectangle width and height: ");
        System.out.println("width: ");
        retangulo.width = sc.nextDouble();
        System.out.println("height: ");
        retangulo.height = sc.nextDouble();
        
        System.out.println("Area: "+retangulo.area());
        System.out.println("Perimeter: "+retangulo.perimeter());
        System.out.println("Diagonal: "+retangulo.diagonal());
        */
        
        //ATIVIDADE PRODUTO 
        
        //Product product = new Product();
        
        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        //product.name = sc.nextLine();
        String name = sc.nextLine();
        System.out.println("Price: ");
        //product.price = sc.nextDouble();
        double price = sc.nextDouble();
        System.out.println("Quantity: ");
        //product.quantity = sc.nextInt();
        int quantity = sc.nextInt();
        
        Product product = new Product(name, price, quantity);
        
        
        System.out.println();
        System.out.println("Product Data: "+ product);
        System.out.println();
        System.out.println("Enter the number of product to be added in stock: ");
        quantity = sc.nextInt();
        product.addProducts(quantity);
        //Product product = new Product(name, price);
        System.out.println();
        System.out.println("Updated Product: "+ product);
        System.out.println();
        System.out.println("Enter the number of product to be removed in stock: ");
        quantity = sc.nextInt();
        product.remoeProducts(quantity);
        System.out.println();
        System.out.println("Remove Product: "+ product);
        System.out.println();
        
        sc.close();
    }

    public AppEstoque() {
    }
    
}
