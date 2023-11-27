
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rafal
 */
public class SprawdzanieArgumentow {
    
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Podaj liczbę: ");

         {
            int liczba = scanner.nextInt();

            if (liczba > 0) {
                System.out.println("Liczba jest większa od zera.");
            } else if (liczba < 0) {
                System.out.println("Liczba jest mniejsza od zera.");
                scanner.close();
            }
        }}}
