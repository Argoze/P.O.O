package listaex2;

import java.util.Scanner;

public class MenuFuncionario {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        int opcao;
        do {
            System.out.println("Menu:");
            System.out.println("1 - Criar Funcionário");
            System.out.println("2 - Mostrar Folha de Pagamento (chamar imprimir())");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o Crachá: ");
                    int cracha = scanner.nextInt();
                    funcionario.setCracha(cracha);

                    System.out.print("Digite o Nome: ");
                    String nome = scanner.next();
                    funcionario.setNome(nome);

                    System.out.print("Digite o Tipo Vínculo (H para horista, N para normal): ");
                    char tipoVinculo = scanner.next().charAt(0);
                    funcionario.setTipoVinculo(tipoVinculo);

                    if (tipoVinculo == 'H') {
                        System.out.print("Digite o Valor da Hora: ");
                        float valorHora = scanner.nextFloat();
                        funcionario.setValorHora(valorHora);

                        System.out.print("Digite a Quantidade de Horas Trabalhadas: ");
                        float qtdeHora = scanner.nextFloat();
                        funcionario.setQtdeHora(qtdeHora);
                    } else {
                        System.out.print("Digite o Salário: ");
                        float salario = scanner.nextFloat();
                        funcionario.setSalario(salario);
                    }

                    System.out.print("Digite o Valor do Desconto: ");
                    float valorDesconto = scanner.nextFloat();
                    funcionario.setValorDesconto(valorDesconto);
                    break;
                case 2:
                    System.out.println(funcionario.imprimir());
                    break;
                case 3:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 3);
    }
    
}
