
public class ProvaClasse {
private String nome;
private String crmv;
private char genero;
private double valorConsulta;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCrmv() {
        return crmv;
    }

    public void setCrmv(String crmv) {
        this.crmv = crmv;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public double getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    public ProvaClasse() {
        
    }
    
    public double calculaSalario(int qtdConsultas){
        
        return valorConsulta*qtdConsultas; 
    }
    
    public String imprimir(int qtdeConsulta){
        
        return "\nnome:"+ getNome() +
                "\ncrmv: " +getCrmv()+
                "\ngenero: "+getGenero()+
                "\nvalor da consulta: "+getCrmv()+
                "\nnumero de consultas: "+ qtdeConsulta +
                "\npagamento: "+calculaSalario(qtdeConsulta);
                        
                
    }
}
