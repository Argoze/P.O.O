
package javaapplication7;

import javax.swing.JOptionPane;

class Cachorro extends Animal {
    private int velocidade;
    
    public  Cachorro() {
       
    }
    
    public Cachorro(String nome, int idade, int velociadade){
       super(nome, idade);
       this.velocidade = velocidade;
    }       

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    public String fala(){
        return "au au ";
    }
    public void imprimir(){
    super.imprimir();
        JOptionPane.showInputDialog("velocidade:"+velocidade);

    }
    
}
