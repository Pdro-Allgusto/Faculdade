import java.util.Scanner;
public class exe3c4 {
	public static void main(String[] args) {
		long poluentes1, poluentes2;
		double multa1, multa2, multa3;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Valor menor de poluentes: ");
		poluentes1 = teclado.nextLong();
		System.out.print("Valor maior de poluentes: ");
		poluentes2 = teclado.nextLong();
		System.out.print("Valor menor da multa: ");
		multa1 = teclado.nextDouble();
		System.out.print("Valor médio da multa: ");
		multa2 = teclado.nextDouble();
		System.out.print("Valor maior da multa: ");
		multa3 = teclado.nextDouble();
		System.out.println("___________________________________________________");
		System.out.println("  Quantidade de Poluente Emitido x Valor da Multa");
		System.out.println("---------------------------------------------------");
		System.out.println("Até "+poluentes1+" multa de R$"+multa1);
		System.out.println("---------------------------------------------------");
		System.out.println("Acima de "+poluentes1+" até "+poluentes2+" multa de R$"+multa2);
		System.out.println("---------------------------------------------------");
		System.out.println("Acima de "+poluentes2+" multa de R$"+multa3+" por poluente emitido");
		System.out.println("___________________________________________________");
		teclado.close();
	}

}
