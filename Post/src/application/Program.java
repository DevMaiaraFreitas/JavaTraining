
package application;

import entities.Comment;
import entities.Post;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * Developed by Maiara Cristina de Freitas
 * 
 **/
public class Program {

    
    public static void main(String[] args) throws ParseException {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat simpliDate = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        System.out.println("--------------------");
        System.out.println("Comment 1: ");
        String text1 = sc.nextLine();
        System.out.println("title 1: ");
        String title1 = sc.nextLine();
        System.out.println("Content 1: ");
        String content1 = sc.nextLine();
        System.out.println("likes 1: ");
        int likes1 = sc.nextInt();
        System.out.println("--------------------");
        
        System.out.println("Comment 2: ");
        String text2 = sc.nextLine();
        String title2 = sc.nextLine();
        System.out.println("Content 2: ");
        String content2 = sc.nextLine();
        System.out.println("likes 2: ");
        int likes2 = sc.nextInt();
       System.out.println("--------------------");
       
        Comment c1 = new Comment(text1);
        Comment c2 = new Comment(text2);
        Post p1 = new Post(simpliDate.parse("21/06/2022 13:05:44"), title1, content1,likes1);
        Post p2 = new Post(simpliDate.parse("23/06/2022 13:05:44"), title2, content2,likes2);
        
        p1.addcomment(c1);
        p1.addcomment(c2);
        p2.addcomment(c1);
        p2.addcomment(c2);
        
        System.out.println(p1);
        System.out.println(p2);
        
        
        sc.close();
        
        
    }
    
}
