import java.util.Scanner;

public class exe2c13 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	double x,funcao;
	System.out.println("Para finalizar digite -1 em X");
	do {
		System.out.print("Informe o valor de X: ");
		x = teclado.nextDouble();
		if (x!=-1) {
			if(x==4) {
				System.out.println("f(x) = 0");
			}else
				if(x<4) {
					funcao=(5*x+3)/Math.sqrt(16-Math.pow(x, 2));
					System.out.println("f(x) = "+funcao);
				}else
					if(x>4) {
						funcao=(5*x+3)/Math.sqrt(Math.pow(x, 2)-16);
						System.out.println("f(x) = "+funcao);
					}
			
		}
	}while(x!=-1);
	teclado.close();
	}

}
