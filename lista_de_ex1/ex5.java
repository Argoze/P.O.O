
package lista_de_ex1;

import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {
       
       Scanner scanner = new Scanner(System.in);
        
        int[] vetor = new int[5];
        
        System.out.println("quais os 5 numeros:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("numero " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }
        
        int soma = 0;
        int multiplicacao = 1;
        
        for (int num : vetor) {
            soma += num;
            multiplicacao *= num;
        }
        
        System.out.println("os numeros sao:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        
        System.out.println("\n a sima dos numeros eh: " + soma);
        System.out.println("e mutiplicados : " + multiplicacao);
        
        scanner.close();
    }
}