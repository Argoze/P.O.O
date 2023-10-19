
package javaapplication7;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      ArrayList<Animal> animais = new ArrayList<>();
     
               while (true) {
           String opt = JOptionPane.showInputDialog("\nMENU:"
            +"\n 1 - Cadastrar"
            +"\n 2 - Mostrar todos"
            +"\n 3 - Animal falando"
            +"\n 4 - Sair"
            +"\n qual opt vc quer: ");
           

            switch (opt) {
                case "1":
                    int tipoAnimal = Integer.parseInt (JOptionPane.showInputDialog("Qual animal deseja cadastrar?"
                    +"\n 1 - Cachorro"
                    +"\n 2 - Gato"
                    +"\n 3 - Capivara"));
                     

                    String nome = JOptionPane.showInputDialog("Nome: ");
                    
                    int idade = Integer.parseInt (JOptionPane.showInputDialog("Idade: "));
                    

                    if (tipoAnimal == 1) {
                        int  velocidade = Integer.parseInt (JOptionPane.showInputDialog("velocidade: "));
                         
                        animais.add(new Cachorro(nome, idade, velocidade));
                    } else if (tipoAnimal == 2) {
                        int alturaSalto = Integer.parseInt(JOptionPane.showInputDialog("altura do pulo: "));
                        
                        animais.add(new gato(nome, idade, alturaSalto));
                    } else if (tipoAnimal == 3) {
                       int peso =  Integer.parseInt (JOptionPane.showInputDialog("Peso: "));
                        
                        animais.add(new Capivara(nome, idade, peso));
                    }
                    break;

                case "2":
                    JOptionPane.showInputDialog("Todos os animais:");
                    for (Animal animal : animais) {
                        animal.imprimir();
                    }
                    break;

                case "3":
                    JOptionPane.showInputDialog("a fala dos animais:");
                    for (Animal animal : animais) {
                        JOptionPane.showInputDialog(animal.fala());
                    }
                    break;

                case "4":
                    JOptionPane.showInputDialog("Saindo do programa.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    JOptionPane.showInputDialog("Opção inválida. Tente novamente.");
                    break;
            }
        }
                
    }
    
}
