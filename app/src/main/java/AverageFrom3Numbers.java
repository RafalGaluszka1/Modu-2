
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
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
System.out.print("Podaj pierwszą liczbę: ");
double liczba1 = scanner.nextDouble();
if (liczba1 > 0) {
    System.out.println("Liczba pierwsza jest większa od zera");
}
else{
    System.out.println("Liczba pierwsza nie jest większa od zera");
}
System.out.println("Podaj drugą liczbę: ");
double liczba2 = scanner.nextDouble();
if (liczba2 > 0) {
    System.out.println("Liczba druga jest większa od zera");
}
else{
    System.out.println("Liczba druga nie jest większa od zera");
}
System.out.println("Podaj trzecią liczbę: ");
double liczba3 = scanner.nextDouble();
if (liczba3 > 0) {
    System.out.println("Liczba trzecia jest większa od zera");
}
else{
    System.out.println("Liczba trzecia nie jest większa od zera");
} 
System.out.println("Srednia z trzech podanych liczb to: " + (liczba1 + liczba2 + liczba3) /3);    }
}
