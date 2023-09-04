package lista_de_ex1;

import java.util.Scanner;


public class ex3 {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        
        double totalnotas = 0;
        int totalalunos = 0;
        
        while (true) {
            System.out.print("digite o RA do aluno (ou 0 para encerrar) :   ");
            int RA = scanner.nextInt();
            
            if (RA == 0) {
                System.out.println("acabou.");
                break; 
            }
            
            System.out.print("digite a primeira nota  do aluno " + RA + ": ");
            double nota1 = scanner.nextDouble();
            
            System.out.print("digite a segunda nota do aluno " + RA + ": ");
            double nota2 = scanner.nextDouble();
            
            System.out.print("digite a terceira nota do aluno " + RA + ": ");
            double nota3 = scanner.nextDouble();
            
            double media = (nota1 + nota2 + nota3) / 3;
            System.out.println("a media das notas do aluno " + RA + ": " + media);
            
            totalnotas += media;
            totalalunos++;
        }
        
        if (totalalunos > 0) {
            double mediaClasse = totalnotas / totalalunos;
            System.out.println("media da classe: " + mediaClasse);
        } else {
            System.out.println("nenhum aluno foi registrado.");
        }
        
        scanner.close();
    }
}
