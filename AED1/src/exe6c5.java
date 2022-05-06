import java.util.Scanner;
public class exe6c5 {
	public static void main(String[] args) {
	double a, b, c, x, y, distancia;
	Scanner teclado = new Scanner(System.in);
	System.out.println("O programa vai calcular a distância na reta");
	System.out.print("Informe o X do ponto: ");
	x = teclado.nextDouble();
	System.out.print("Informe o y do ponto: ");
	y = teclado.nextDouble();
	System.out.print("Informe o valor A da reta: ");
	a = teclado.nextDouble();
	System.out.print("Informe o valor B da reta: ");
	b = teclado.nextDouble();
	System.out.print("Informe o valor C da reta: ");
	c = teclado.nextDouble();
	distancia = (a*x+b*y+c)/Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
	System.out.println("Distância: "+distancia);
	teclado.close();
	}

}
