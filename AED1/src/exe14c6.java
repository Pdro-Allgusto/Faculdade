import java.util.Scanner;
public class exe14c6 {
	public static void main(String[] args) {
	long numero, n1, n2, n3, n4;
	Scanner teclado = new Scanner(System.in);
	System.out.println("O programa vai leia um número inteiro de 4 dígitos, e imprir de trás para frente");
	System.out.print("Coloque um número inteiro de 4 dígitos: ");
	numero = teclado.nextLong();
	if(numero<=9999 && numero>=1000) {
		n1 = numero/1000;
		n2 = numero/100%10;
		n3 = numero/10%10;
		n4 = numero%10;
		System.out.println(n4+""+n3+""+n2+""+n1);
	}else
		System.out.println("O número não tem o necessario");
	teclado.close();	
	}

}
