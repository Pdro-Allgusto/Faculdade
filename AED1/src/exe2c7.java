import java.util.Scanner;
public class exe2c7 {
	public static void main(String[] args) {
	int nota1, nota2, nota3, media;
	Scanner teclado = new Scanner(System.in);
	System.out.println("O programa vai ler as notas de um aluno e falar o conceito do aluno");
	System.out.print("Informe nota 1: ");
	nota1 = teclado.nextInt();
	System.out.print("Informe nota 2: ");
	nota2 = teclado.nextInt();
	System.out.print("Informe nota 3: ");
	nota3 = teclado.nextInt();
	media = (nota1+nota2+nota3)/3;
	switch (media) {
	case 9: case 10:
		System.out.println("Conceito A");
		break;
	case 8:
		System.out.println("Conceito B");
		break;
	case 7:
		System.out.println("Conceito C");
		break;
	case 5: case 6:
		System.out.println("Conceito D");
		break;
	default:
		System.out.println("Conceito E");
		break;
	}
	teclado.close();
	}

}
