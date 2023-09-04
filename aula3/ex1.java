
package aula3;

import java.util.Scanner;


public class ex1 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.print("digite o primeiro numero: ");
        double numero1 = scanner.nextDouble();

        System.out.print("digite o operador (+, -, *, /): ");
        char operador = scanner.next().charAt(0);

        System.out.print("digite o segundo numero: ");
        double numero2 = scanner.nextDouble();

        double resultado = cal(numero1, operador, numero2);
        System.out.println("resultado: " + resultado);

        scanner.close();
    }

    public static double cal(double numero1, char operador, double numero2) {
        double resultado = 0.0;

        switch (operador) {
            case '+':
                resultado = numero1 + numero2;
                break;
            case '-':
                resultado = numero1 - numero2;
                break;
            case '*':
                resultado = numero1 * numero2;
                break;
            case '/':
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                }
                break;
            default:
                System.out.println("nao tem");
        }

        return resultado;
    }
}

