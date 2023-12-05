
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rafal
 */


public class AverageFrom3Numbers {

    public void calculateAverage() {
        Scanner scanner = new Scanner(System.in);

        double liczba1 = wczytajLiczbe("Podaj pierwszą liczbę: ", scanner);
        if (liczba1 > 0) {
            System.out.println("Liczba pierwsza jest większa od zera");
        } else {
            System.out.println("Liczba pierwsza nie jest większa od zera");
        }

        double liczba2 = wczytajLiczbe("Podaj drugą liczbę: ", scanner);
        if (liczba2 > 0) {
            System.out.println("Liczba druga jest większa od zera");
        } else {
            System.out.println("Liczba druga nie jest większa od zera");
        }

        double liczba3 = wczytajLiczbe("Podaj trzecią liczbę: ", scanner);
        if (liczba3 > 0) {
            System.out.println("Liczba trzecia jest większa od zera");
        } else {
            System.out.println("Liczba trzecia nie jest większa od zera");
        }

        System.out.println("Srednia z trzech podanych liczb to: " + (liczba1 + liczba2 + liczba3) / 3);
    }

    private static double wczytajLiczbe(String komunikat, Scanner scanner) {
        System.out.print(komunikat);
        return scanner.nextDouble();
    }
}

