package listaex2;

public class Pessoa {

    private String cpf;
    private String nome;
    private char sexo;
    private int idade;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String imprimir() {

        return "\n **********"
                + "\n nome:" + getNome()
                + "\n cpf:" + getCpf()
                + "\n sexo:" + getSexo()
                + "\n idade:" + getIdade();
    }
}
