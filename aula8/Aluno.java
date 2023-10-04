
package aula8;

import aula5.*;

public class Aluno {
    private String ra;
    private String nome;
    private String curso;

    
    public Aluno(String ra, String nome){
        this.ra = ra;
        this.nome = nome;
        
    }
    
     public String imprimir() {
        return  "\n==============\n"+
                "\nRa: "+ ra+
                "\nNome: "+ nome;
                
    }
   
        
}
