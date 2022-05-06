import java.util.Scanner;
public class exe7c5 {
	public static void main(String[] args) {
	double x, funcao;
	Scanner teclado = new Scanner(System.in);
	System.out.println("O programa vai calcular uma formula");
	System.out.print("Informe o X: ");
	x = teclado.nextDouble();
	funcao = Math.sqrt(Math.pow(x/4+1, 2)+x/5);
	System.out.println("Resposta: "+funcao);
	teclado.close();
	}

}
