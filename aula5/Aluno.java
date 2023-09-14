
package aula5;

public class Aluno {
    private String ra;
    private String nome;
    private String curso;

    public String getRa() {
        return ra;
    }

    public void setRa(String _ra) {
        this.ra = _ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String _nome) {
        this.nome = _nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String _curso) {
        this.curso = _curso;
    }
     public String imprimir() {
        return  "\n==============\n"+
                "\nRa: "+getRa()+
                "\nNome: "+getNome()+
                "\nCurso: "+getCurso();
    }
   
        
}
