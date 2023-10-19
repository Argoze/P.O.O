
package javaapplication7;

import javax.swing.JOptionPane;


public class gato extends Animal {
    private int alturasalto;

   public gato(){
   }
   
   public gato(String nome, int idade, int alturasalto){
      super(nome, idade);
      this.alturasalto = alturasalto;
      
   }
   public String fala(){
       return "miau";
   }
   public void imprimir(){
        super.imprimir();
        JOptionPane.showInputDialog("altura do pulo"+alturasalto);
        
   }
   
}
