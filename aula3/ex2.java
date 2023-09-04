
package aula3;

import java.util.Scanner;


public class ex2 {

   
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

        System.out.print("digite um numero: ");
        int numero = scanner.nextInt();

        boolean resultado = par(numero);

        if (resultado) {
            System.out.println(numero + " par.");
        } else {
            System.out.println(numero + " impar.");
        }

        scanner.close();
    }

    public static boolean par(int numero) {
        return numero % 2 == 0;
    }
}
