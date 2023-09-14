
package aula5;


public class mainbanco {

    public static void main(String[] args) {
       
        banco conta = new banco();
        
        conta.depositar(1000);
        System.out.println("saldo:"+conta.getSaldo());
        
        conta.sacar(100);
        System.out.println("saldo:"+conta.getSaldo());
        
        conta.sacar(10000000);
        System.out.println("saldo:"+conta.getSaldo());
        
    }
    
}
