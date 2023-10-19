
package javaapplication7;

import javax.swing.JOptionPane;

public class Capivara extends Animal {
    private int peso;
    
    public Capivara(){
    }
    
    public Capivara (String nome, int idade, int peso){
       super(nome, idade);
       this.peso=peso;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
     public void imprimir(){
    super.imprimir();
        JOptionPane.showInputDialog("peso"+peso);

    }
}
