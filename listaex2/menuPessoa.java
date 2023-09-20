package listaex2;

import java.util.Scanner;

public class menuPessoa {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        String opcao = "";

        String nome;
        String cpf;
        int idade;
        char sexo;

        do {
            System.out.println("\n***********");
            System.out.println(" 1 - Criar Pessoa \n 2 - Mostrar pessoas \n 3 - sair");
            opcao = scan.next();

            switch (opcao) {
                case "1":
                    System.out.println("Digite o nome da pessoa:");
                    nome = scan.next();
                    System.out.println("Digite o cpf da pessoa");
                    cpf = scan.next();
                    System.out.println("digite o sexo da pessoa sendo\n F(feminino) M(masculino");
                    sexo = scan.next().charAt(0);
                    System.out.println("digite a idade da pessoa ");
                    idade = scan.nextInt();

                    pessoa.setNome(nome);
                    pessoa.setCpf(cpf);
                    pessoa.setSexo(sexo);
                    pessoa.setIdade(idade);

                    break;
                case "2":
                    System.out.println(pessoa.imprimir());
                    break;

                default:
                    System.out.println("nao temos esta opcao");

            }

        } while (!opcao.equals("3"));
    }

}
