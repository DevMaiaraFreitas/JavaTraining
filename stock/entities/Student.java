
package entities;

public class Student {
    public String nameAluno;
    public double nota1;
    public double nota2;
    public double nota3;
    
    public double notafinal(){
        return (nota1 + nota2 + nota3)/3;
    }
    
    public double ponts(){
        if (notafinal() < 60){
            return 60 - notafinal();
        }else{
            return 0;
        }
    }
}
