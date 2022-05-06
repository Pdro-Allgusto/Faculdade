import java.util.Scanner;
public class exe2c5 {
	public static void main(String[] args) {	
	double pi, raio, area, volume;
	Scanner teclado = new Scanner(System.in);
	System.out.println("O programa vai calcular a área e o volume de uma esfera");
	System.out.print("Informe o raio: ");
	raio = teclado.nextDouble();
	pi = 3.1416;
	area = 4*pi*Math.pow(raio,2);
	volume = Math.pow(raio, 3)*pi*4/3;
	System.out.println("Área: "+area+"\nVolume: "+volume);
	teclado.close();
	}

}
