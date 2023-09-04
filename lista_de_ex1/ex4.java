package lista_de_ex1;


import java.util.Scanner;
public class ex4 {

    public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
        int soma=0;
        int quantidade=0;
            
            System.out.println("digite o numero par para a media (caso queira sair digite 0)");
            
        while (true) {
int numero=scanner.nextInt();            
            if (numero == 0){
                break;
            }
       
            if (numero %2 == 0) {
               soma += numero;
               quantidade++;

            }else{
                System.out.println("o numero nao e par");
                break;
            }
             
        }
            if (quantidade > 0) {
                float media = soma/quantidade;
                System.out.println("media dos numeros pares: " + media);
            } else{
                System.out.println("nao tem numero");
            }
           
  scanner.close();  
}
    
}
