package lista_de_ex1;

import java.util.Scanner;


public class ex2 {


    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);      
        int voto1 = 0;
        int voto2 =0 ;
        int voto3 = 0;
        int voto4 = 0;
        int votosnulos = 0;
        int votosembranco = 0;
        
        System.out.println("figitr o numero do seu candidato entre 1 e 4, 5 para nulo e 6 para branco ");
        
        while (true) {
            int voto = scanner.nextInt();
            
            if (voto == 0) {
                break; 
            }
            
            switch (voto) {
                case 1: voto1++;
                break;
                case 2: voto2++;
                break;
                case 3: voto3++;
                break;
                case 4: voto4++;
                    break;
                case 5:
                    votosnulos++;
                    break;
                case 6:
                    votosembranco++;
                    break;
                default:
                    System.out.println("nao tem esse candidato.");
            }
        }
        
        System.out.println("Total de votos para cada candidato:");
        
            System.out.println("votos do 1 candidato:"+ voto1);
            System.out.println("votos do 2 candidato:"+ voto2);
            System.out.println("votos do 3 candidato:"+ voto3);
            System.out.println("votos do 4 candidato:"+ voto4);
            System.out.println("votos nulos: " + votosnulos);
            System.out.println("votos em branco: " + votosembranco);
        
        scanner.close();
    }  
    }