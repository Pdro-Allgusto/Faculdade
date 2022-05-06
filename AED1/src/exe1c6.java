import java.util.Scanner;
public class exe1c6 {
	public static void main(String[] args) {
	double funcao, x;
	Scanner teclado = new Scanner(System.in);
	System.out.print("Coloque o valor de X: ");
	x = teclado.nextDouble();
	if(x<4)
		funcao = (5*x+3)/Math.sqrt(16-Math.pow(x, 2));
	else
		if(x==4)
			funcao = 0;
		else 
			funcao = (5*x+3)/Math.sqrt(Math.pow(x, 2)-16);
	System.out.println("O valor da função é: "+funcao);
	teclado.close();
	}

}
