import java.util.Scanner;
public class exe3c7 {
	public static void main(String[] args) {
	int dias;
	double multa, imposto;
	Scanner teclado = new Scanner(System.in);
	System.out.println("O programa vai calcular quanto vai pagar de acordo com o atraso");
	System.out.print("Informe o valor do imposto: ");
	imposto = teclado.nextDouble();
	System.out.print("Informe o número de dias de atraso: ");
	dias = teclado.nextInt();
	switch (dias) {
	case 1: case 2: case 3: case 4: case 5:
		multa = 0;
		System.out.println("Multa: "+multa);
		break;
	case 6:  case 7: case 8:
		multa = imposto*0.02;
		System.out.println("Multa: "+multa);
		break;
	case 9: case 10:
		multa = imposto*0.1+dias*0.5;
		System.out.println("Multa: "+multa);
		break;
	default:
		multa = imposto*1.5+dias*1;
		System.out.println("Multa: "+multa);
		break;
	}
	teclado.close();
	}

}
