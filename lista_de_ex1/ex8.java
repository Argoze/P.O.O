package lista_de_ex1;

import java.util.Scanner;


public class ex8 {

    
    public static void main(String[] args) {
        
  Scanner scanner = new Scanner(System.in);

        int thabitantes = 1000;
        int tmulheres = 0;
        int thomens = 0;
        int tde18a35 = 0;
        int somagrupo = 0;
        double samulher = 0;
        double sahomem = 0;

        for (int i = 0; i < thabitantes; i++) {
            System.out.print("qual o sexo(0-feminino, 1-masculino) digite negativo para sair: ");
            int sexo = scanner.nextInt();
            if (sexo < 0) {
                System.out.println("encerrado.");
                break;
            }
            
            System.out.print("qual a idade: ");
            int idade = scanner.nextInt();
             
            
            
            System.out.print("qual a altura: ");
            double altura = scanner.nextDouble();
            
            somagrupo += idade;

            if (sexo == 0) {
                samulher += altura;
                tmulheres++;
            } else {
                sahomem += idade;
                thomens++;
            }

            if (idade >= 18 && idade <= 35) {
                tde18a35++;
            }
        }

        double migrupo = (double) somagrupo / thabitantes;
        double mamulher = tmulheres > 0 ? samulher / tmulheres : 0;
        double mihomem = thomens > 0 ? sahomem / thomens : 0;
        double pessoade18a35 = (double) tde18a35 / thabitantes * 100;

        System.out.println("\nresultado:");
        System.out.println("media da idade: " + migrupo);
        System.out.println("media da altura das mulheres: " + mamulher);
        System.out.println("media da idade dos homens: " + mihomem);
        System.out.println("porcentagem de pessoas com 18 e 35 anos: " + pessoade18a35 + "%");

        scanner.close();
    }
}
