/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rafal
 */
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.start();
    }

    public void start() {
        System.out.println("Witaj w kalkulatorze!");

        do {
            double number1 = getNumberFromUser();
            double number2 = getNumberFromUser();
            String operation = getOperationFromUser();

            double result = 0;

            switch (operation) {
                case "+":
                    result = add(number1, number2);
                    break;
                case "-":
                    result = subtract(number1, number2);
                    break;
                case "*":
                    result = multiply(number1, number2);
                    break;
                case "/":
                    if (number2 != 0) {
                        result = divide(number1, number2);
                    } else {
                        System.out.println("Nie można dzielić przez 0. Wybierz inne liczby.");
                        continue;
                    }
                    break;
                case "exit":
                case "quit":
                    System.out.println("Do widzenia!");
                    System.exit(0);
                default:
                    System.out.println("Nieprawidłowa operacja. Spróbuj ponownie.");
                    continue;
            }

            System.out.println("Wynik operacji " + number1 + " " + operation + " " + number2 + " to: " + result);

        } while (true);
    }

    private String getOperationFromUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj operację (+, -, *, /) lub wpisz exit/quit, aby zakończyć: ");
        return scanner.nextLine().trim();
    }

    private double getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);

        double number = 0;
        boolean isValid = false;

        do {
            System.out.print("Podaj liczbę większą niż 0: ");

            if (scanner.hasNextDouble()) {
                number = scanner.nextDouble();
                isValid = isMoreThan0(number);
            } else {
                System.out.println("Nieprawidłowe dane. Podaj liczbę ponownie.");
                scanner.next(); // Konieczne, aby pominąć błędne dane
            }

        } while (!isValid);

        return number;
    }

    private boolean isMoreThan0(double number) {
        return number > 0;
    }

    private double add(double a, double b) {
        return a + b;
    }

    private double subtract(double a, double b) {
        return a - b;
    }

    private double divide(double a, double b) {
        return a / b;
    }

    private double multiply(double a, double b) {
        return a * b;
    }
}
