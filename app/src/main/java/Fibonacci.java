/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rafal
 */
import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę naturalną większą od zera: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Podana liczba musi być większa od zera.");
        } else {
            
            printFibonacciSequence(n);
        }

        scanner.close();
    }

    public static void printFibonacciSequence(int n) {
        int a = 0, b = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(a);

            int temp = a + b;
            a = b;
            b = temp;
        }
    }
}

