
package testes;

import java.util.ArrayList;

public class Disciplina {
    private int codigo;
    private String nome;
    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();

    public Disciplina() {}

    public Disciplina(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void addAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void removeAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    @Override
    public String toString() {
        String alunosStr = "";
        for (Aluno a : alunos) {
            alunosStr += a.getNome() + ", ";
        }

        return "Código: " + codigo + ", Nome: " + nome + ", Alunos: " + alunosStr;
    }
}

