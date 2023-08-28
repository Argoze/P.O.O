
package lista_de_ex1;

import java.util.Scanner;


public class ex7 {

   
    public static void main(String[] args) {
       
Scanner scanner = new Scanner(System.in);
        
        int qproduto = 0;
        double scusto = 0;
        double spreco = 0;
        
        System.out.println("qual o codigo (digite negativo para encerrar):");
        
        while (true) {
            System.out.print("codigo: ");
            int codigo = scanner.nextInt();
            
            if (codigo < 0) {
                break; 
            }
            
            System.out.print("quanto custa: ");
            double custo = scanner.nextDouble();
            
            double preco = custo * 1.2; 
            
            System.out.println("codigo do produto: " + codigo);
            System.out.println("preco: " + preco);
            
            qproduto++;
            scusto += custo;
            spreco += preco;
        }
        
        if (qproduto > 0) {
            double mediaPrecoCusto = scusto / qproduto;
            double mediaPrecoNovo = spreco / qproduto;
            
            System.out.println("\nmedia do custo: " + mediaPrecoCusto);
            System.out.println("media dos preco: " + mediaPrecoNovo);
        } else {
            System.out.println("Nenhum produto foi registrado.");
        }
        
        scanner.close();
    }
}






