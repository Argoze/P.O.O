
package aula3;

import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);

        System.out.print("digite uma palavra: ");
        String inputString = scanner.nextLine();

        System.out.print("qual letra deseja marcar: ");
        char letra = scanner.next().charAt(0);

        int conta = conta(inputString, letra);
        System.out.println("a letra '" + letra + "' aparece " + conta + " vezes na palavra");

        scanner.close();
    }

    public static int conta(String str, char letra) {
        int contagem = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letra) {
                contagem++;
            }
        }

        return contagem;
    }
}
