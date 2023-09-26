
import java.util.Scanner;


public class ProvaMain {

    public static void main(String[] args) {
       Scanner scan = new Scanner (System.in);
       ProvaClasse prova = new ProvaClasse();
       String op = "";
       do{
           System.out.println("1-Cadastrar\n2-Mostrar\n3-Sair");
           op = scan.next();
       
           switch(op){
               case "1":
                   System.out.println("qual o nome do veterinario:");
                   String nome = scan.next();
                   
                   System.out.println("qual o crmv");
                   String crmv = scan.next();
                   
                   System.out.println("qual o genero H para homem M para mulher");
                   char genero = scan.next().charAt(0);
                   
                   System.out.println("qual o valor da consulta ");
                   double valorConsulta = scan.nextDouble();
                   
                   prova.setNome(nome);
                   prova.setCrmv(crmv);
                   prova.setGenero(genero);
                   prova.setValorConsulta(valorConsulta);
                   break;
               case "2":    
                   System.out.println("Digite o numero de consultas: ");
                   int qtdConsultas = scan.nextInt();
                   
                   System.out.println(prova.imprimir(qtdConsultas));
                   
                   break;
               case "3":
                   System.out.println("acabou");
                   break;
               default:
                   System.out.println("nao temos esta op ");
           }
        
    }while (!op.equals("3"));
    
}
}
