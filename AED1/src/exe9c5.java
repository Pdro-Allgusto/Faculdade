import java.util.Scanner;
public class exe9c5 {
	public static void main(String[] args) {
	double media, nota1, nota2, nota3;
	Scanner teclado = new Scanner(System.in);
	System.out.println("O programa vai calcular a média ponderada com peso 2,3,5");
	System.out.print("Nota com peso 2: ");
	nota1 = teclado.nextDouble();
	System.out.print("Nota com peso 3: ");
	nota2 = teclado.nextDouble();
	System.out.print("Nota com peso 5: ");
	nota3 = teclado.nextDouble();
	media = (nota1*2+nota2*3+nota3*5)/10;
	System.out.println("Média: "+media);
	teclado.close();
	}

}
