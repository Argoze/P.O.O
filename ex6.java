package lista_de_ex1;

import java.util.Scanner;


public class ex6 {

    public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[10];
        int[] par = new int[10];
        int[] impar = new int[10];
        
        int quantosp = 0;
        int quantosi = 0;
        
        System.out.println("diga 10 numeros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            
            if (numeros[i] % 2 == 0) {
                par[quantosp] = numeros[i];
                quantosp++;
            } else {
                impar[quantosi] = numeros[i];
                quantosi++;
            }
        }
        
        System.out.println("\n estes sao os numeros:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        
        System.out.println("\nestes numeros sao pares:");
        for (int i = 0; i < quantosp; i++) {
            System.out.print(par[i] + " ");
        }
        
        System.out.println("\nestes numeros sao impares:");
        for (int i = 0; i < quantosi; i++) {
            System.out.print(impar[i] + " ");
        }
        
        scanner.close();
    }
}