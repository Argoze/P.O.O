package javaapplication16;

import java.util.Scanner;

public class aula3teste2 {

   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         
        int num1=0;
        int num2 =0;
        char operador;
        System.out.println("diga o numero 1");
        num1 = scan.nextInt();
        System.out.println("diga o numero 2");
        num2 = scan.nextInt();
        System.out.println("diga o operador");
        operador =  scan.next().charAt(0);
        calculadora (num1,num2,operador);
        System.out.println("resultado"+resultado);
        
    }
        public static int calculadora(int num1, int num2, char operador) {
            
            int resultado = 0;
             switch(operador){
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
               resultado = num1 / num2;
             break;
             }
        return resultado;
        }
}
    
    

