/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rafal
 */
public class Triangle {
    public static void main(String[] args) {
        int a = 0;

        if (a <= 0) {
            System.out.print("Wysokość trójkąta musi być większa od 0.");
        } else {
            for (int i = 1; i <= a; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println(); // nowa linia
            }
        }
    }
}


