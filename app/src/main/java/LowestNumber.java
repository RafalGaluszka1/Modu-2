
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rafal
 */
public class LowestNumber {
    public static void main(String[] args) {
        printMinimalNumber(); 
    }
    public static void printMinimalNumber()
    {
       Scanner scanner = new Scanner(System.in);
System.out.print("Podaj pierwszą liczbę: ");
int a = scanner.nextInt();
System.out.print("Podaj drugą liczbę: ");
int b = scanner.nextInt();
System.out.print("Podaj trzecią liczbę: ");
int c = scanner.nextInt();
System.out.print("Podaj czwartą liczbę: ");
int d = scanner.nextInt();
System.out.print("Podaj piątą liczbę: ");
int e = scanner.nextInt();

if (a < b &&  a < c && a < d && a < e)
System.out.println(a +  "  Jest najmniejsza liczba");
if (b < a && b < c && b < d && b < e)
System.out.println(b +  "  Jest najmniejsza liczba");
if (c < b && c < a && c < d && c < e)
System.out.println(c +  "  Jest najmniejsza liczba");
if (d < b && d < a && d < c && d < e )
System.out.println(d +  "  Jest najmniejsza liczba");
if (e < b && e < c && e < d && d < a )
System.out.println(e +  "  Jest najmniejsza liczba");
    }
}
