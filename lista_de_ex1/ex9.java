package lista_de_ex1;

import java.util.Scanner;

public class ex9 {

  
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int tpessoas = 7;
        int mais90 = 0;
        int sidades = 0;

        for (int i = 0; i < tpessoas; i++) {
            System.out.print("qual a idade (caso queira para digite idade negativa)" );
            int idade = scanner.nextInt();
            if (idade < 0) {
                System.out.println("encerrado.");
                break;
            }
            System.out.print("qual o peso " + (i + 1) + ": ");
            double peso = scanner.nextDouble();

            if (peso > 90) {
                mais90++;
            }

            sidades += idade;
        }

        double midades = (double) sidades / tpessoas;

        System.out.println("\nvalores:");
        System.out.println("pessoas com mais de 90: " + mais90);
        System.out.println("media de idades: " + midades);

        scanner.close();
    }
}