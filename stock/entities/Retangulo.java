/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author camil
 */
public class Retangulo {
    public double width;
    public double height;
    
    public double area(){
       return width*height; 
    }
    
    public double perimeter(){
        return (2*width)+(2*height);
    }
    
    public double diagonal(){
        return Math.sqrt((width*width)+(height*height));
    }
}
