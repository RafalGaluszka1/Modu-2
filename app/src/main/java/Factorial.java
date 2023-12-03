/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rafal
 */
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę naturalną większą od zera: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Podana liczba musi być większa od zera.");
        } else {
            long wynik = obliczSilnie(n);
            System.out.println("Silnia z " + n + " to: " + wynik);
        }

        scanner.close();
    }

    public static long obliczSilnie(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            long wynik = 1;
            for (int i = 2; i <= n; i++) {
                wynik *= i;
            }
            return wynik;
        }
    }
}
