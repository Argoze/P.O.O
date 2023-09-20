package listaex2;

import java.util.Scanner;


public class MenuAluno {

    
    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);
        Aluno aluno = new Aluno();

        int opcao;
        do {
            System.out.println("Menu:");
            System.out.println("1 - Novo Aluno");
            System.out.println("2 - Mostrar Aluno");
            System.out.println("3 - Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("RA do Aluno: ");
                    String ra = scanner.next();
                    aluno.setRa(ra);

                    System.out.print("Nome do Aluno: ");
                    String nome = scanner.next();
                    aluno.setNome(nome);

                    System.out.print("Nota da AC1: ");
                    float ac1 = scanner.nextFloat();
                    aluno.setAC1(ac1);

                    System.out.print("Nota da AC2: ");
                    float ac2 = scanner.nextFloat();
                    aluno.setAC2(ac2);

                    System.out.print("Nota da AG: ");
                    float ag = scanner.nextFloat();
                    aluno.setAG(ag);

                    System.out.print("Nota da AF: ");
                    float af = scanner.nextFloat();
                    aluno.setAF(af);
                    break;
                case 2:
                    System.out.println(aluno.imprimir());
                    break;
                case 3:
                    System.out.println("acabou.");
                    break;
                default:
                    System.out.println("nao tem essa opcao");
                    break;
            }
        } while (opcao != 3);
    }
    
}
