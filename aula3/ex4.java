
package aula3;


public class ex4 {

  
    public static void main(String[] args) {
 double celsius = 25.0; // Substitua com a temperatura em Celsius que deseja converter
        double fahrenheit = convert(celsius);

        System.out.println(celsius + " graus celsius =  a " + fahrenheit + " graus fahrenheit.");
    }

    public static double convert(double celsius) {
        double fahrenheit = (celsius * 9/5) + 32;
        return fahrenheit;
    }
}








