/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rafal
 */

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rafal
 */
public class AddingNumbers {
    public static void main(String[] args) {
        printAddingNumber(); 
    }
    public static void printAddingNumber()
    {
       Scanner scanner = new Scanner(System.in);
System.out.print("Podaj liczbe naturalna wieksza lub rowna 0: ");
int a = scanner.nextInt();
   
int sum = 0; 
        
        int i = 0;
        
        do {    
            System.out.println(i);
            sum += i; 
            i++;    
        } while (i <= a);
        
        System.out.println("Suma liczb od 0 do " + a + " wynosi: " + sum);
    }    
}  

