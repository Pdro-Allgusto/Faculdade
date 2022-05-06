import java.util.Scanner;

public class exe1c13 {

	public static void main(String[] args) {  
	Scanner teclado = new Scanner(System.in);
	double x1,x2,y1,y2,distancia;
	System.out.print("Informe X1: ");
	x1 = teclado.nextDouble();
	System.out.print("Informe y1: ");
	y1 = teclado.nextDouble();
	System.out.print("Informe X2: ");
	x2 = teclado.nextDouble();
	System.out.print("Informe y2: ");
	y2 = teclado.nextDouble();
	distancia=Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2));
	System.out.println("Distância = "+distancia);
	teclado.close();
	}

}
