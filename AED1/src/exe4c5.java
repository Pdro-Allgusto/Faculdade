import java.util.Scanner;
public class exe4c5 {
	public static void main(String[] args) {
	double x1, x2, y1, y2, distancia;
	Scanner teclado = new Scanner(System.in);
	System.out.println("O programa vai calcular a distância entre dois pontos");
	System.out.print("Informe o X do ponto1: ");
	x1 = teclado.nextDouble();
	System.out.print("Informe o Y do ponto1: ");
	y1 = teclado.nextDouble();
	System.out.print("Informe o X do ponto2: ");
	x2 = teclado.nextDouble();
	System.out.print("Informe o Y do ponto2: ");
	y2 = teclado.nextDouble();
	distancia = Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
	System.out.println("Distância: "+distancia);
	teclado.close();
	}

}
