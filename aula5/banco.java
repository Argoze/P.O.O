
package aula5;


public class banco {
   
    private String id;
    private double saldo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }
    
  public void depositar (double valor){
      saldo += valor;
      
  }
  public void sacar (double valor){
      if(valor>saldo){
          System.out.println("sem valor na conta");
      }
      else{
      saldo -= valor;
      }
  }
}
