
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rafal
 */
public class NaturalNumber {
    public static void main(String[] args) {
        printNaturalNumber(); 
    }
    public static void printNaturalNumber()
    {
       Scanner scanner = new Scanner(System.in);
System.out.print("Podaj liczbe naturalna wieksza lub rowna 0: ");
int a = scanner.nextInt();
   
        
 int i = 0;
        
        do {    
            System.out.println(i);    
            i++;    
        } while (i <= a);    
    }    
}  
