
package Abstract;

import javax.swing.JOptionPane;

public class main {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[100];
        int numFuncionarios = 0;

        while (true) {
            String escolhaStr = JOptionPane.showInputDialog("menu:\n1 - criar funcionario\n2 - mostrar\n3 - sair");
            int escolha = Integer.parseInt(escolhaStr);

            if (escolha == 1) {
                String tipoFuncionarioStr = JOptionPane.showInputDialog("escolha o tipo de funcionario:\n1 - funcionario horista\n2 - funcionario mensalista");
                int tipoFuncionario = Integer.parseInt(tipoFuncionarioStr);

                int numeroCracha = Integer.parseInt(JOptionPane.showInputDialog("numero do cracha: "));
                String nome = JOptionPane.showInputDialog("nome: ");
                String setor = JOptionPane.showInputDialog("setor: ");
                String funcao = JOptionPane.showInputDialog("funcao: ");

                if (tipoFuncionario == 1) {
                    int qtdeHoras = Integer.parseInt(JOptionPane.showInputDialog("quantidade de horas: "));
                    double valorHora = Double.parseDouble(JOptionPane.showInputDialog("valor da hora: "));

                    funcionarios[numFuncionarios] = new FuncionarioHorista(numeroCracha, nome, setor, funcao, qtdeHoras, valorHora);
                } else if (tipoFuncionario == 2) {
                    double salario = Double.parseDouble(JOptionPane.showInputDialog("salario: "));
                    double desconto = Double.parseDouble(JOptionPane.showInputDialog("desconto: "));

                    funcionarios[numFuncionarios] = new FuncionarioMensalista(numeroCracha, nome, setor, funcao, salario, desconto);
                }

                numFuncionarios++;
            } else if (escolha == 2) {
                String funcionariosStr = "";
                for (int i = 0; i < numFuncionarios; i++) {
                    funcionariosStr += funcionarios[i].toString() + "\n";
                    funcionariosStr += "salario: " + funcionarios[i].calcularSalario() + "\n";
                }
                JOptionPane.showMessageDialog(null, funcionariosStr);
            } else if (escolha == 3) {
                break;
            }
        }
    }
}

