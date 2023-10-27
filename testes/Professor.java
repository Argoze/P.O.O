
package testes;

import java.util.ArrayList;

public class Professor extends Funcionario {
    private String urlLattes;
    private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();

    public Professor() {}

    public Professor(String nome, String cpf, int numeroCracha, double salario, String urlLattes) {
        super(nome, cpf, numeroCracha, salario);
        this.urlLattes = urlLattes;
    }

    public String getUrlLattes() {
        return urlLattes;
    }

    public void setUrlLattes(String urlLattes) {
        this.urlLattes = urlLattes;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void addDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public void removeDisciplina(Disciplina disciplina) {
        disciplinas.remove(disciplina);
    }

    @Override
    public void bonificacao() {
        
        setSalario(getSalario() * 2);
    }

    @Override
    public String toString() {
        String disciplinasStr = "";
        for (Disciplina d : disciplinas) {
            disciplinasStr += d.getNome() + ", ";
        }

        return super.toString() + ", URL Lattes: " + urlLattes + ", Disciplinas: " + disciplinasStr;
    }
}

