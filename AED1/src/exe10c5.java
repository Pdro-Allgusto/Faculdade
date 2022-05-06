import java.util.Scanner;
public class exe10c5 {
	public static void main(String[] args) {
	long numero, n1, n2, n3, n4, n5;
	Scanner teclado = new Scanner(System.in);
	System.out.println("O programa vai colocar o número em vertical");
	System.out.print("Informe um número com 5 dígitos: ");
	numero = teclado.nextLong();
	n1 = numero/10000;
	n2 = numero/1000%10;
	n3 = numero/100%10;
	n4 = numero/10%10;
	n5 = numero%10;
	System.out.println("Impressão=\n"+n1+"\n"+n2+"\n"+n3+"\n"+n4+"\n"+n5);
	teclado.close();
	}

}
