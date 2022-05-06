import java.util.Scanner;
public class exe5c5 {
	public static void main(String[] args) {
	double celsius, kelvin, fahrenheit;
	Scanner teclado = new Scanner(System.in);
	System.out.println("O programa vai calcular a conversão de Celcius para Kelvin e Fahrenheit");
	System.out.print("Informe a temperatura em Celsius: ");
	celsius = teclado.nextDouble();
	kelvin = celsius+273;
	fahrenheit = 9*celsius/5+160/5;
	System.out.println("Kelvin: "+kelvin+"\nFahrenheit: "+fahrenheit);
	teclado.close();
	}

}
