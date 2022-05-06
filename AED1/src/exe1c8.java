import java.util.Scanner;
public class exe1c8 {
	public static void main(String[] args) {
	double pi, area, raio;
	System.out.println("O programa vai calcular a área de 10 círculos");
	pi = 3.1416;
    Scanner teclado = new Scanner(System.in);
    for(int rep=1; rep<=10; rep++) {
    	System.out.print("Informe o raio: ");
    	raio = teclado.nextDouble();
    	area = pi*Math.pow(raio, 2);
    	System.out.println("Área = "+ area);
    	System.out.println("---------------------------------------------");
    }
    System.out.println("O programa acabou");
    teclado.close();
	}

}
