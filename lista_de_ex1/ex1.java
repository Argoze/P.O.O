package lista_de_ex1;

import java.util.Scanner;


public class ex1 {

  
    public static void main(String[] args) {
            
        Scanner scanner = new Scanner(System.in);
        
        int totalnumero = 0;
        int somanumero = 0;
        
        System.out.println("diga qual os valores que voce deseja para fazer a media ");
        System.out.println("caso tenha acabado os numeros digite um valor negativo");
        
        while (true) {
            int numero = scanner.nextInt();
            
            if (numero < 0) {
                break; 
            }
            
            somanumero += numero;
            totalnumero++;
        }
        
        if (totalnumero > 0 ) {
            double media = (double) somanumero / totalnumero;
            System.out.println("a media dos valores eh: " + media);
        } else {
            System.out.println("nenhum valor válido foi inserido.");
        }
        
        }
    }
    

