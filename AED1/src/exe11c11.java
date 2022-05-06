import java.util.Scanner;

public class exe11c11 {

	public static void main(String[] args) {
	int numero;
	Scanner teclado = new Scanner(System.in);
	System.out.print("Informe um número inteiro entre 1 e 9 : ");
	numero = teclado.nextInt();
	for (int aux = 1; aux <= numero; aux ++) {
		if(aux>1)
		System.out.println("");
		for (int aux1 = 1; aux1 <= aux; aux1 ++) {
			System.out.print(aux1+" ");
			
		}
	}
	teclado.close();
	}

}
