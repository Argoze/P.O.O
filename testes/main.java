package testes;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class main {

     public static void main(String[] args) {
        ArrayList<Pessoa> lstPessoas = new ArrayList<Pessoa>();
        ArrayList<Disciplina> lstDisciplinas = new ArrayList<Disciplina>();

        int crachaProf = 0;

        while (true) {
            String menu = "Escolha uma opção:\n"
                    + "1-Inserir Disciplina\n"
                    + "2-Inserir Professor\n"
                    + "3-Inserir Atendente\n"
                    + "4-Inserir Aluno\n"
                    + "5-Adicionar Disciplina ao Professor\n"
                    + "6-Mostrar Pessoas\n"
                    + "7-Mostrar Disciplinas\n"
                    + "8-Aplicar bonificação\n"
                    + "9-Sair";

            String escolha = JOptionPane.showInputDialog(menu);

            switch (escolha) {
                case "1":
                    
                    int codigo = Integer.parseInt(JOptionPane.showInputDialog("Código da Disciplina:"));
                    String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina:");
                    Disciplina disciplina = new Disciplina(codigo, nomeDisciplina);
                    lstDisciplinas.add(disciplina);
                    break;

                case "2":
                   
                    String nomeProf = JOptionPane.showInputDialog("Nome do Professor:");
                    String cpfProf = JOptionPane.showInputDialog("CPF do Professor:");
                    crachaProf = Integer.parseInt(JOptionPane.showInputDialog("Crachá do Professor"));
                    double salarioProf = Double.parseDouble(JOptionPane.showInputDialog("Salário do Professor:"));
                    String urlLattes = JOptionPane.showInputDialog("URL Lattes do Professor:");
                    Professor professor = new Professor(nomeProf, cpfProf, crachaProf, salarioProf, urlLattes);
                    lstPessoas.add(professor);
                    break;

                case "3":
                    
                    String nomeAtend = JOptionPane.showInputDialog("Nome do Atendente:");
                    String cpfAtend = JOptionPane.showInputDialog("CPF do Atendente:");
                    int crachaAtend = Integer.parseInt(JOptionPane.showInputDialog("Crachá do Atendente:"));
                    double salarioAtend = Double.parseDouble(JOptionPane.showInputDialog("Salário do Atendente:"));
                    String setor = JOptionPane.showInputDialog("Setor do Atendente:");
                    String funcao = JOptionPane.showInputDialog("Função do Atendente:");
                    Atendente atendente = new Atendente(nomeAtend, cpfAtend, crachaAtend, salarioAtend, setor, funcao);
                    lstPessoas.add(atendente);
                    break;

                case "4":
                    
                    String nomeAluno = JOptionPane.showInputDialog("Nome do Aluno:");
                    String cpfAluno = JOptionPane.showInputDialog("CPF do Aluno:");
                    String ra = JOptionPane.showInputDialog("RA do Aluno:");
                    int codigoDisciplina = Integer.parseInt(JOptionPane.showInputDialog("Código da Disciplina:"));
                    Disciplina disciplinaAluno = null;
                    for (Disciplina d : lstDisciplinas) {
                        if (d.getCodigo() == codigoDisciplina) {
                            disciplinaAluno = d;
                            break;
                        }
                    }
                    Aluno aluno = new Aluno(nomeAluno, cpfAluno, ra, disciplinaAluno);
                    lstPessoas.add(aluno);
                    break;

                case "5":
                    String codigoDaDisciplina = JOptionPane.showInputDialog("Código da Disciplina:");

                    Disciplina disciplinaProfessor = null;
                    Professor professorObj = null;

                    for (Disciplina d : lstDisciplinas) {
                        if (d.getCodigo() == Integer.parseInt(codigoDaDisciplina)) {
                            disciplinaProfessor = d;
                            break;
                        }
                    }

                    if (disciplinaProfessor == null) {
                        JOptionPane.showMessageDialog(null, "Disciplina não encontrada.");
                        continue;
                    }

                    for (Pessoa p : lstPessoas) {
                        if (p instanceof Professor) {
                            Professor prof = (Professor) p;
                            if (prof.getNumeroCracha() == crachaProf) {
                                professorObj = prof;
                                break;
                            }
                        }
                    }

                    if (professorObj == null) {
                        JOptionPane.showMessageDialog(null, "Professor não encontrado.");
                        continue;
                    }

                    professorObj.addDisciplina(disciplinaProfessor);
                    break;

                case "6":
                    
                    String pessoasInfo = "Pessoas:\n";
                    for (Pessoa pessoa : lstPessoas) {
                        pessoasInfo += pessoa.toString() + "\n";
                    }
                    JOptionPane.showMessageDialog(null, pessoasInfo);
                    break;

                case "7":
                    
                    String disciplinasInfo = "Disciplinas:\n";
                    for (Disciplina d : lstDisciplinas) {
                        disciplinasInfo += d.toString() + "\n";
                    }
                    JOptionPane.showMessageDialog(null, disciplinasInfo);
                    break;

                case "8":
                    
                    int cracha = Integer.parseInt(JOptionPane.showInputDialog("Crachá do Funcionário:"));
                    for (Pessoa p : lstPessoas) {
                        if (p.getNumeroCracha() == cracha) {
                            if (p instanceof Professor) {
                                ((Professor) p).bonificacao();
                            } else if (p instanceof Atendente) {
                                ((Atendente) p).bonificacao();
                            } else {
                                p.bonificacao();
                            }
                        }
                    }
                    break;

                case "9":
                    
                    System.exit(0);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        }
    }
}
