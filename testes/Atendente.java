
package testes;

public class Atendente extends Pessoa {
    private int numeroCracha;
    private double salario;
    private String setor;
    private String funcao;

    public Atendente() {}

    public Atendente(String nome, String cpf, int numeroCracha, double salario, String setor, String funcao) {
        super(nome, cpf);
        this.numeroCracha = numeroCracha;
        this.salario = salario;
        this.setor = setor;
        this.funcao = funcao;
    }

    public int getNumeroCracha() {
        return numeroCracha;
    }

    public void setNumeroCracha(int numeroCracha) {
        this.numeroCracha = numeroCracha;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public void bonificacao() {
        
    }

    @Override
    public String toString() {
        return super.toString() + ", Crachá: " + numeroCracha + ", Salário: " + salario + ", Setor: " + setor + ", Função: " + funcao;
    }
}